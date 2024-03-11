package java_primer;
import java.util.Scanner;

public class Q10 {
	 public static double sumColum(int m[][], int columnIndex) {
		 double sum=0;
	         for(int i=0; i<3; i++) {
			 sum+=a[i][col];
	         }
		 return sum; 
	 }

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	        int n=3; int c=4;
	        double arr[][]=new double[n][c];
		System.out.println("Enter a 3-by-4 matrix row by row:");
	        for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
	        for(int i=0; i<n; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]+" ");
			}
	                System.out.println();
	        }
		for(int k=0; k<c; k++) {
			System.out.println("Sum of elements at column "+j+" is "+sumcolum(arr,j));
		}
	}
}

