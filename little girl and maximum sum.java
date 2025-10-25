


import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_276C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int[]arr=new int[n];
		int[]diff=new int[n+1];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		while(q>0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			l--; r--;
			diff[l]+=1;
			diff[r+1]-=1;
			q--;
		}
		for(int i=1;i<=n;i++) {
			diff[i]=diff[i]+diff[i-1];
		}
		Arrays.sort(diff);
		Arrays.sort(arr);
		long sum=0;
		for(int i=0;i<n;i++) {
			sum+=(long)arr[i]*diff[i+1];
		}
		System.out.println(sum);

	}

}
