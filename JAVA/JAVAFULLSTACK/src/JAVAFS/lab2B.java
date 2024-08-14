package JAVAFS;
class Vechiles{
	void drives() 
	{
	  System.out.println("Repairing a car");	
	}
}
class Car extends Vechiles{
	void print() {
		System.out.println("Inheriting from parent class.");
	}
}
public class lab2B {
   public static void main(String[] args)
   {
	  Car obj=new Car();
	  obj.print();
	  obj.drives();
   }
}
