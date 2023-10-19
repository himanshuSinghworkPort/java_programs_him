import java.util.Scanner;
class Bit_Ex
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Bit_Ex ob=new Bit_Ex();
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("bitwise complement demonstration:");
System.out.println(~x); // bitwise complement. 1s complement.

System.out.println("bitwise and demonstration:");
System.out.println(x&y); //bitwise and
System.out.println("bitwise or demonstration:");
System.out.println(x|y); // bitwise or
System.out.println("bitwise xor demonstration:");
System.out.println(x^y);   // if we have odd no.s of 1 in input bits then the output is 1
System.out.println("enter the specified position number");
int z=sc.nextInt();
System.out.println("bitwise leftshift demonstration:");
System.out.println(x<<z);
System.out.println("bitwise right_shift demonstration:");
System.out.println(x>>z);
}
}
// 0000 1010
// 1111 0101


//10=0000 1010
//20=0001 0100
//   0001 1110xor =no of 1s odd o/p= 1
//   0000 0000and
//   0001 1110or

//bitwise leftshift
