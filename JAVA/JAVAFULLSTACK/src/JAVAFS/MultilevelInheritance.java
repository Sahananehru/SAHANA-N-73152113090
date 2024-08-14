package JAVAFS;

class Vehicles{
	 void noOfEngine() {
		 System.out.println("I have an Engine");
	 }
	}
	 class TwoWheelers extends Vehicles{
		 void noOfWheels() {
	     System.out.println("I have two wheels.");
		 }
	 }
		 class Bikes extends TwoWheelers{
			 void brandName() {
			 System.out.println("Brand Nmae is Honda");
			 }
		 }
public class MultilevelInheritance {
	public static void main(String[] args) {
		Bikes bike=new Bikes();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}
}

