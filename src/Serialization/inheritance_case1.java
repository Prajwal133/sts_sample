package Serialization;
import java.io.*;
// inheritning ser nature form parent to child
class Animal implements Serializable{
	int i = 222;
}
class Lion extends Animal{
	int j = 888;
}
public class inheritance_case1 {

	public static void main(String[] args) throws Exception  {
		Lion l1 = new Lion();
		System.out.println(l1.i+"-------"+l1.j);

		FileOutputStream fos = new FileOutputStream("Animals.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l1);// private method of acc1 class is called
		oos.flush();

		FileInputStream fis = new FileInputStream("Animals.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion l2 = (Lion)ois.readObject();
		
		System.out.println(l2.i+"---"+l2.j);
		oos.close();
		ois.close();
	}

}
