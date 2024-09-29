package FileIO;

import java.io.*;

public class pw_example {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		PrintWriter pw = new PrintWriter(f);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println(10.345);
		pw.print('A');
		pw.print("JAVA --> ");
		pw.println("Durga Software Solutions");
		pw.flush();
		pw.close();
		System.out.println("finished");

	}

}
