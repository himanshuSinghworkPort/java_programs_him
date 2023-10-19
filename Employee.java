class Employee
{
String name;
int id;
Employee()
{
name="raj";
id=1;
}
Employee(String s,int i)
{
name=s;
id=i;
}
void display()
{
System.out.println(name);
System.out.println(id);

}
public static void main(String[] args)
{
Employee raj=new Employee();
raj.display();
Employee simran=new Employee("simran",2);
Employee kabir=new Employee("kabir",3);
simran.display();
kabir.display();
}


}