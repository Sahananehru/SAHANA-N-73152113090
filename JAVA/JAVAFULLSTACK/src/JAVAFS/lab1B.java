package JAVAFS;
class dog{
	String dogname;
	String dogbreed;
	dog(String dogname,String dogbreed)
	{
		this.dogname=dogname;
		this.dogbreed=dogbreed;
	}
	void display()
	{
	  System.out.println("Dogname is:"+dogname);
	  System.out.println("Dogbree is:"+dogbreed);
	}
	public void setVariable(String dogname){
        this.dogname=dogname;
    }
    
}
public class lab1B 
{
  public static void main(String[] args)
  {
	  dog obj=new dog("meenu","labrador");
	  obj.display();
	  dog obj2=new dog("Sizzu","goldenretiver");
	  obj2.setVariable("meenu");
	  obj2.display();
	  
	  
  }
}
