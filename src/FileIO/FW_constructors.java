package FileIO;

import java.io.*;

public class FW_constructors {
// writing data by using file writer --> Fw is like a pipeline to the file through which data is transferred
	public static void main(String[] args) throws IOException {
		
		// we can also append just write true in place of flase 
		FileWriter fw = new FileWriter("rohit.txt",false);
		fw.write(100);// this is d
		fw.write("urga\nSoftware Solutions");
		fw.write("\n");
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}

}
