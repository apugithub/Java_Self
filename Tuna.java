import java.util.*;
public class tuna {
	 Scanner keyboard = new Scanner(System.in);
    public void SimpleMessage(String name){
    	
    	System.out.println("Hello " + name);
    }
    
    public void whileloop(int num){
    	while(num > 0){
    		System.out.printf("The num is: %s  ",num);
    		num--;  }
    }
    
    public void String_test(int a){
    	String[] apu = new String[a];
    	System.out.println("You need to enter times: "+ apu.length);
       	for (int i=0; i<apu.length; i++){
    	System.out.printf("Enter the %s th position value\n",i);
    	apu[i]=keyboard.nextLine();
    	}
       	System.out.println(" The content of string is: ");
       	for (int i=0; i<apu.length; i++){
        	System.out.println(apu[i]);
       	}
    }
    
    
}
