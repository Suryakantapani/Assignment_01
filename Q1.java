package java_primer;
import java.util.Scanner;
public class Q1 {
	public static void main(String[]args) {
		System.out.println("enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		if(n>2) {
			System.out.println("the positive intreger greater than 2 from command line argument is "+n);
			while(n>2) {
				n=n/2;
				count++;
			}
			System.out.println("The number of times one must repeatedly divide this number by 2\n"
					+ "before getting a value less than 2 is "+count);
		}
	}

}
