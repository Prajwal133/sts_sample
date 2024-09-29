package Serialization;

import java.io.*;

public class SVUID implements Serializable {

	private static final long serialVersionUID = 1L;
	int i = 10;
	int j = 20;
	int k = 30;// added after compiling sender gives error in def SVUID
	// but not in custommized our own SVUID
	int l = 2000;

	public static void main(String[] args) {

	}

}
