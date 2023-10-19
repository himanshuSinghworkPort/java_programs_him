import java.io.*;
import java.util.*;
class Test_age_gender
{
public static void main(String[] arg)
{
System.out.println("enter your age");
int age;
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
System.out.println("enter your gender");
String gender;
Scanner sc1=new Scanner(System.in);
gender=sc1.nextLine();
if(age>=60)
{
System.out.println("ELIGIBLE FOR MEMBERSHIP");
System.out.println("DISCOUNT IS 50%");
}
else if(age>=18)
{
System.out.println("ELIGIBLE FOR MEMBERSHIP");

if(gender.equalsIgnoreCase("f"))
{
System.out.println("DISCOUNT IS 20%");
}
else if(gender.equalsIgnoreCase("m") )
{
System.out.println("DISCOUNT IS 10%");
}
}
else
{
System.out.println("NOT ELIGIBLE FOR MEMBERSHIP");
}
}










}