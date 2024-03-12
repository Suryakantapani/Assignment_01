package java_primer;
import java.util.Scanner;
public class Q10 {
 static double sumcolum(double m[][], int col) {
	 double sum=0;
	 for(int i=0; i<3; i++) {
		 
				sum+=m[i][col];
		 }
				return sum; 
 }
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the element of array :");
	 int n=3; int c=4;
	 double a[][]=new double[n][c];
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<c; j++) {
			 a[i][j]=sc.nextDouble();
		 }
	 }
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<c; j++) {
			  System.out.print(a[i][j]+" ");
		 }
	 System.out.println();
	 }
	 for(int k=0; k<c; k++) {
		 System.out.println(c+" "+sumcolum(a,k));
		 
	 }
	  
	 
 }
}
