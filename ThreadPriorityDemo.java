// thread priority demo
public class ThreadPriorityDemo
{
public static void main(String[] arg)
{
System.out.println("main thread started");
One t1 =new One();
Two t2 =new Two();
Three t3 =new Three();
t3.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(t1.getPriority()+1);
t1.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
t3.start();
try
{
t1.join();
t2.join();
t3.join();
}
catch(InterruptedException e)
{
System.out.println("main thread exited");
}
}}
class One extends Thread
{
public void run()
{
System.out.println("thread one started with priority:"+this.getPriority());
for(int num=0;num<5;num++)
{
System.out.println("value of num in thread one:"+num);
}
System.out.println("thread one exited");
}
}
class Two extends Thread
{
public void run()
{
System.out.println("thread TWO started with priority:"+this.getPriority());
for(int num=0;num<5;num++)
{
System.out.println("value of num in thread TWO is:"+num);
}
System.out.println("thread two exited");
}
}
class Three extends Thread
{
public void run()
{
System.out.println("thread three started with priority:"+this.getPriority());
for(int num=0;num<5;num++)
{
System.out.println("value of num in thread three:"+num);
}
System.out.println("thread three exited");
}
}
