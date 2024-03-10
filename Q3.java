package java_primer;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		 System.out.println("enter the number :");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum=0;
		 int p=1;
		 while(n>0) {
			 int a=n%10;
			 p*=a;
			 sum+=a;
			 n/=10;
		 }
      if(sum==p) {
    	  System.out.println("it is spy number");
      }
      else 
    	  System.out.println("it is not a spy number");
	}

}
