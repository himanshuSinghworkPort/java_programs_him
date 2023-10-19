// storagre optimization. dynamically.search elements via index no. synchronised.

import java.util.Vector;
class VectorDemo
{
public static void main(String[] arg)
{
Vector<Object> v=new Vector<Object>();
v.addElement(3);
v.addElement(4);
v.addElement(5);
v.addElement(6);
v.addElement(7);
v.addElement(8);
System.out.println("vector elements are:"+v);
System.out.println("vector at pos 3:"+(Object)v.elementAt(2));
v.removeElementAt(0);
System.out.println("revised vector elements are:"+v);
}
}