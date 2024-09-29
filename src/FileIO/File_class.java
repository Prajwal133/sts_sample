package FileIO;

import java.io.File;
import java.io.IOException;

public class File_class {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("durga123");
		System.out.println(f1.exists());

		f1.mkdir();
		System.out.println(f1.exists());

	}

}
