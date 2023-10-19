// encapsulation works with getter and setter methods
class Encapsulation_emp_EX
{
int id;
String name;
int salery;
public void set_id(int i)
{
this.id=i;
}
public int get_id()
{
return id;
}
public void set_name(String n)
{
this.name=n;
}
public String get_name()
{
return name;
}
public void set_salery(int s)
{
this.salery=s;
}
public int get_salery()
{
return salery;
}

public static void main(String[] args)
{
Encapsulation_emp_EX emp=new Encapsulation_emp_EX();
emp.set_id(001);
System.out.println(emp.get_id());
emp.set_name("himanshu");
System.out.println(emp.get_name());
emp.set_salery(20);
System.out.println(emp.get_salery());
}

}