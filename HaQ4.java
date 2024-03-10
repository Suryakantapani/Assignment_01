package java_primer;
import java.util.Scanner;
public class HaQ4 {
	static double[][] addmatrix(double [][]a, double [][]b) {
		double sum[][]=new double[a.length][a[0].length];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
			
		}
		return sum;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n=sc.nextInt();
		int c=sc.nextInt();
		double a[][]=new double[n][c];
		double b[][]=new double[n][c];
		for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				a[i][j]=sc.nextInt();		
		}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				b[i][j]=sc.nextInt();		
		}
			 
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				 System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				 System.out.print(b[i][j]+" ");
		}
			 System.out.println();
		}

		 double[][] x=addmatrix(a,b);
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 System.out.print(x[i][j]);
			 }
		 System.out.println();
		 }
	}

}
