//////////////  Main method   ////////////////

import java.util.Scanner;


public class week1ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printer obj1 = new Printer("Multi-function","HP","Inkjet",150,2);
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
		Printer obj2 = new Printer(TP,MD,CT,PS,TC);
		System.out.println(obj2.toString());

		
		System.out.println("Menu" + "\n"+
                           "1) Update type\n" +
                           "2) Update model\n" +
                           "3) Update color technology\n" +
                           "4) Update printer speed\n" +
                           "5) Update tray capacity\n" +
                           "6) All information correct\n" +
                           "Type 1 or 2 or 3 or 4 or 5 or 6");
		
		int choice = bucky.nextInt();
		
        if (choice == 1){
			
			System.out.println("The current type is " + TP + "\n" + "Enter the new type");
			TP = bucky.next();
			System.out.println("The updated printer details are");
			obj2.setType(TP);
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
			
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
			
		}
        
       if (choice == 2){
			
			System.out.println("The current model is " + MD + "\n" + "Enter the new model");
			MD = bucky.next();
			System.out.println("The updated printer details are");
			obj2.setModel(MD);
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
						
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
			
		}
       
       if (choice == 3){
			
			System.out.println("The current color technology is " + CT + "\n" + "Enter the new color technology");
			CT = bucky.next();
			System.out.println("The updated printer details are");
			obj2.setColorTechnology(CT);
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
						
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
		}
		
		
        
        if (choice == 4){
			
			System.out.println("The current printer speed is " + PS + "\n" + "Enter the new printer speed");
			PS = bucky.nextInt();
			System.out.println("The updated printer details are");
			obj2.setPrintSpeed(PS);
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
			
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
			
		}
		
		if (choice == 5){
			
			System.out.println("The current tray capacity is " + TC + "\n" + "Enter the new tray capacity");
			TC = bucky.nextInt();
			System.out.println("The updated printer details are");
			obj2.setTrayCapacity(TC);
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
			
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
			
		}
		
		if (choice ==6) {
			
			System.out.println("The updated printer details are");
			System.out.println(obj2.toString());
			System.out.println("Details of the printer that you got as a lucky prize are");
			System.out.println(obj1.toString());
			
			if(obj1.equals(obj2))
				System.out.println("Both the printers are the same");
			else 
				System.out.println("Both the printers are different");
			
			
		}
		
	bucky.close();	
		
		
	}


	
	
}






////////////// Printer Class /////////////////////////

class Printer {
	private String type;
	private String model;
	private String colorTechnology;
	private int printSpeed;
	private int trayCapacity;
	
	
	
	public Printer(String type, String model, String colorTechnology,
			int printSpeed, int trayCapacity) {
		super();
		this.type = type;
		this.model = model;
		this.colorTechnology = colorTechnology;
		this.printSpeed = printSpeed;
		this.trayCapacity = trayCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColorTechnology() {
		return colorTechnology;
	}

	public void setColorTechnology(String colorTechnology) {
		this.colorTechnology = colorTechnology;
	}

	public int getPrintSpeed() {
		return printSpeed;
	}

	public void setPrintSpeed(int printSpeed) {
		this.printSpeed = printSpeed;
	}

	public int getTrayCapacity() {
		return trayCapacity;
	}

	public void setTrayCapacity(int trayCapacity) {
		this.trayCapacity = trayCapacity;
	}

	public String toString(){
		
        return type + " " + model + " " + colorTechnology + " " + printSpeed + " " +  trayCapacity ;
    }

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((colorTechnology == null) ? 0 : colorTechnology.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + printSpeed;
		result = prime * result + trayCapacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	} */
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Printer other = (Printer) obj;
		if (colorTechnology == null) {
			if (other.colorTechnology != null)
				return false;
		} else if (!colorTechnology.equals(other.colorTechnology))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (printSpeed != other.printSpeed)
			return false;
		if (trayCapacity != other.trayCapacity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


}
	
