package Serialization;

import java.io.*;

// basic struture of serialization and Deserialization

// if we don't implement serializable interface it can't be serialized and wll get RE 
class Dog implements Serializable{
	
	int i = 10;
	int j = 20;
}

public class Serialize_demo {

	public static void main(String[] args) throws Exception {
		// file extension can be anything
		Dog d1 = new Dog();
		// line 1-3 basic serialization of object hapening
		FileOutputStream fos = new FileOutputStream("xyz-ser.txt");//--1
		ObjectOutputStream oos = new ObjectOutputStream(fos);//--2
		oos.writeObject(d1);//--3
		
		// line 4-6 deserialization
		FileInputStream fis = new FileInputStream("xyz-ser.txt");//--4
		ObjectInputStream ois = new ObjectInputStream(fis);//--5
		Dog d2 = (Dog)ois.readObject();//--6
		
		System.out.println(d2.i +"----"+d2.j);
		ois.close();
		oos.close();
	}

}
