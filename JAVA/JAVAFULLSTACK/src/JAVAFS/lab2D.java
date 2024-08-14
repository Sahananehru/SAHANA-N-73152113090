package JAVAFS;
class employee{
	void work() 
	{
	  System.out.println("Works");
	}
	void getSalary() {
		System.out.println("Salary of Employee");
	}
}
class HRManager extends employee{
	void addEmployee() {
		System.out.println("Employee added.");
	}
}
public class lab2D 
{
  public static void main(String[] args)
  {
	  HRManager obj=new HRManager();
	  obj.work();
	  
  }
}
