import java.util.ArrayList;
import java.util.Scanner;


public class week3ch2 {
	
	public static void main (String[] args){
    
		int check = 0;
	Scanner bucky = new Scanner(System.in);
	ArrayList<contact> san = new ArrayList<contact>();  // Creating ArrayList 'san' of 'contact' method
	System.out.println("Enter number of contacts:");
	int a = bucky.nextInt();
	for (int i=1; i<=a;i++){
		System.out.println("Enter Contact "+i);
		System.out.println("Enter Contact Name");
		String s1 =bucky.next();
		System.out.println("Enter Mobile Number");
		String b = bucky.next();
		bucky.nextLine();
		san.add(new contact(s1, b));
	}
		System.out.println("Search contact by name:");
		String s2 = bucky.next();
		
		for (int i=0; i<san.size(); i++){
			
			if(  (san.get(i).getName()).equals(s2)  )
			   {
				System.out.println("Contact Name:"+san.get(i).getName());
				System.out.println("Contact Mobile Number:"+ san.get(i).getmobileNumber());
				check =1;
				break;
				}

			/*if(i==san.size()-1)
				{
					System.out.println("Contact not found");
				} */
			}
		
	if(check == 0)                 ///This can also be achieved with the help of above commented out if loop inside FOR loop
			System.out.println("Contact not found");
		bucky.close();
	}

		}
		
    //System.out.println(san);
  
    
 


class contact {
	private String name;
	private String mobileNumber;
	
	contact(String name, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}  
	 
	 
	 public String setName(String name){
			return name;
		}
	 
	 public String getName(){
			return name;
		}
		
	 public String setmobileNumber(String mobileNumber){
			return mobileNumber;
		}  
	
	public String getmobileNumber(){
		return mobileNumber;
	} 
	
	public String toString(){       //This toString method override is required by 'san' arraylist
		return name + mobileNumber;
	}
	
}
