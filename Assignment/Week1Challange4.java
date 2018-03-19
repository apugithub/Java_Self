//////////////////   Main Class   ////////////////////////

import java.util.Scanner;


public class week1challange4 {

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
		String TP = bucky.next();
		String MD = bucky.next();
		String CT = bucky.next();
		String PS = bucky.next();
		String TC = bucky.next();
		System.out.println(obj2.getType(TP)+ " " + obj2.getType(MD)+" "+ obj2.getType(CT)+" " + obj2.getType(PS)
				+" " + obj2.getType(TC));
		
		
		
		
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
