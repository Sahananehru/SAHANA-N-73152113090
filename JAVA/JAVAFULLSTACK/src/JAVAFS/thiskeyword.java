package JAVAFS;
public class thiskeyword 
{
  String name;
  thiskeyword(String name){
	  this.name=name;
	  this.greeting();
  }
  thiskeyword(int a ,int b){
	  System.out.println("Addition:"+(a+b));
  }
  void greeting() {
	  System.out.println("Welcome "+name);
  }
  public static void main(String[] args)
  {
	  thiskeyword obj=new thiskeyword("Sahana");
  }
}
