package Serialization;

import java.io.*;

    class dog1 implements Serializable {
	cat1 c = new cat1();
    }
	class cat1 implements Serializable {
		rat1 r = new rat1();
	}

	class rat1 implements Serializable {
		int i = 10;
	}

public class Object_Graph {

	public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("xyz-ser.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    dog1 d1 = new dog1();
    oos.writeObject(d1);
    
	FileInputStream fis = new FileInputStream("xyz-ser.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	dog1 d2 = (dog1)ois.readObject();
	System.out.println(d2.c.r.i);
	oos.close();
	ois.close();
	}

}
