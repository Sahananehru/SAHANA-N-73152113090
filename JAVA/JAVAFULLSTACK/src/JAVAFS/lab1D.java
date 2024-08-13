package JAVAFS;
import java.util.Scanner;
class circle
{
	int radius;
	float area;
	float circumference;
	float pi=3.14f;
	circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		area=pi*radius*radius;
	}
	void circumference()
	{
		circumference=2*pi*radius;
	}
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		circumference=sc.nextFloat();
	}
	
	void display() {
		System.out.println("Area:"+area);
		System.out.println("Circumference:"+circumference);
	}
}
public class lab1D {
	public static void main(String[] args)
	{
		circle obj=new circle(4);
		obj.area();
		obj.circumference();
		obj.display();
     	obj.setvalue();
		obj.display();
	}

}
