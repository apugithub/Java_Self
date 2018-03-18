

//////////////////////////////////////////////////////////


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
