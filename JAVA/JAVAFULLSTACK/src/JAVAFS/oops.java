package JAVAFS;
 import java.util.Scanner;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	void display() {
		System.out.println("Employee Id:"+employeeId);
	    System.out.println("Employee Name:"+employeeName);
	    System.out.println("Employee Salary:"+employeeSalary);
	
	}
	}
 
public class oops 
{

  public static void main(String[] args)
  {
	 Employee emp1=new Employee(101,"Sahana",3000.0f);
	 emp1.display();
	 Employee emp2=new Employee(102,"Sharma",4000.0f);
	 emp2.display();
	 Employee emp3=new Employee(103,"Shannu",5000.0f);
	 emp3.display();
  }
}
