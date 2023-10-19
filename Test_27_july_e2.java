import java.util.Scanner;
class Arthm
	{
	int i,j;
	int z=0;
	void input_val()
	{

	System.out.println("enter variable value1: ");
	Scanner sc=new Scanner(System.in);
	this.i=sc.nextInt();
	System.out.println("enter variable value2: ");
	Scanner sc1=new Scanner(System.in);
	this.j=sc1.nextInt();
	}
	void arth_op_add()
	{
	//this.z=z;
	this.z=this.i+this.j;
	System.out.println("the addition is "+this.z);
	
	
	}
	}

	
class Test_27_july_e2
{
public static void main(String[] arg)
	{
	Arthm ob=new Arthm();
	ob.input_val();
	ob.arth_op_add();	
	}
}
