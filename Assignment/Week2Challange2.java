/////////////  test encrypt /////////////////

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
		Scanner bucky = new Scanner(System.in);
		String s = bucky.nextLine();
		test cls = new test();  
		cls.encrypt(s);  //you can't make static reference to non-static method, thats why had to create a class instance.
		System.out.println("llsd "+ s.length());
	}
      public  String encrypt(String a){
		
		for(int i=0; i<a.length(); i++){
			char c = a.charAt(i);
			int j = c;
			System.out.println("The ascii value of "+ c+ " is "+ j);
		}
		return "a";
     }
      
 }
 
 
 ///////////////////   main ////////////////////////
 
 

import java.util.Scanner;

interface BankTransfers{
	//public String encrypt(String a);
	//public String decrypt(String a);
}

 class ICICI implements BankTransfers {
	
	 //public String encrypt(String a)
	 //public String decrypt(String a);
	
}

 class HDFC implements BankTransfers{
	 
 }
public class week2challange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner bucky = new Scanner(System.in);
		//System.out.println("Select the Bank Name");
		//String bnk = bucky.next();
		
					
		
		ICICI ic = new ICICI();
		HDFC hd = new HDFC();
		System.out.println("Enter the Message to Transfer");

	}

	
	
	
}
