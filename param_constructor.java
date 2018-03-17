
public class param_constructor {
	
	int i ;
	String s;
	public param_constructor(int intr, String strr) {
		
		this.i =intr;
		this.s=strr;
		
		/*this.i =i;   ** If we would have passed i and s from param_constructor, then 'this' keyword will help to forward the value to the main class
		this.s=s;*/
		
		
	}

void disp() { 
	System.out.println(i +" " + s); 
	}

public static void main(String args[]){

param_constructor s1 = new param_constructor(101, "Hundred One");
param_constructor s2 = new param_constructor(303, "Threehundred three");

s1.disp();
s2.disp();
}

}
