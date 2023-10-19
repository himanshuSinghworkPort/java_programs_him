/*
error :abnormal condition of execution of your program.
ArithmeticException
Arrayindexoutofboundexception
Stringindexoutofboundexception
illegalargumentexception
negativearraysizeexception
numberformatexception




*/
import java.util.*;
class exception_program1
{
public static void main(String[] args)
{
try
{
int a=100/0;

System.out.println(a);
 // infinite.
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.println("aadarsh");
}
try
{
int arr[]=new int[5];
arr[10]=245;

}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println(ae);
}
try
{
String s="yogesh";
int r=Integer.parseInt(s);
}
catch(NumberFormatException aee)
{
System.out.println(aee);
}
try
{
String s=null;
int rr=s.length();
System.out.println(rr);
}
catch(NumberFormatException aee)
{
System.out.println(aee);
}

}
}