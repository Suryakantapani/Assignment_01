package java_primer;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person's weight");
		int a=sc.nextInt();
		System.out.println("enter person's height in meter");
		double h=sc.nextDouble();
		double bm=a/(h*h);
		if(bm<18.5) 
			System.out.println("under weight");
		else if(bm>=18.5 && bm<24.9)
			System.out.println("normal weight");
		else if(bm>=24.9 && bm<29.9)
			System.out.println("overweight weight");
		else 
			System.out.println("obese weight");
	}

}
