package java_primer;
class rectangle{
	int l;
	int b;
	void setarea(int x,int y) {
		l=x; b=y;
	}
	void getarea() {
		System.out.println("area "+l*b);
	}
}
public class HAQ5 {
	public static void main(String[]args) {
		rectangle sc=new rectangle();
		sc.setarea(10, 5);
		sc.l=4;
		sc.getarea();
	}

}
