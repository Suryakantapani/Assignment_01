package java_primer;
import java.util.Scanner;
public class HMA_2 {
public static void main(String[]args) {
	System.out.println("lines");
	Scanner sc=new Scanner(System.in);
	int n=4;
     String []s =new String[n];
	
	for(int i=0; i<n; i++) {
		 s[i]=sc.nextLine();
	}
	for(int j=n-1; j>=0; j--) {
		System.out.println(s[j]);
		
	}
}

}
