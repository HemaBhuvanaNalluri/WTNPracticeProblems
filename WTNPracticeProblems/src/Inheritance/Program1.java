package Inheritance;

class Animal
{
    void eat(){
        int a=10,b=20;
        System.out.println("Animal eats "+(a+b));
    }
    void sleep(){
        int a=1,b=2;
        System.out.println("Animal sleeps "+(a+b)+" hours");
    }
}
class Bird extends Animal
{
    void eat(){
        int a=10,b=20;
        System.out.println("Bird eats "+(a*b));
    }
    void sleep(){
        int a=1,b=2;
        System.out.println("Bird sleeps "+(a*b)+" hours");
    }
    void fly(){
        int a=11,b=22;
        System.out.println("Bird flys "+(a+b)+" high");
    }
}
public class Program1
{
	public static void main(String[] args)
	{
	  Animal a=new Animal();
	  a.eat();
	  a.sleep();
	  Bird b=new Bird();
	  b.fly();
	  b.eat();
	  b.sleep();
    }
}
