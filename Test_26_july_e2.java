/* 
class is blueprint for the reakl world entity.
object is real world entity
access modifier class class_name
{
data members;
methods;
}
exAMPLE:
*/
class Test_26_july_e2
{
int a=10;
int b=20;
void display()
{
System.out.println("this is programming");
}
public static void main(String[] arg)
{
// class_name object_name=new class_name();
	Test_26_july_e2 ob=new Test_26_july_e2();
	System.out.println(ob.a);
	System.out.println(ob.b);
	ob.display();
}
}