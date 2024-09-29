package FileIO;

import java.io.*;

public class BW_methods {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("Bw_file.txt");
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(100);
       bw.newLine();
       char [] ch = {'a','b','c'};
       bw.write(ch);
       bw.newLine();
       bw.write("durga");
       bw.newLine();
       bw.write("solutions");
       bw.close();
       
       // auto fw is closed by closing bw 
       
	}

}
