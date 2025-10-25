
import java.util.*;

public class Problem_32B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder num= new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='.') {
			
				num.append("0");
			}
			else if(str.charAt(i)=='-') {
				if(str.charAt(i+1)=='.') {
					num.append("1");
				}
				else {
					num.append("2");
				}
				i++;
			}
		}
		
		System.out.print(num);		

	}

}
