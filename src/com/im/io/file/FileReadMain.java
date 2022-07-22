package com.im.io.file;

import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileRead fr = new FileRead();
		try {
			fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
