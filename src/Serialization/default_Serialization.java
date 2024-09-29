package Serialization;

import java.io.*;
// This is default serialization
class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username = "prajwal";
	transient String pwd = "Anushka";
}

public class default_Serialization {

	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.username + "-----" + a1.pwd);
		FileOutputStream fos = new FileOutputStream("accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("accounts.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.username + "-----" + a2.pwd);

		oos.flush();
		oos.close();
		ois.close();

	}

}
