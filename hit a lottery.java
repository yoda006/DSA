 
import java.util.Scanner;

public class Problem_996A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]arr= {100,20,10,5,1};
		int notes=0;
		for(int i=0;n>0;i++) {
			notes+=n/arr[i];
			n=n%arr[i];
		}
		System.out.println(notes);
	}

}
