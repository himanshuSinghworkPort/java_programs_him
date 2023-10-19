class MyExcept extends Exception
{
public static int acc[]={1,2,3,4,5};
public static String name[]={"yogesh","yaseen","shubham","ritik","rohit","adarsh","harsh"};
public static int balence[]={2,3,4,6,7,8,9};
MyExcept()
{
}
MyExcept(String s)
{
super(s);
}
public static void main(String[] args)
{
try
{
System.out.println("acc no"+"\t"+"customer"+"\t"+"balence");
for(int i=0;i<5;i++)
{
System.out.println(acc[i]+"\t"+name[i]+"\t"+balence[i]);
if(balence[i]<=9)
{
MyExcept me=new MyExcept("balence is low");
throw me;
//System.out.println("acc no"+"\t"+"customer"+"\t"+"balence");
}
continue;
}
}
catch(MyExcept ee)
{
ee.printStackTrace();
}

}
}