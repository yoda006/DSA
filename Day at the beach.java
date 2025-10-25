
import java.util.Scanner;

public class Problem_599C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		        int n=sc.nextInt();
		        int [] nums=new int[n];
		        for(int i=0;i<n;i++) {
		        	nums[i]=sc.nextInt();
		        }
		        int[]arr=new int[nums.length];
		        arr[n-1]=nums[n-1];
		        for(int i=nums.length-2;i>=0;i--){
		            arr[i]=Math.min(nums[i],arr[i+1]);
		        }
		        int leftmax=Integer.MIN_VALUE;
		        int ans=1;
		        for(int i=0;i<nums.length-1;i++){
		           leftmax=Math.max(nums[i],leftmax);
		            if(leftmax<=arr[i+1]){
		                ans++;
		               
		            }
		        }
		        System.out.println(ans);
		      

	}

}
