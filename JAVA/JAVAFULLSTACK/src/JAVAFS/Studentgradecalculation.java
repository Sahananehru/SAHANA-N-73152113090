package JAVAFS;
import java.util.Scanner;
class Student
{
	 int studentregno;
	 String studentname;
	 int arr[]=new int[5];
	 int sum;
	 int avg;
	 String grade;
	 void getMarks(){
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
	 }
	 void calculateGrade() 
	 {
		 for(int i=0;i<5;i++)
		 {
			 sum+=arr[i];
		 }
		 avg=sum/5;
		 if(avg>45)
		 {
			 grade="B+";
		 }
		 else if(avg<35)
		 {
			 grade="F";
		 }
		 else if(avg>85)
		 {
			 grade="A+";
		 }
	 }
	 void display() {
		 System.out.println("Sum is:"+sum);
		 System.out.println("Avg is:"+avg);
		 System.out.println("Studentregno:"+studentregno);
		 System.out.println("Studentname:"+studentname);
		 System.out.println("Grade is:"+grade);
	 }
	 Student(int studentregno,String studentname)
	 {
		 this.studentregno=studentregno;
		 this.studentname=studentname;
	 }
}
public class Studentgradecalculation
{
 public static void main(String[] args)
 {
	Student obj=new Student(101,"Sahana");
	obj.getMarks();
	obj.calculateGrade();
	obj.display();
 }
}
