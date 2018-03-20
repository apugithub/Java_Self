
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class week2ch1 {

	public static void main(String[] args)   throws IOException{
		// TODO Auto-generated method stub
		System.out.println("enter input num");
		Scanner bucky = new Scanner(System.in);
		int n = bucky.nextInt();
		ArrayList<String> arr = new ArrayList<String>(n);
		
		for (int i =0 ; i<=n; i++) {
			System.out.println(i);
			  arr.add(bucky.nextLine());
			  System.out.println(i);
		}
		
		//System.out.println("output");
		//for (int i =0; i<n; i++)
		//System.out.println(arr.get(i));

	}

}
