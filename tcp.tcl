set ns [new Simulator]
set nf [open test2.nam w]
$ns namtrace-all $nf
set server0 [$ns node]
set router1 [$ns node]
set client2 [$ns node]
$ns duplex-link $server0 $router1 2Mb 50ms DropTail
$ns duplex-link $router1 $client2 2Mb 50ms DropTail
set tcp [new Agent/TCP]
$ns attach-agent $server0 $tcp
set sink [new Agent/TCPSink]
$ns attach-agent $client2 $sink
$ns connect $tcp $sink
set ftp [new Application/FTP]
$ftp attach-agent $tcp
$ns at 1.0 "$ftp start"
$ns at 6.0 "$ftp stop"
proc finish {} {
	   global ns nf  
	   $ns flush-trace
	   close $nf		  
	   exec nam test2.nam &
	   exit 0
}
$ns at 10.0 "finish"
$ns run
