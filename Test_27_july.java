import java.util.Scanner;
class Test_27_july
{
    public static void main(String[] args)
    {
/*
        boolean b=true;
        System.out.println("program is reunnable"+b);

        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);

        System.out.println("enetr main string");
        String str=sc.nextLine();
        System.out.println(str);
//char charAt[int i] it is used to retrieve single charecter from string.

        System.out.println("enter the position which you want from string");
        int i=sc.nextInt();
	System.out.println(str.charAt(i));
contains: it is used to determine whether substring is a part of main string. string_main.contains(sub_string)
return type is boolean

        System.out.println("enetr substring");
        String str2=sc1.nextLine();
 	System.out.println(str.contains(str2));
        if(str.contains(str2))
        	{
        	System.out.println("it is a part of svinfotech");
        	}
        String[] split1=str.split(str2);
        System.out.println(split1);
        for(String obj:split1)
        	{
		System.out.print(obj);
            	System.out.print(" ");
        	}

//split it is used to seperate the given string into multiple strings seperated by delimeters
//indexOf: it is used to perform a search operation for a specific charecter or a substring on the main string.
		string_name.indexOf('character')

        
        System.out.println("enter the string for search operation");
	System.out.println("enter charecter which you want to perform operation");
        
	Scanner sc2=new Scanner(System.in);
        String c=sc2.nextLine();
        System.out.println("index of"+c+"is-"+str.indexOf(c));

// to string: converts the variable value to string.
        Integer ob=new Integer(10);
        String str=ob.toString();
        System.out.println(str);
// reverse: it reverses the string.
*/
	System.out.println("enter the string for reverse operation");
	Scanner sc3=new Scanner(System.in);
	//StringBuffer str_org=new StringBuffer(); 
	String str_org=sc3.nextLine();
	StringBuffer str_rev=new StringBuffer(str_org); 
	str_rev.reverse();
	System.out.println("the reverse of string "+str_org+" is "+str_rev);
	//if(str_org==str_rev)
	//{
	//System.out.println("the string are equal");
	//} 






    }
}