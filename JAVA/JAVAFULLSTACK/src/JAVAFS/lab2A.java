package JAVAFS;
class Animal{
	void makeSound()
	{
		System.out.println("Bark");
		}
}
class Cat extends Animal
{
	void print() {
	System.out.println("Make sound");
	}
}
public class lab2A
{
	public static void main(String[] args) 
	{
	  Cat obj=new Cat();
	  obj.print();
	  obj.makeSound();
	}
}
