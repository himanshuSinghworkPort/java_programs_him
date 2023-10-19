class Animal
{
void mew()
	{
	System.out.println("mew");
	}


void wakeup()
	{
	System.out.println("wake up");
	}

void eat()
	{
	System.out.println("eating");
	}
void bark()
	{
	System.out.println("barking");
	}
void sleep()
	{
	System.out.println("sleeping");
	}	
	
}
class Bird extends Animal
	{
	void fly()
		{
		System.out.println("flying");
		}
	}
class Test_27_july_e
{

public static void main(String[] arg)
	{
	Animal dog=new Animal();
	Animal cat=new Animal();
	dog.wakeup();
	dog.eat();
	dog.bark();
	dog.sleep();
	cat.mew();
	cat.sleep();
	Bird eagle=new Bird();
	 eagle.wakeup();
	 eagle.eat();
	 eagle.fly();
	 eagle.sleep();
	}
	
}