package java_primer;

public class HAQ5 {
	public static void main(String[]args) {
		int a[][]= new int[4][4];
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){
				a[i][j]=(int)(2*Math.random());
			}
		}
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: ");
		int maxrowIndex=0, maxrow=0;
		for (int i=0;i<4 ;i++){
			int count=0;
			for (int j=0; j<4; j++){
				if (a[i][j]==1){
					count++;
				}
				if (count>maxrow){
					maxrow=count;
					maxrowIndex=i;
				}
			}
		}
		System.out.println(maxrowIndex);
		System.out.println("The largest column index: ");
		int maxcolIndex=0, maxcol=0;
		for (int i=0;i<4 ;i++){
			int count2=0;
			for (int j=0; j<4; j++){
				if (a[i][j]==1){
					count2++;
				}
				if (count2>maxcol){
					maxcol=count2;
					maxcolIndex=i;
				}
			}
		}
		System.out.println(maxcolIndex);
	}

}
