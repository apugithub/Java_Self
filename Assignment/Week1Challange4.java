//////////////////   Main Class   ////////////////////////

import java.awt.DisplayMode;
import java.util.Scanner;


public class week1ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printer obj1 = new Printer();
		obj1.getType("Multi-function");
		obj1.getModel("HP");
		obj1.getColorTechnology("Inkjet");
		obj1.getPrintSpeed(150);
		obj1.getTrayCapacity(2);
		
		Printer obj2 = new Printer();
		Scanner bucky = new Scanner(System.in);
		System.out.println("Enter the type of the printer");
		String TP = bucky.next();
		System.out.println("Enter the model of the printer");
		String MD = bucky.next();
		System.out.println("Enter the color technology of the printer");
		String CT = bucky.next();
		System.out.println("Enter the print speed of the printer");
		int PS = bucky.nextInt();
		System.out.println("Enter the tray capacity of the printer");
		int TC = bucky.nextInt();
		System.out.println("The printer details you entered are");
		System.out.println(obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)
				+" " + obj2.getTrayCapacity(TC));
		
		System.out.println("Menu" + "\n"+
                           "1) Update type \n" +
                           "2) Update model \n" +
                           "3) Update color technology \n" +
                           "4) Update printer speed \n" +
                           "5) Update tray capacity \n" +
                           "6) All information correct \n" +
                           "Type 1 or 2 or 3 or 4 or 5 or 6");
		
		int choice = bucky.nextInt();
		
        if (choice == 1){
			
			System.out.println("The current type is " + TP + "\n" + "Enter the new type");
			TP = bucky.next();
			
			System.out.println("The updated printer details are" + "\n" + 
					obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)+" " + 
					obj2.getTrayCapacity(TC));
			
			display();
			
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			System.out.println(obj1 + "  "+obj2);
			
		}
        
       if (choice == 2){
			
			System.out.println("The current model is " + MD + "\n" + "Enter the new model");
			MD = bucky.next();
			
			System.out.println("The updated printer details are" + "\n" + 
					obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)+" " + 
					obj2.getTrayCapacity(TC));
			
			display();
			
		}
       
       if (choice == 3){
			
			System.out.println("The current color technology is " + CT + "\n" + "Enter the new color technology");
			CT = bucky.next();
			
			System.out.println("The updated printer details are" + "\n" + 
					obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)+" " + 
					obj2.getTrayCapacity(TC));
			
			display();
			
		}
		
		
        
        if (choice == 4){
			
			System.out.println("The current printer speed is " + PS + "\n" + "Enter the new printer speed");
			PS = bucky.nextInt();
			
			System.out.println("The updated printer details are" + "\n" + 
					obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)+" " + 
					obj2.getTrayCapacity(TC));
			
			display();
			
		}
		
		if (choice == 5){
			
			System.out.println("The current tray capacity is " + TC + "\n" + "Enter the new tray capacity");
			TC = bucky.nextInt();
			
			System.out.println("The updated printer details are" + "\n" + 
					obj2.getType(TP)+ " " + obj2.getModel(MD)+" "+ obj2.getColorTechnology(CT)+" " + obj2.getPrintSpeed(PS)+" " + 
					obj2.getTrayCapacity(TC));
			
			display();
			
		}
		
		
		
		
		
	}

	public static void display(){
		Printer obj1 = new Printer();
		System.out.println("Details of the printer that you got as a lucky prize are" + "\n" + 
				obj1.getType("Multi-function")+ " " + obj1.getModel("HP")+" "+ obj1.getColorTechnology("Inkjet")+" " + obj1.getPrintSpeed(150)+" " + 
				obj1.getTrayCapacity(2));
	}
	
	
	
	
}







///////////////////     Printer class  ///////////////////////////////////////


public class Printer {
	private String type;
	private String model;
	private String colorTechnology;
	private int printSpeed;
	private int trayCapacity;
	
	public String getType (String type){
		return type;
	}

	public void setType (String type){
		this.type = type;
	}
////////////////////////////////////////////////////	
	public String getModel (String model){
		return model;
	}

	public void setModel (String model){
		this.model = model;
	}
//////////////////////////////////////////////////////	
	public String getColorTechnology (String colorTechnology){
		return colorTechnology;
	}

	public void setColorTechnology (String colorTechnology){
		this.colorTechnology = colorTechnology;
	}
/////////////////////////////////////////////////////
	
	public int getPrintSpeed (int printSpeed){
		return printSpeed;
	}

	public void setPrintSpeed (int printSpeed){
		this.printSpeed = printSpeed;
	}
////////////////////////////////////////////////////////	
	
	public int getTrayCapacity (int trayCapacity){
		return trayCapacity;
	}

	public void setTrayCapacity (int trayCapacity){
		this.trayCapacity = trayCapacity;
	}
///////////////////////////////////////////////////////////	
	
	public String toString(){
		
        return type + " " + model + " " + colorTechnology + " " + printSpeed + " " +  trayCapacity ;
    }
	
	
}
