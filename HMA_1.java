package java_primer;
import java.util.Scanner;
public class HMA_1 {
public static void main(String[]args) {
	System.out.println("enter the number");
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a+b==c || b-c==a ||a*b==c)
		System.out.println("correct arithimetic formula ");
	else
		System.out.println("incorrect arithmimetic formula ");
	
}
}
