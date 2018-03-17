import java.util.*;

public class Collection_ArrayList {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		ArrayList<String> arr= new ArrayList<String>();
		//arr.add("San");
		//arr.add("Ghosh");
		//arr.add("Dantan");
		
		for (int i =0; i<4; i++){
			String j= bucky.next();
			arr.add(j);
		
		}
		
		for (int i =0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}

	}

}
