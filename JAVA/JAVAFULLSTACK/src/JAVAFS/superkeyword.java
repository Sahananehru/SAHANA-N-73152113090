package JAVAFS;
class A{
	int a =10;
	A(String name){
		System.out.println("Welcome"+name);
	}
void myMethod1(){
	  System.out.println("I am a super class method");
	}
}
class B extends A{
	B(){
		super("Sahana");
	}
	void myMethod2() {
		System.out.println("Super class variable:"+super.a);
		super.myMethod1();
	}
}
public class superkeyword 
{
	public static void main(String[] args)
	{
    B b=new B();
    b.myMethod2();
}
}
