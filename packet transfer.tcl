set ns [new Simulator]


set nf [open out.nam w]
$ns namtrace-all $nf


set nt [open out.tr w]
$ns trace-all $nt


proc finish {} {
        global ns nf
        $ns flush-trace
        close $nf
        exec nam out.nam &
        exit 0
        }


set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]


$ns duplex-link $n0 $n1 10Mb 10ms DropTail
$ns duplex-link $n1 $n2 1Mb 10ms DropTail
$ns duplex-link $n3 $n1 10Mb 10ms DropTail


$ns duplex-link-op $n0 $n1 orient right-down
$ns duplex-link-op $n1 $n2 orient right
$ns duplex-link-op $n3 $n1 orient right-up


set tcp [new Agent/TCP]
$ns attach-agent $n0 $tcp


set ftp [new Application/FTP]
#$ftp set packet_size_ 4.5Mb
$ftp set interval_ 0.05
$ftp attach-agent $tcp


set sink [new Agent/TCPSink]
$ns attach-agent $n2 $sink


$ns connect $tcp $sink


$ns at 0.3 "$ftp start"
$ns at 3.0 "finish"


$ns run