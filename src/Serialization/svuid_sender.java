package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class svuid_sender {

	public static void main(String[] args) throws Exception{
		SVUID s1 = new SVUID();
		FileOutputStream fos = new FileOutputStream("svuid_file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
	}

}
