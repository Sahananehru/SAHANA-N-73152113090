package JAVAFS;

public class Methodoverloading
{
  void myMethod(String name) {
	  System.out.println("Welcome "+ name);
  }
  void myMethod(int a,int b) {
	  System.out.println("Sum:"+(a+b));
  }
  void myMethod(int n) {
	  System.out.println("Sum:"+(n+n));
  }
  public static void main(String[]args)
  {
	  Methodoverloading obj=new Methodoverloading();
	  obj.myMethod(5);;
	  obj.myMethod("Sahana");
	  obj.myMethod(10,20);
  }
}
