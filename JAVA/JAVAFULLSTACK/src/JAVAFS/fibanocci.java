package JAVAFS;
import java.util.Scanner;
public class fibanocci 
{
	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int frst=0;
     int seco=1;
     System.out.println("Fibonacci series are:");
     for(int i=1;i<=num;i++)
     {
    	 System.out.print(frst+","); 
    	 int newval=frst+seco;
    	 frst=seco;
    	 seco=newval;
     }
}
}
