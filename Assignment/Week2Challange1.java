
import java.io.*;
import java.util.Scanner;


public class week2challange1 {

	public static void main(String[] args)   throws IOException{

		String[] arr;
		System.out.println("Enter input number of words");
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
		if(name1.length==1){  //This if condition checks if there is one word
			name1[0]= name1[0].substring(0).toUpperCase(); //This will make all the letters to uppercase starting from 0th position
			System.out.println(name1[0]);
		}
		if(name1.length==2){  //This if condition checks if there are two words
			name1[0]= name1[0].substring(0, 1).toUpperCase()+name1[0].substring(1).toLowerCase(); //First letter will be upper case and then the rest will be in lower
			name1[1]= name1[1].substring(0).toUpperCase();  //This will capitalize the second word as per requirement.
			System.out.println(name1[0] + " " + name1[1]);
		}
		if(name1.length==3){  //This if loop will word if there are exactly three words in name
			name1[0]= name1[0].substring(0, 1).toUpperCase()+name1[0].substring(1).toLowerCase();
			name1[2]= name1[2].substring(0).toUpperCase();
			if(name1[1].contains("."))  //That means if the second word is for middle name
				name1[1]= name1[1].substring(0).toUpperCase();
			else    /// This else loop will work if the second word is for particle name (i.e this word does not contain '.')
				name1[1]=name1[1].substring(0).toLowerCase();
		
		System.out.println(name1[0] + " " + name1[1]+ " "+ name1[2]);	
			
		}
		

	}
	
	
	
}
