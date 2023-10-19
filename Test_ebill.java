import java.util.*;
class Commercial
{
public String name;
void setname(String name)
{
this.name=name;
}
String getname()
{
return name;
}
void calc_bill(int units)
{
System.out.println("customer name:"+getname());
System.out.print("bill amount:"+units*11.5);
}
}
class Domestic extends Commercial
{
void calc_bill(int units)
{
System.out.println("customer name:"+getname());
System.out.println("bill amount:"+units*7.5);
}
}
class Test_ebill
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter customer name for commercial account");
String n=sc.nextLine();
System.out.println("enter customer's unit details");
int u=sc.nextInt();
Commercial c=new Commercial();
c.setname(n);
c.getname();
c.calc_bill(u);
Scanner scc=new Scanner(System.in);
System.out.println("enter customer name for domestic account");
String nn=scc.nextLine();
System.out.println("enter customer's unit details");
int uu=scc.nextInt();
Domestic d=new Domestic();
d.setname(nn);
d.calc_bill(uu);
}
}
