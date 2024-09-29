package Serialization;

import java.io.*;


class Dogs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i = 1230;
	transient int j = 2450;
}

public class transient_demo {

	public static void main(String[] args) throws Exception {
		Dogs dg = new Dogs();

		FileOutputStream fos = new FileOutputStream("transient_abc.txt");// --1
		ObjectOutputStream oos = new ObjectOutputStream(fos);// --2
		oos.writeObject(dg);// --3

		FileInputStream fis = new FileInputStream("transient_abc.txt");// --4
		ObjectInputStream ois = new ObjectInputStream(fis);// --5
		Dogs d3 = (Dogs)ois.readObject();// --6

		System.out.println(d3.i + "----" + d3.j);
		ois.close();
		oos.close();
	}

}
