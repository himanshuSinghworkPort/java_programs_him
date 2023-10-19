import java.util.Scanner;
class Ex_logical
{

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
//Ex_even_odd no=new Ex_even_odd();
System.out.println("enter the input number1:");
int i=sc.nextInt();
System.out.println("enter the input number2:");
int j=sc.nextInt();
if(i%2==0&&j%5==0)
	{
	System.out.println("the both no are divisible by 2 and 5");
	}
else 
	{
	System.out.println("the both no are not divisible by 2 and 5");
	} 
System.out.println("logical or explaination");
if(i%2==0||j%5==0)
	{
	System.out.println("the any of the  numbers are divisible by 2 and 5");
	}
else 
	{
	System.out.println("the any of the numbers are not divisible by 2 and 5");
	} 
System.out.println("logical not explaination");
if(i!=2)
{
System.out.println("the no i is not 2");
}


}
}