package FileIO;

import java.io.*;

public class FR_methods {

	public static void main(String[] args) throws IOException {
		File f = new File("rohit.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
	fr.close();
// this method only within int range if our file has more than int range go for 1st approach
	FileReader fr1 = new FileReader(f);
		System.out.println("\n****************************");
		char [] ch = new char[(int)f.length()];// length() has long return type nad it gives no. of chars in file
		fr1.read(ch);
		for(char ch1 : ch) {
			System.out.print(ch1);
		}
		
		fr1.close();
	}

}
