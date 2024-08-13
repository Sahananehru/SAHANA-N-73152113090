package JAVAFS;

public class typesofvariable {
	//instance or object variable
	int b=20;
	//static variable
	static int c=30;
public static void main(String[] args)
{
	//local variable
	int a =10;
	System.out.println("Local Variable:"+a);
	typesofvariable obj=new typesofvariable();
	System.out.println("Instance variable:"+obj.b);
	System.out.println("Static variable:"+typesofvariable.c);
}
}
