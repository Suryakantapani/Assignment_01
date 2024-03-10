package java_primer;
public class Q5 {
	public static int sum(int n) {
		  
		while(n>9) {
			int sum=0;
			while(n>0) {
			int a=n%10;
			sum+=a;
			n/=10;
		}
   n =sum;
     }
		return n;
}
	public static void main(String[]args) {
		int n=9294;
		System.out.println(sum(n)); 
	}}
