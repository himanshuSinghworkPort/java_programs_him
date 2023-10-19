
import java.io.*;
import java.util.*;
class Phonebook_HashMap
{
public static void main(String[] arg)throws IOException
{
HashMap<String, Long> hm=new HashMap<String, Long>();
String name,str;
Long phno;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("1 enter phone entries:");
System.out.println("2 lookupin the book:");
System.out.println("3 display names in book:");
System.out.println("4 exit:");
System.out.println("your choice");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:    
	System.out.println("enter name");
	name=br.readLine();
	System.out.println("enter phone no");
	str=br.readLine();
	phno=new Long(str);
	hm.put(name,phno);
	break;
case 2:    
	System.out.println("enter name");
	name=br.readLine();
	name=name.trim();
	phno=hm.get(name);
	
	System.out.println("phone no is:"+phno);
	break;
case 3:
	Set<String> set=new HashSet<String>();
	set=hm.keySet();
	System.out.println(set);
	break;
case 4:
         return;

}
}
}
}