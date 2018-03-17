
public class Method_Override {

		
		int getinterest() {
			return 0;
	}
}

class sbi extends Method_Override{
	int getinterest(){
		return (9);
	}
}

class HDFC extends Method_Override{
	int getinterest(){
		return (10);
	}
}

class finall{
	public static void main(String args[]){
		HDFC H =new HDFC();
		System.out.println("Interest is: " + H.getinterest());
	}
}
