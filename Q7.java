package java_primer;
import java.util.Scanner;
public class Q7 {
	public static void main(String[]args) {
	System.out.println("enter size of array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];  
	int c=0; int c1=0;
	for(int i=0; i<n; i++) {
		a[i]=sc.nextInt(); 
	}
	for(int i=0; i<n; i++) {
		System.out.print(a[i]+" "); 
	}
	int max = a[0];
	for(int i=0; i<n; i++) {
	   if(max<a[i]) 
		   max=a[i];
} 
	int min= a[0];
	for(int i=0; i<n; i++) {
	   if(min>a[i]) 
		   min=a[i];
	 }
	for(int i=0; i<n; i++) {
		if(max==a[i])
		c++;
		else if(min==a[i])
			c1++;
	}
	System.out.println("\n max no is "+max+" no of times "+c);
	System.out.println("min no is "+min+" no of times "+c1);
	
		System.out.println("first occurance "+a[0]);  
		System.out.println("last occurance "+a[n-1]);  
		
		
		
		
		
		
		
		
	
}}
