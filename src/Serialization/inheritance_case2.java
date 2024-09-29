package Serialization;

import java.io.*;

//parent class is non serializable --> 4 rules 

class vehicle  {
	int i =10;
	vehicle() {
		System.out.println("parent class no-arg constructor");
	}
}

class bike extends vehicle implements Serializable{
	int j = 20;

	bike() {
		System.out.println("child class no-arg constructor");
	}
}

public class inheritance_case2 {

	public static void main(String[] args) throws Exception {
		bike b1 = new bike();// parent and child class both const are called when child class obj is being created 
		
		b1.i=888;
		b1.j=999;
		
		System.out.println(b1.i + "-------" + b1.j);

		FileOutputStream fos = new FileOutputStream("inheritance_case2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);// private method of acc1 class is called
		
		System.out.println("<-- Deserialization started -->");
		FileInputStream fis = new FileInputStream("inheritance_case2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		bike b2 = (bike) ois.readObject();
		
		System.out.println(b2.i + "---" + b2.j);
		oos.close();
		ois.close();
	}

}
