package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class acc1 implements Serializable{
	String username = "prajwal";
	transient String pwd = "Anushka";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		// encypting pwd
		String encry_pwd = "1232" + pwd;
		oos.writeObject(encry_pwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		// decrypting pwd
		String d_pwd = (String) ois.readObject();
		pwd = d_pwd.substring(4);
	}
}

public class Customized_ser {

	public static void main(String[] args) throws Exception {
		acc1 a1 = new acc1();
		System.out.println(a1.username + "-----" + a1.pwd);
		FileOutputStream fos = new FileOutputStream("accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);// private method of acc1 class is called

		FileInputStream fis = new FileInputStream("accounts.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		acc1 a2 = (acc1)ois.readObject();
		
		System.out.println(a2.username + "-----" + a2.pwd);

		oos.flush();
		oos.close();
		ois.close();

	}

}
