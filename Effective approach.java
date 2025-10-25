
import java.util.Scanner;

public class Problem_227B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]arr1=new int[n+1];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			arr1[x]=i+1;
		}
		
		int m=sc.nextInt();
		long v=0;
		long p=0;
		
		while(m>0) {
			int q=sc.nextInt();
			v+=arr1[q];
			p+=n-arr1[q]+1;
			m--;
		}
		System.out.println(v+" "+p);
	}

}
