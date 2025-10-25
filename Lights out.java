import java.util.Scanner;

public class Problem_275A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner ( System.in);
	     int[][]arr=new int[3][3];
	     int[][]ans=new int[3][3];
	     for(int i=0;i<3;i++){
	         for(int j=0;j<3;j++){
	             arr[i][j]=sc.nextInt();
	         }
	     
	     } 
	     for(int i=0;i<3;i++){
	         for(int j=0;j<3;j++){
	            int c=arr[i][j];
	            if(i-1>=0) {
	            	c+=arr[i-1][j];
	            }
	            if(j-1>=0) {
	            	c+=arr[i][j-1];
	            }
	            if(i+1<=2) {
	            	c+=arr[i+1][j];
	            }
	            if(j+1<=2) {
	            	c+=arr[i][j+1];
	            }
	            ans[i][j]=((c%2==0)? 1:0);
	         }
	        
	     }
	     for(int i=0;i<3;i++){
	         for(int j=0;j<3;j++){
	             System.out.print(ans[i][j]);
	         }
	         System.out.println();
	     
	     } 
	    

	}

}
