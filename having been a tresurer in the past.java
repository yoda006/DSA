

import java.util.Scanner;

public class problem_2072B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			
			String s=sc.next();
			int dash=0;
			int underscore=0;
			for(char ch:s.toCharArray()) {
				if(ch=='-') {
					dash++;
				}
				else if(ch=='_') {
					underscore++;
				}
			}
		
			long leftDashes = dash / 2;
            long rightDashes = dash - leftDashes;
            
        
            long result = leftDashes * underscore * rightDashes;
			
			System.out.println(result);
			t--;

		}
		
	}

}
