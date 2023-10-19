import java.util.Scanner;
class Test_27_july2
{
	String str;
void str_input()
	{
	System.out.println("enter the string to input");
	
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	this.str=str;
	}
void str_display()
	{
	System.out.println("the input string is "+str);
	}
void str_replace()
	{
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the original charecter which you want to replace with");
	char rep_o=sc2.next().charAt(0);
	Scanner sc3=new Scanner(System.in);
	System.out.println("enter the replacement charecter which you want in your string");
	char rep_r=sc2.next().charAt(0);
	String str_rp=this.str.replace(rep_o,rep_r);
	System.out.println("the replaced string is");
	System.out.println(str_rp);
	}
void str_substring()
	{
	System.out.println("enter the index positions");
	int i=0,j=0;
	System.out.println("enter the first index of the substring");
	Scanner sc4=new Scanner(System.in);
	i=sc4.nextInt();
	System.out.println("enter the first index of the substring");
	Scanner sc5=new Scanner(System.in);
	j=sc5.nextInt();
	String str_sub=this.str.substring(i,j);
	System.out.println("the subString is "+str_sub);
	}
/* void comp()
	{
	System.out.println("enter the second string");
	Test_27_july2 ob1=new Test_27_july2();
	ob1.str_input();
	
	}
*/
	public static void main(String[] args)
	{
	Test_27_july2 ob=new Test_27_july2();
	ob.str_input();
	ob.str_display();
	ob.str_replace();
	ob.str_substring();
	
	
	}	
}
