
class series {
	static int count=6;
		
	}
public class simple_series {
	public static void main(String[] args) {
		
		series s =new series();
		for (int i=0; i<=series.count; i++){   //Note: here class name is directly being used to take once integer variable of that class.
			System.out.print(i + " ");
		}
	}
}
