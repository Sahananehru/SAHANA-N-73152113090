package JAVAFS;
import java.util.Scanner;
public class palindrome
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int rem=0;
	  int n=num;
	  int rev=0;
	  while(num>0)
	  {
		  rem=num%10;
		  rev=(rev*10)+rem;
		  num=num/10;  
	  }
	  if(rev==n)
	  {
		  System.out.println("Is Palindrome");
	  }
	  else
	  {
		  System.out.println("Not palindrome");
	  }
  }
}
