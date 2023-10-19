// Finally block....Imp. to know..
// Automatically killing Arithmetic Exception...


class Ehandling7
{
static int show()
{
try
{
int x=10/0;
System.out.println(x);

}
catch(ArithmeticException e)
{
System.out.println(e);

}
finally
{
System.out.println("divide by zero not possible");
}
return 10;
}
public static void main(String s[])
{

int x=show();
System.out.println(x);
}
}


