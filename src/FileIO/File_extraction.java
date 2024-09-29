package FileIO;
import java.io.*;

// FILE EXTRACTION PROGRAM

public class File_extraction {
// output = input - delete
	public static void main(String[] args) throws IOException {
    File inf = new File("input.txt");
    File df = new File("delete.txt");
 /*    ~~~~~~~~~~~~~~~~~ Files and date required for exapmle added~~~~~~~~~~~~~~~~~~
    PrintWriter pw1 = new PrintWriter(f);
    PrintWriter pw2 = new PrintWriter(df);
    pw1.println(111);
    pw1.println(222);
    pw1.println(333);
    pw1.println(444);
    pw1.println(555);
    pw1.println(666);
    pw1.println(777);
    pw1.println(888);
    pw1.println(999);
    
    pw2.println(888);
    pw2.println(222);
    pw2.println(555);
  
    
    pw1.flush();
    pw2.flush();
    pw1.close();
    pw2.close();
    
    */ 
		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader(inf));
		String line = br.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader dbr = new BufferedReader(new FileReader(df));
			String target = dbr.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = dbr.readLine();
			}
			if (available == false) {
				pw.println(line);
			}
			line=br.readLine();
		}
		br.close();
		pw.flush();
		pw.close();
		
	}

}
