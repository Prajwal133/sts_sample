package Serialization;

import java.io.*;
// when order of ser is known to us
// dog class already implemented in this pkg in serilize_demo

class Cat implements Serializable {
	int i = 110;
	int j = 220;
}

class Rat implements Serializable {
	int i = 1110;
	int j = 2220;
}

public class multi_obj_ser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		
		FileOutputStream fos = new FileOutputStream("transient_abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);

		FileInputStream fis = new FileInputStream("transient_abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// order of deser matters
		Dog d2 = (Dog) ois.readObject();
		Cat c2 = (Cat) ois.readObject();
		Rat r2 = (Rat) ois.readObject();
		System.out.println(d2.i+"---"+d2.j);
		System.out.println(c2.i+"---"+c2.j);
		System.out.println(r2.i+"---"+r2.j);
		oos.close();
		ois.close();
	}

}
