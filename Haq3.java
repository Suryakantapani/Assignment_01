package java_primer;
import java.util.Scanner;
public class Haq3 {
	public static void main(String[] args) {
		System.out.println("enter the size of array :");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       int b[]=new int[n];
       int c[]=new int[n];
       for(int i=0; i<n; i++) {
    	   a[i]=sc.nextInt();
       }
       for(int i=0; i<n; i++) {
    	   b[i]=sc.nextInt();
       }
       for(int i=0; i<n; i++) {
    	   c[i]=a[i]*b[i];
    	   System.out.println(a[i]+" * "+b[i]+" = "+c[i]);
       }
	}

}
