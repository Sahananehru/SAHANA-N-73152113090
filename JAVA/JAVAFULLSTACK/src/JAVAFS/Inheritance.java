package JAVAFS;

class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheels.");
		}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda.");
	}
}
public class Inheritance 
{
   public static void main(String[] args)
   {
	   Bike bike=new Bike();
	   bike.noOfWheels();
	   bike.brandName();
   }
}
