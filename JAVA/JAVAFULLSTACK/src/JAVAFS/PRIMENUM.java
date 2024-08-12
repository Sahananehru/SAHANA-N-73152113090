package JAVAFS;
import java.util.Scanner;
public class PRIMENUM 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int count=1;
	  for(int i=2;i<num;i++)
	  {
		  if(num%i==0)
		  {
			  count=count+1;
		  }
	  }
	  if(count==1)
	  {
		  System.out.println("prime");
	  }
	  else
	  {
		  System.out.println("not prime");
	  }
  }
}
