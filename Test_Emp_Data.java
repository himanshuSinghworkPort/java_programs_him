import java.util.*;
import java.io.*;
class Emp
{
int id;
String name;
Emp(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println("id is: "+id+"\t name is:"+name);
}
}
class Test_Emp_Data
{
public static void main(String[] args)throws IOException
{
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER OF EMPLOYEES FOR WHICH YOU WANT TO STORE THE DATA");
int no=sc.nextInt();
Emp arr[]=new Emp[no];
for(int i=0;i<no;i++)
{
System.out.println("enter id no");
int id=Integer.parseInt(br.readLine());
System.out.println("enter name:");
String name=br.readLine();
arr[i]=new Emp(id,name);
} 
System.out.println("employee data is:");
for(int i=0;i<arr.length;i++)
{

arr[i].display();
} 


}
}