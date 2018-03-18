

import java.util.*;

public class week1ch2 {

	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		int a = bucky.nextInt();
		int b =bucky.nextInt();
		int c = bucky.nextInt();
		int d =bucky.nextInt();
		int e =bucky.nextInt();
		//String str1 = Integer.toString(a);
		//System.out.println(Integer.toString(a)+ " "+Integer.toString(b)+ " "+Integer.toString(c)+ " "+Integer.toString(d)+ " "+Integer.toString(e));
		bucky.close();
		//System.out.println(calculate (a,b,c,d,e));
		calculate (a,b,c,d,e);
		
	}
	
	public static int calculate(int a, int b, int c, int d, int e) {
		//System.out.println("Santanu");
		
		int totalweight = a;
		int remainingweight = (b+c+d+e);
		
		if (totalweight >= remainingweight) {
			System.out.println(3);
		}
		
		else {
			if ((b+c+d <= totalweight) || (b+c+e <= totalweight) || (b+d+e<= totalweight) ) {
				System.out.println(2);
			}
			else {
				if ((b+c <= totalweight) || (b+d <= totalweight) || (b+e <= totalweight)) {
					System.out.println(1);
				}
				else {
					System.out.println("None");
				}
			}
		} 
				
		return 0;
	}
	
}
