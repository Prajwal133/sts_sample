package FileIO;

import java.io.*;

public class merge_files_eg1 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br.close();
		br = new BufferedReader(new FileReader("rohit.txt"));
		String line2 = br.readLine();
		while (line2 != null) {
			pw.println(line2);
			line2 = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();

	}

}
