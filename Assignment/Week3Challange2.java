import java.util.ArrayList;
import java.util.Scanner;


public class week3ch2 {
	
	public static void main (String[] args){
    
	Scanner bucky = new Scanner(System.in);
	ArrayList<contact> san = new ArrayList<contact>();
	System.out.println("Enter number of contacts:");
	int a = bucky.nextInt();
	for (int i=1; i<=a;i++){
		System.out.println("Enter Contact "+i);
		System.out.println("Enter Contact Name");
		String s1 =bucky.next();
		System.out.println("Enter Mobile Number");
		int b = bucky.nextInt();
		bucky.nextLine();
		san.add(new contact(s1, b));
	}
		System.out.println("Search contact by name:");
		String s2 = bucky.next();
		
		for (int i=0; i<san.size(); i++){
			if(  (san.get(i).getName()).equals(s2)  ){
			System.out.println("Contact Name:"+san.get(i).getName());
			System.out.println("Contact Mobile Number:"+ san.get(i).getmobileNumber());
		  }
		}

    //System.out.println(san);

    
   }
}

class contact {
	private String name;
	private int mobileNumber;
	
	contact(String name, int mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}  
	 
	 
	 public String setName(String name){
			return name;
		}
	 
	 public String getName(){
			return name;
		}
		
	 public int setmobileNumber(int mobileNumber){
			return mobileNumber;
		}  
	
	public int getmobileNumber(){
		return mobileNumber;
	} 
	
	public String toString(){
		return name + mobileNumber;
	}
	
}  