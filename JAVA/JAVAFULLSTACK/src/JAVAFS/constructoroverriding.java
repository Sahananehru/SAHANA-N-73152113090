package JAVAFS;

public class constructoroverriding {
	constructoroverriding(String name){
		System.out.println("Welcome "+name);
	}
	constructoroverriding(int a,int b)
	{
		System.out.println("Sum :"+(a+b));
	}
	constructoroverriding(int n)
	{
		System.out.println("Sum :"+(n+n));
	}
	public static void main(String[] args)
	{
		constructoroverriding obj1=new constructoroverriding("Sahana");
		constructoroverriding obj2=new constructoroverriding(10,20);
		constructoroverriding obj3=new constructoroverriding(5);
	}
}
