
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
class Test_Emp_Data_collection
{
public static void main(String[] args)throws IOException
{
int idd;
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER OF EMPLOYEES FOR WHICH YOU WANT TO STORE THE DATA");
int no=sc.nextInt();
ArrayList<Emp> arr=new ArrayList<Emp>();
for(int i=0;i<no;i++)
{
System.out.println("enter id no");
int id=Integer.parseInt(br.readLine());
System.out.println("enter name:");
String name=br.readLine();
Emp ob=new Emp(id,name);
arr.add(ob);
} 
System.out.println("ENTER ID TO SEARCH");
idd=Integer.parseInt(br.readLine());
boolean found=false;
for(int i=0;i<arr.size();i++)
{
Emp obj=arr.get(i); 
if(idd==obj.id)
{
obj.display();
found=true;
}
}


}
}