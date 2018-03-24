
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
		
				
			return str+1;
	 }
	 public String decrypt(String a){
   	  
   	  char arr[] = new char[a.length()];
		for(int i=0; i<a.length(); i++){
			
			char c = a.charAt(i);
			int j = c-1;
			char k = (char) j;
			arr[i]=k; 
		}
		String str = Arrays.toString(arr);
		String str1 = str.replace("[", "").replace("]","").replace(", ", "").replace("0","");
		
		return str1;
	 }
	
}

 class HDFC implements BankTransfers{
	 
	 public  String encrypt(String a){
			
   	  char arr[] =  new char[a.length()];
		for(int i=0; i<a.length(); i++){
			
			char c = a.charAt(i);
									
		if(!(c== ' ')) {            ///This if loop is required to bypass the space characters as per requirement
			
			if (i%2==0){

				int j = c + 1;  // This is as per requirement (need to increase ASCII value by 1)
				char k =  (char) j;  //This converts the integer j into its corresponding ASCII value
				arr[i] = k; 
			       }
			
			if(!(i%2==0))
			{
				int m = c-1;
				char n = (char) m;
				arr[i] = n;
			    }
			
		
			}
		else {
			arr[i]=c;
		}
		}
		
			//System.out.println(Arrays.toString(arr));  //This actually prints all the array contents in a single line
			String str = Arrays.toString(arr)
					.replace(", ", "").replace("[", "").replace("]", "");
			
			
		return str;
    }
	 
	 
	 public String decrypt(String a){
		

   	  char arr[] = new char[a.length()];
		for(int i=0; i<a.length(); i++){
			
			char c = a.charAt(i);
			
			if(c!= ' '){
				if(i%2==0){
					int j =c-1;
					char k =(char) j;
					arr[i]= k; 
				}
				

   			if(!(i%2==0))
   			{
   				int m = c+1;
   				char n = (char) m;
   				arr[i] = n;
   			    } 
   			}
   		else {
					arr[i]=c; 
				}	
			}
		
		String str = Arrays.toString(arr);
		String str1 = str.replace("[", "").replace("]","").replace(", ", "");
		
		return str1;
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
			bucky.nextLine(); //This is required because after selecting bank we are giving ENTER, 
			                  //which needs to be bypassed, and then we will give the actual string
			String str = bucky.nextLine();
				if(bnk==1){
					System.out.println("The Encrypted message is : " +ic.encrypt(str));
					System.out.println("The Decrypted message is : "+ic.decrypt(ic.encrypt(str)));
			  }
			  else {
				  System.out.println("The Encrypted message is : "+hd.encrypt(str));	
				  System.out.println("The Decrypted message is : "+hd.decrypt(hd.encrypt(str)));			
			      }
			}
		else {
			System.out.println("Invalid Type");
			}
		bucky.close();
	}
	
}
