
import java.util.Scanner;

public class week2challange4 {

	public static void main(String[] args) {
		
		//UserMainCode cls1 = new UserMainCode();  //class variable

		Scanner bucky = new Scanner(System.in);
		//System.out.println("Enter userid: ");
		String userid = bucky.nextLine();
		//System.out.println("Enter pass: ");
		String pass = bucky.nextLine();
		//System.out.println("Userid + Pass: "+ userid + "=="+pass);
		
		boolean check = UserMainCode1.validatePassword(userid, pass); //as this is static method the calling should be 
		                                                       //in a static way, so no class variable is required
		
		if(check==true)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
		
		bucky.close();
	}

}


 class UserMainCode1{
	 
	 static boolean validatePassword (String userid, String pass){
		 
		 String pass_pattern =userid.substring((userid.length())-3, userid.length()); // taking the last three characters of userid
		 String actual_pass = pass_pattern.concat(pass_pattern).concat(pass_pattern); //concatenating pass_pattern 3 times as this 
		                                                                             //should be the actual password as per requirement
		 //System.out.println(actual_pass);
		 
		 if(actual_pass.equals(pass))
		    return true;
		 else 
			return false;
		
	 }
	
}