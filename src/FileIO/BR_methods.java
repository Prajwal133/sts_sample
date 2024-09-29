package FileIO;

import java.io.*;

public class BR_methods {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Bw_file.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

	}

}
