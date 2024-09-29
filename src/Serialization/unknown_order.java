package Serialization;

import java.io.*;
// when order of the serialization  is unknown 

public class unknown_order {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("transient_abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for (int i = 0; i < 3; i++) {
			Object obj = ois.readObject();
			if (obj instanceof Dog) {
				Dog d2 = (Dog) obj;
				// perfrom dog specific operations
				System.out.println(d2.i + "---" + d2.j);

			} else if (obj instanceof Cat) {
				Cat c2 = (Cat) obj;
				// perfrom cat specific operations
				System.out.println(c2.i + "---" + c2.j);
			} else if (obj instanceof Rat) {
				Rat r2 = (Rat) obj;
				// perfrom rat specific operations
				System.out.println(r2.i + "---" + r2.j);
			}
		}
		ois.close();
	}

}
