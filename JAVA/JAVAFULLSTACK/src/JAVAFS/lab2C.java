package JAVAFS;

class Shape 
{
	int area;
	void getArea()
	{
		int len=5;
		int bredth=8;
		area=len*bredth;
	}
}
class Rectangle extends Shape{
	void print() {
		System.out.println("Area of Rectangle is:"+area);
	}
}
public class lab2C 
{
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.getArea();
		obj.print();

	}

}
