package FileIO;

import java.io.*;

public class F_constructors {

	public static void main(String[] args) throws IOException {
		// same drive in CWD 
		File f = new File("durga123");
		f.mkdir();
		File f1 = new File("durga123", "demo.txt");
		f1.createNewFile();
		
		// in E:\ directory // how to write other drive loaction E://(folder_name)
		File f2 = new File("E://SEM 5","sem5txt_from_STS.txt");
		f2.createNewFile();
		
		// to display all file adn subdir in a specified dir
		int count=0;
	 File f3 = new File("D:\\Java\\Core java");
	String[] s =  f3.list();
		for(String s1 :s) {
			System.out.println(s1);
			count++;
		}
		System.out.println(count);
	// to display only file names
		int countfile = 0;
		for(String s1 :s) {
			File f4 = new File(f3,s1);// CREATONG A FILE CLASS OBJ WHICH IS STORING FILE NAME OBTAINED FROM S 
			if(f4.isFile()) {
			System.out.println(s1);
			countfile++;
			}
		}
		System.out.println("no. of files : "+ countfile);

	}

}
