
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class week2challange1 {

	public static void main(String[] args)   throws IOException{
		// TODO Auto-generated method stub
		System.out.println("enter input num");
		Scanner bucky = new Scanner(System.in);
		int n = bucky.nextInt();
		ArrayList<String> arr = new ArrayList<String>(n);
		
		for (int i =0 ; i<=n; i++) {
			  //System.out.println("sss" + i);
			  arr.add(bucky.nextLine());
			 
		}
		
		//System.out.println("output");
		//for (int i =0; i<n; i++)
		//System.out.println(arr.get(i));

	}

}
