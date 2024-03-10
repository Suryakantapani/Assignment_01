package java_primer;

public class Q4 {
	public static void main(String[]args){
		System.out.println("gopal"
				+ "");
		char a[]= {'c','a','r','b','o','n'};
		int x=a.length;
		int count=0;
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				for(int k=0; k<x; k++) {
					for(int l=0; l<x; l++) {
						for(int m=0; m<x; m++) {
							for(int n=0; n<x; n++) {
                  if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n) {
                	  count++;
                	  System.out.println(" "+a[i]+a[j]+a[k]+a[l]+a[m]+a[n]+" "+count);
                  }
							
							}}}}}
		}
		
	}
}
 