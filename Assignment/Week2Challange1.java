
import java.io.*;
import java.util.Scanner;


public class week2ch1 {

	public static void main(String[] args)   throws IOException{

		String[] arr;
		//System.out.println("Enter input number of words");
		Scanner bucky = new Scanner(System.in);
		int n = bucky.nextInt();
		bucky.nextLine();  //This is to let the console know that the first new line character is not part of array value
		arr = new String[n];
		
		for (int i =0 ; i<n; i++)			
			arr [i] = bucky.nextLine();  //Here we are taking input 

		for ( int i = 0 ; i<n; i++)
			convert(arr[i]);  //Passing each and every array element(here these are each lines) to convert method
			
		bucky.close();

	}

	
	public static  void convert (String s){
		String name = s;
		String[] name1 = name.split(" ");
		if(name1.length==1){
			name1[0]= name1[0].substring(0).toUpperCase();
			System.out.println(name1[0]);
		}
		if(name1.length==2){
			name1[0]= name1[0].substring(0, 1).toUpperCase()+name1[0].substring(1).toLowerCase();
			name1[1]= name1[1].substring(0).toUpperCase();
			System.out.println(name1[0] + " " + name1[1]);
		}
		if(name1.length==3){
			name1[0]= name1[0].substring(0, 1).toUpperCase()+name1[0].substring(1).toLowerCase();
			name1[2]= name1[2].substring(0).toUpperCase();
			if(name1[1].contains("."))
				name1[1]= name1[1].substring(0).toUpperCase();
			else
				name1[1]=name1[1].substring(0).toLowerCase();
		
		System.out.println(name1[0] + " " + name1[1]+ " "+ name1[2]);	
			
		}
		

	}
	
	
	
}
