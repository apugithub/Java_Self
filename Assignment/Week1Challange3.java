import java.util.Scanner;


public class week1ch3 {
    
	public static void main(String args[]){
		
		Scanner bucky = new Scanner(System.in);
		int i = bucky.nextInt();
		String str1 = bucky.next();
		//String str = "bcpqrdytfgxyzpqrklm";
		String findStr = "xyz";
		String findStr1 = "pqr";
		
		System.out.println(countcheck(str1, findStr) + " " + countcheck(str1, findStr1));
		bucky.close();
		
	}
		
	public static int countcheck(String str, String findStr) {
		
		
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		//System.out.println("San" + findStr.length());
		return count;
	}
 }
