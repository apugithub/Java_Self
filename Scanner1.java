import java.util.Scanner;

public class Scanner1 {
	 
	public static void main(String args[]){
         Scanner bucky = new Scanner(System.in);
        System.out.println("Checkkk==" + bucky.nextLine());
		int a,b;
		System.out.println("Enter the first num:");
		a=bucky.nextInt();
		System.out.println("Enter the second num:");
		b=bucky.nextInt();
		sum(a,b);
		
	}
static void sum(int a, int b){
	//return(a+b);
	int c=a+b;
	System.out.println(c);
}

}
