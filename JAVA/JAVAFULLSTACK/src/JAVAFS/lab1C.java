package JAVAFS;
class Rectange
{
	int width;
	int height;
	int area;
	int perimeter;
	Rectange(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	void calculatearea()
	{
		
		area=width*height;
	}
	void calculateperimeter()
	{
		
		perimeter=2*(width+height);
	}
	void display()
	{
		System.out.println("Area is:"+area);
		System.out.println("Perimeter is:"+perimeter);
		
	}
}
public class lab1C 
{
  public static void main(String[] args)
  {
	  Rectange obj=new Rectange(10,20);
	  obj.calculatearea();
	  obj.calculateperimeter();
	  obj.display();
  }
}
