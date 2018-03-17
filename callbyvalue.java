public class callbyvalue {

	int a= 50;
	
	void disp(int a){
		a=a+100;
		System.out.println(a);
	}
	
	public static void main(String args[]){
		callbyvalue cp = new callbyvalue();
		System.out.println("before change "+cp.a);  ///result is 50
		cp.disp(500);
		System.out.println("after change "+cp.a);
	}
}

//Output of the abova code 

before change 50
600
after change 50	


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class callbyvalue {

	int a= 50;
	
	void disp(callbyvalue cp){
		cp.a=cp.a+100;
		//System.out.println(a);
	}
	
	public static void main(String args[]){
		callbyvalue cp = new callbyvalue();
		System.out.println("before change "+cp.a);  ///result is 50
		cp.disp(cp);
		System.out.println("after change "+cp.a);
	}
}

/////Output of the above code is
before change 50
after change 150

