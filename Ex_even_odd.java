import java.util.Scanner;
class Ex_even_odd
{

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
Ex_even_odd no=new Ex_even_odd();
System.out.println("enter the input number");
int i=sc.nextInt();
if(i%2==0)
	{
	System.out.println("the number "+i+" is even");
	}
else
	{
	System.out.println("the number "+i+" is odd");
	} 
}
}