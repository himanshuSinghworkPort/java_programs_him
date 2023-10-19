class Student
{
int reg_no;
int fees;
static String teacher="vineet";

public void show()
	{
	System.out.println(reg_no+":"+fees+":"+teacher);
	}
}

class Static_Demo
{
public static void main(String[] args)
{
Student yaseen=new Student();
yaseen.reg_no=001;
yaseen.fees=50000;
//Student.teacher;
Student shubham=new Student();
shubham.reg_no=002;
shubham.fees=5000;


Student niharika=new Student();
niharika.reg_no=002;
niharika.fees=150000;
//Student.teacher;
yaseen.show();
shubham.show();
niharika.show();
}
}