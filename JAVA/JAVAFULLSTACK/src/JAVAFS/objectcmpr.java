package JAVAFS;
import java.util.Scanner;
public class objectcmpr 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  Double x = new Double(123.45555);     
	  Long y = new Long(9887544); 
	  if(x.equals(y))
	  {
		  System.out.println("Yes");
	  }
	  else
	  {
		  System.out.println("No");
	  }
  }
}
