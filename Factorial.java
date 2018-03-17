

import java.util.*;

public class Factorial {

	static int fact(int i){
		if(i==1){
			return 1;
		}
		else 
			return (i* fact(i-1));
	}
	
	public static void main(String[] args) {
		
		Scanner bean = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int Number = bean.nextInt();
		
		/*int fact=1, i;
		for (i =1; i<=Number;i++)
			fact=fact*i;
		System.out.println("Factorial of "+ Number+" is : " + fact);  */
		//fact(Number);
		System.out.println("Factorial of "+ Number+" is : " + fact(Number));
	}

}
