//The following program recursively lists the contents of a given directory (similar to Unix's "ls -r" command).
import java.io.File;
public class Fileread {
	   public static void main(String[] args) {
	      File dir = new File("d:\\myproject\\test");  // Escape sequence needed for '\'
	      listRecursive(dir);
	   }
	   
	   public static void listRecursive(File dir) {
	      if (dir.isDirectory()) {
	         File[] items = dir.listFiles();
	         for (File item : items) {
	            System.out.println(item.getAbsoluteFile());
	            if (item.isDirectory()) listRecursive(item);  // Recursive call
	         }
	      }
	   }
	}
