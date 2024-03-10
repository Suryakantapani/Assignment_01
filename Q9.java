package java_primer;
import java.util.Scanner;
public class Q9 {
	static double SumMajor(double [][]m) {
		double sum=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++)
			{
	         if(i==j)
			 sum+=m[i][j];
		}}
		return sum;
	}
	public static void main(String[]args) {
		System.out.println("enter the element of array ");
		Scanner sc=new Scanner(System.in);
		int r=4;
		int n=4;
		double a[][]=new double[r][n];
		for(int i=0; i<r; i++ ) {
			 for(int j=0;j<n; j++) {
				a[i][j]=sc.nextDouble();
					}}
		for(int i=0; i<r; i++ ) {
			 for(int j=0;j<n; j++) {
				System.out.print(a[i][j]+" ");
			 }
			 System.out.println();}
	System.out.println("sum is"+SumMajor(a));
	 
	}

}
