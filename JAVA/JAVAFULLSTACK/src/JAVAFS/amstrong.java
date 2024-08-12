package JAVAFS;
import java.util.Scanner;
public class amstrong 
{
		  public static void main(String[] args)
		  {
			  Scanner sc=new Scanner(System.in);
		      int num=sc.nextInt();
		      int num1=num;
		      int n=num1;
		      int rem,value=1,value2=0;
		      int len=0;
		      while(num>0)
		      {
		          num=num/10;
		          len=len+1;
		      }
		      while(num1>0)
		      {
		          rem=num1%10;
		          for(int i=1;i<=len;i++)
		          {
		              value=value*rem;
		             
		          }
		           value2=value+value2;
		          value=1;
		          num1=num1/10;
		      }
		      if(n==value2)
		      {
		    	  System.out.println("Amstrong number");
		      }
		      else
		      {
		    	  System.out.println("Not amstrong");
		      }
		  }
		}