import java.util.Scanner;

public class B_Ropes {
	public static boolean is_possible(int n,int k,int[]arr,double mid) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			c+=arr[i]/mid; // no. of pieces we can extract from rope i of length m
		}
		return c>=k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		double low=0;
		double high=1e7;
		int num_iterations=50; // log base 2 of(1e6*1e7)
		double ans=0;
		double error=1e-7;// margin of error 
		for(int i=0;i<num_iterations;i++) {
			double mid=low+(high-low)/2;
			//can i take out k pieces of size m from n ropes
			if(is_possible(n,k,arr,mid)) {
				ans=mid;
				low=mid+error;
			}
			else {
				high=mid-error;
			}
		}
		System.out.println(String.format("%.6f", ans));

	}

}
