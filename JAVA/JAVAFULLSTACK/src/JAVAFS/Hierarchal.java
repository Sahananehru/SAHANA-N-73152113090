package JAVAFS;
class Animals{
	void types() {
		System.out.println("Types of animal");
	}
}
class Wild extends Animals{
	void wildtype() {
		System.out.println("Lion");
	}
}
class Domestic extends Animals{
	void domestictype() {
		System.out.println("Dog");
	}
}
public class Hierarchal {
  public static void main(String[] args)
  {
	  Wild wild=new Wild();
	  wild.types();
	  wild.wildtype();
	  Domestic obj2=new Domestic();
	  obj2.domestictype();
  }
	
}
