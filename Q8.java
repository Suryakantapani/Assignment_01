package java_primer;
import java.util.Scanner;
public class Q8 {
	public static void main(String[]args) {
		System.out.println("enter the no of row and column");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int sum=0;
		int a[][]=new int[n][r];
		for(int i=0; i<n; i++) {
			for(int j=0; j<r; j++) { 
				a[i][j]=sc.nextInt();
				
		}
	}
		for(int i=0; i<n; i++) {
			for(int j=0; j<r; j++) {
				sum+=a[i][j];
				 System.out.print(a[i][j]+" ");
				 }
			System.out.println();	 
	}
		System.out.println(sum);
	}
}
