
import java.util.Arrays;
import java.util.Scanner;

interface BankTransfers{
	public String encrypt(String a);
	public String decrypt(String a);
}

 class ICICI implements BankTransfers {
	
	 public String encrypt(String a){
		 char arr[] =  new char[a.length()];
			for(int i=0; i<a.length(); i++){
				char c = a.charAt(i);
				int j = c + 1;  // j retains the ASCII number of c and (need to increase ASCII value by 1 as per requirement)
				char k = (char) j;  ///This converts the integer j into its corresponding ASCII value and being assigned as char. 
				arr[i]=k;
			}

		//System.out.println(Arrays.toString(arr));  //This Arrays.toString() actually prints all the array contents in a single line
		String str = Arrays.toString(arr)
		.replace(", ", "1").replace("[", "").replace("]", "");  //note the replace method and at first "comma and one space" getting replaced by null
		System.out.println("The Encrypted message is : " +str);
				
			return "a";
	 }
	 public String decrypt(String a){
		 System.out.println("The Decrypted message is : "+a);
		 return "a";
	 }
	
}

 class HDFC implements BankTransfers{
	 
	 public  String encrypt(String a){
			
   	  char arr[] =  new char[a.length()];
		for(int i=0; i<a.length(); i++){
			
			char c = a.charAt(i);
									
		if(c!= ' ') {            ///This if loop is required to bypass the space characters as per requirement
			
			if (i%2==0){

				int j = c + 1;  // This is as per requirement (need to increase ASCII value by 1)
				char k = (char) j;  //This converts the integer j into its corresponding ASCII value
				arr[i] = k; 
			       }
			
			else {
				int m = c-1;
				char n = (char) m;
				arr[i] = n;
			    }
		
			} 
		}
		
			//System.out.println(Arrays.toString(arr));  //This actually prints all the array contents in a single line
			String str = Arrays.toString(arr)
					.replace(", ", "").replace("[", "").replace("]", "");
			System.out.println("The Encrypted message is : " +str);
			
		return str;
    }
	 
	 
	 public String decrypt(String a){
		 System.out.println("The Decrypted message is : "+a);
		 return "a";
	 }
	
	 
 }
public class week2challange2 {

	public static void main(String[] args) {
		
		Scanner bucky = new Scanner(System.in);
		System.out.println("Select the Bank Name"+ "\n"+ "1.ICICI"+"\n"+ "2.HDFC");
		int bnk = bucky.nextInt();
		//bucky.nextLine();
		//System.out.println("Enter the Message to Transfer");
		//String str = bucky.nextLine();
		
		ICICI ic = new ICICI();
		HDFC hd = new HDFC();
		
		
		
		if (bnk ==1 || bnk==2){
			System.out.println("Enter the Message to Transfer");
			bucky.nextLine();
			String str = bucky.nextLine();
				if(bnk==1){
				ic.encrypt(str);
				ic.decrypt(str);
			  }
			  else {
				hd.encrypt(str);
				hd.decrypt(str);
			      }
			}
		else {
			System.out.println("Invalid Type");
			}
	}
	
}
