import java.util.*;
class IP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		int b[] = new int[8];
		int d[] = new int[8];
		int e[] = new int[8];
		int ac[] = new int[8];
		int bc[] = new int[8];
		int dc[] = new int[8];
		int ec[] = new int[8];
		int i;
		System.out.print("Enter The IP address in binary: ");
		for (i = 0; i < 8; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < 8; i++)
			b[i] = sc.nextInt();
		for (i = 0; i < 8; i++)
			d[i] = sc.nextInt();
		for (i = 0; i < 8; i++)
			e[i] = sc.nextInt();
		System.out.print("\nIP ADDRESS: ");
		for (i = 0; i < 8; i++)
			System.out.print(a[i]);
		System.out.print("   ");
		for (i = 0; i < 8; i++)
			System.out.print(b[i]);
		System.out.print("   ");
		for (i = 0; i < 8; i++)
			System.out.print(d[i]);
		System.out.print("   ");
		for (i = 0; i < 8; i++)
			System.out.print(e[i]);
		System.out.print("\nThe IP address is in : ");
		if (a[0] == 0)
			System.out.print("Class A\n");
		else if (a[0] == 1 && a[1] == 0)
			System.out.print("Class B\n");
		else  if (a[0] == 1 && a[1] == 1  && a[2] == 0)
			System.out.print("Class C\n");
		else if (a[0] == 1 && a[1] == 1  && a[2] == 1 && a[3] == 0)
			System.out.print("Class D\n");
		else if (a[0] == 1 && a[1] == 1  && a[2] == 1 && a[3] == 1)
			System.out.print("Class E\n");


		if (a[0] == 0) {
			System.out.print("Default Subnet Mask: 11111111 00000000 00000000 00000000");
			for (i = 0; i < 8; i++)
				ac[i] = a[i] & 1;
			System.out.print("\nSubnet Mask: ");
			for (i = 0; i < 7; i++)
				System.out.print(ac[i]);
			System.out.print(" 00000000 00000000 00000000");
			System.out.print("\nFirst address: ");
			for (i = 0; i < 8; i++)
				System.out.print(a[i]);
			System.out.print(" ");
			System.out.print(" 00000000 00000000 00000000");
			System.out.print("\nLast address: ");
			System.out.print(" 00000000 ");
			for (i = 0; i < 8; i++)
				System.out.print(b[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(d[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(e[i]);
		}
		if (a[0] == 1 && a[1] == 0) {
			System.out.print("Default subnet Mask: 11111111 11111111 00000000 00000000");
			for (i = 0; i < 8; i++) {
				ac[i] = a[i] & 1;
				bc[i] = b[i] & 1;
			}
			System.out.print("\nSubnet Mask: ");
			for (i = 0; i < 8; i++)
				System.out.print(ac[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(bc[i]);
			System.out.print(" 00000000 00000000 ");
			System.out.print("\nFirst Address: ");
			for (i = 0; i < 8; i++)
				System.out.print(a[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(b[i]);
			System.out.print(" 00000000 00000000");
			System.out.print("\nLast Address: ");
			System.out.print("00000000 00000000 ");
			for (i = 0; i < 8; i++)
				System.out.print(d[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(e[i]);
		}
		if (a[0] == 1 && a[1] == 1  && a[2] == 0) {
			System.out.print("Default subnet Mask: 11111111 11111111 11111111 00000000");
			for (i = 0; i < 8; i++) {
				ac[i] = a[i] & 1;
				bc[i] = b[i] & 1;
				dc[i] = d[i] & 1;
			}
			System.out.print("\nSubnet Mask: ");
			for (i = 0; i < 8; i++)
				System.out.print(ac[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(bc[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(dc[i]);
			System.out.print(" 00000000");
			System.out.print("\nFirst address: ");
			for (i = 0; i < 8; i++)
				System.out.print(a[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(b[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(d[i]);
			System.out.print(" 00000000");
			System.out.print("\nLast address:\t\t");
			System.out.print("00000000 00000000 00000000 ");
			for (i = 0; i < 8; i++)
				System.out.print(e[i]);
		}
		if (a[0] == 1 && a[1] == 1  && a[2] == 1) {
			System.out.print("Default subnet Mask: 11111111 11111111 11111111 11111111");
			for (i = 0; i < 8; i++) {
				ac[i] = a[i] & 1;
				bc[i] = b[i] & 1;
				dc[i] = d[i] & 1;
				ec[i] = e[i] & 1;
			}
			System.out.print("\nSubnet Mask: ");
			for (i = 0; i < 8; i++)
				System.out.print(ac[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(bc[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(dc[i]);
			System.out.print("   ");
			for (i = 0; i < 8; i++)
				System.out.print(ec[i]);
		}
		System.out.println();
	}
}
