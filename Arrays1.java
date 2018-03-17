import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] arr ={12,34,45,6,78};
		
		//System.out.printf("%d", arr[2]);
		Arrays.sort(arr);
		String check = Arrays.toString(arr);
		System.out.printf("%s", check + "\n");
		for (int i =0; i<arr.length;i++)
			System.out.println(arr[i]);

	}
}
