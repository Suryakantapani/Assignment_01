package java_primer;

public class Q6 {
	public static boolean isodd(int n) {
		int x=n&1;
		if(x==1) {
			return true;
		}
		else 
			return false;
	}

 public static void main(String[]args) {
	 int x=37;
	 System.out.println(isodd(x));
 }
}
