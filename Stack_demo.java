//syntax:public class Stack<e>extends Vector<e>
import java.util.Stack;
import java.util.EmptyStackException;

public class Stack_demo
{
static void pushvalue(Stack st,int val)
{
st.push(val);
System.out.println("Pushed("+val+")");
System.out.println("Pushed("+val+")");
System.out.println("Stack:"+st);
}

static void popvalue(Stack st)
{
System.out.println("POPPED->");
Integer val=(Integer)st.pop();
System.out.println("val");
System.out.println("stack:"+st);
}
public static void main(String[] args)
{
Stack st1=new Stack();
System.out.println("stack:"+st1);
pushvalue(st1,0002);
pushvalue(st1,0003);
pushvalue(st1,0004);
popvalue(st1);
popvalue(st1);
try
{
popvalue(st1);
}
catch(EmptyStackException e)
{
System.out.print("error:stack is empty");
}
}

}