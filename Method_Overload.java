
public class Method_Overload {

	static int adder (int a, int b){
		return a+b;
	}
	
	static String adder (String one, String two){
		return (one +" "+ two);
	}
	//Method_Overload  san = new Method_Overload();
}

class method2 {
	public static void main(String args[]){
		System.out.println(Method_Overload.adder(4,5));
		System.out.println(Method_Overload.adder("Santanu", "Ghosh"));
	}
}
