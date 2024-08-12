package JAVAFS;
import java.util.Scanner;
public class randomnum 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int val1=sc.nextInt();
	  int val2=sc.nextInt();
	  int range=(val1-val2)+1;
	  System.out.println("RANDOM NUMBER:");
	  for(int i=0;i<10;i++)
	  {
		  int random=(int)(Math.random()*range)+val2;
		  System.out.print(random +",");
	  }
  }
}