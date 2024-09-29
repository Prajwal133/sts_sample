package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Remove_duplicates {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("dp_output.txt");

		File inf = new File("dp_input.txt");
		BufferedReader br = new BufferedReader(new FileReader(inf));

		String line = br.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader dpbr = new BufferedReader(new FileReader("dp_output.txt"));
			String target = dpbr.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				
				target = dpbr.readLine();
			}
			if (available == false) {
				pw.println(line);
				pw.flush();

			}
			line = br.readLine();
		}
		br.close();
		pw.close();

	}

}
