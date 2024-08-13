package JAVAFS;
import java.util.Scanner;
class Employeen{
	String name;
	String jobtitle;
	int salary;
	int newsalary=1;
	int value;
	Employeen(String name,String jobtitle,int salary)
	{
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	void calculate()
	{
			newsalary=salary*12;
			value=newsalary;
		}
	void update()
	{
		 Scanner sc=new Scanner(System.in);
		 value=sc.nextInt();
	     value=newsalary+value;
	     System.out.println("Updated salary of employee:");
	     System.out.println("Name:"+name);
			System.out.println("Jobtitle:"+jobtitle);
	  	System.out.println("Updated salary:"+value);
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Jobtitle:"+jobtitle);
		System.out.println("Salary:"+newsalary);
	}
}
public class lab1F {
  public static void main(String[]args)
  {
	  Employeen obj=new Employeen("Sahana","SE",30000);
	  obj.calculate();
	  obj.display();
	  obj.update(); 
	  }
}
