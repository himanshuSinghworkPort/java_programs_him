class Animal
{
static void wakeup()
{System.out.println("wake up");}
static void  eat()
{System.out.println("eats");}
static void  sleep()
{System.out.println("sleep");}
}
class Dog extends Animal
{
static void bark()
{System.out.println("barks");}
}
class Bird extends Animal
{
static void  fly()
{System.out.println("fly");}
}
public class Test05_aug
{
public static void main(String args[])
{
Dog sheru=new Dog();
Dog moti=new Dog();
sheru.wakeup();
sheru.eat();
sheru.bark();
sheru.sleep();
moti.wakeup();
moti.eat();
moti.bark();
moti.sleep();
Bird tweety=new Bird();
tweety.wakeup();
tweety.eat();
tweety.fly();
tweety.sleep();
}
}