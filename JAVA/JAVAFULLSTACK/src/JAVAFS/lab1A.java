package JAVAFS;

class Person
{
	int personage;
	String personname;
	Person(int personage,String personname)
	{
		this.personage=personage;
		this.personname=personname;
	}
	void display()
	{
		System.out.println("Age is:"+personage);
		System.out.println("Name is:"+personname);
	}
}
public class lab1A {
  public static void main(String[]args)
  {
	  Person obj=new Person(20,"Sahana");
	  Person obj1=new Person(30,"Shanmathi");
	  obj.display();
	  obj1.display();
	  
  }
}
