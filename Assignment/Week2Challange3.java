//Here I am going to obtain the result by-- 1. Capitalize both the string (main string and the string to be searched) to make the comparison smoother
// and  2. sorting both the string (splitting into characters and sorting and after sort again making it to string)

import java.util.Arrays;
import java.util.Scanner;


public class week2challange3 {

	public static void main(String[] args) {
		
		Scanner bucky = new Scanner(System.in);
		String bowl = bucky.nextLine().toUpperCase();   //Converting this to upper to make the comparison smoother 
		int m = bucky.nextInt(); 

		char tempbowl[] = bowl.toCharArray(); //Breaking the string to character array to sort it further
		Arrays.sort(tempbowl);  //sorting the char array
		String san = new String(tempbowl);  //this is a very good method to convert char array to string, which can also be achieved by Arrays.toString(tempbowl) and 
		                                     //and then replacing the unnecessary characters like "," "[" etc
		//System.out.println("test==== :"+ san);
		 
		String[] arr = new String[m];   //This array is to hold the original message received
		String[] arr1 = new String[m];  //This array is to hold the modified message.
		bucky.nextLine();  ///To bypass the extra enter key press
		
		for (int i=0; i<m; i++){ 
			arr[i]= bucky.nextLine();
		}
		
		for (int i=0; i<m; i++){
			arr1[i]= arr[i].replaceAll("[^A-Za-z ]","").replaceAll("\\d+","").replace(" ", "").toUpperCase(); 
			//In above line the first replace will remove any special character the second replace will remove any numbers

			char temparr[] = arr1[i].toCharArray();
			Arrays.sort(temparr);
			String san1 = new String(temparr);

			System.out.println(arr[i] +" : "+ stringContains(san,san1));
			
		}
		
		bucky.close();
	}
	
	static String stringContains(String longer, String shorter) {  //longer = main string  //shorter=sub string
	    int i = 0;
	    for (char c : shorter.toCharArray()) { //As both the string are sorted it checks if the value from starting index is getting matched
	        i = longer.indexOf(c, i) + 1;
	        if (i <= 0) { return "NO"; }
	    }
	    return "YES";
	}
	
	
}