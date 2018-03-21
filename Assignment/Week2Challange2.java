

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

interface BankTransfers{
	//public String encrypt(String a);
	//public String decrypt(String a);
}

 class ICICI implements BankTransfers {
	
	 //public String encrypt(String a){
		 
	 
	
}

 class HDFC implements BankTransfers{
	 
 }
public class wee2ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bucky = new Scanner(System.in);
		System.out.println("Select the Bank Name");
		String bnk = bucky.next();
		
		ICICI ic = new ICICI();
		HDFC hd = new HDFC();
		System.out.println("Enter the Message to Transfer");

	}

}
