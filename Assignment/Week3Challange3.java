import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class week3ch3 {
public static void main(String [] args)
{
    Scanner bucky=new Scanner(System.in);
    System.out.println("Enter the input string");
    String s1=bucky.nextLine().replace(" ", "");

    LetterSequence ltr = new LetterSequence(s1);  //class variable which is taking string value to its constructor.

    ltr.displayLetterFrequency(ltr.computeFrequency());
    
    bucky.close();
     }
}


class LetterSequence{
	
	private String sentence;
	
	public LetterSequence(String sentence) {
		this.sentence=sentence.replace(" ", "");   //This is to further Trim the spaces if any
	}
	
	
	TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
	

	public TreeMap<Character,Integer> computeFrequency(){     //This Tree-map method is taking each character from string and appending in a Tree map
		
		
		for(int i = 0; i < sentence.length(); i++){
		       char c = sentence.charAt(i);
		       Integer val = map.get(new Character(c));
		       if(val != null){
		         map.put(c, new Integer(val + 1));
		       }else{
		         map.put(c,1);
		       }
		    } return map;
	}
	
	public void displayLetterFrequency(TreeMap<Character,Integer> map){  //This method is taking the value from Tree map and displaying the count of each.
		
		 for(Map.Entry<Character,Integer> en:map.entrySet()){
		        int count=en.getValue();
		        System.out.printf("%c : ",en.getKey());
		        for(int i=0;i<count;i++)
		        System.out.printf("*");

		        System.out.printf("\n");
		    }
		
	}
	
}
