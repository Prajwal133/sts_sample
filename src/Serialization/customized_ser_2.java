package Serialization;

import java.io.*;

class userAccount implements Serializable {
	String username = "Anushka";
	transient String pwd = "Prajwal";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		// encypting pwd
		String encry_pwd = "1232" + pwd;
		oos.writeObject(encry_pwd);
		// encrypting pin
		int epin = pin + 2003;
		oos.writeInt(epin);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		// decrypting pwd
		String d_pwd = (String) ois.readObject();
		pwd = d_pwd.substring(4);
		// decrypting pin
		int epin = ois.readInt();
		pin = epin - 2003;
	}
}

public class customized_ser_2 {

	public static void main(String[] args) throws Exception {
		userAccount a1 = new userAccount();
		System.out.println(a1.username+"---"+a1.pwd+"---"+a1.pin);
		FileOutputStream fos = new FileOutputStream("userAccounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("userAccounts.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		userAccount a2 = (userAccount)ois.readObject();
		
		System.out.println(a2.username+"---"+a2.pwd+"---"+a2.pin);

		oos.close();
		ois.close();
	}

}
