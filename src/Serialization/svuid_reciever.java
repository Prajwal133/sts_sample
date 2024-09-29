package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class svuid_reciever {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("svuid_file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SVUID s2 = (SVUID) ois.readObject();
		System.out.println(s2.i+"---"+s2.j+"---"+s2.k+"---"+s2.l);
		ois.close();

	}

}
