package com.yingda.mianshi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Base {

	private static final Charset charset = Charset.forName("UTF-8");

	private static final String key0 = "MAINENCMODEDECODEHNCXZPKL";

	private static byte[] keyBytes = key0.getBytes(charset);

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\material\\USB\\dump\\b.txt");
			Scanner myReader = new Scanner(myObj, "UTF-8");
			StringBuilder sb = new StringBuilder();
			while (myReader.hasNextLine()) {
				sb.append(myReader.nextLine());
				sb.append("\n");
			}
			myReader.close();
			String encode = encode(sb.toString());
			System.out.println(encode);
			File newFile = new File("C:\\material\\USB\\dump\\tempp.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
			String decode = decode(encode);
			writer.write(encode);
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static String encode(String enc) {
		byte[] b = enc.getBytes(charset);
		for (int i = 0, size = b.length; i < size; i++) {
			for (byte keyBytes0 : keyBytes) {
				b[i] = (byte) (b[i] ^ keyBytes0);
			}
		}
		return new String(b);
	}

	public static String decode(String dec) {
		byte[] e = dec.getBytes(charset);
		byte[] dee = e;
		for (int i = 0, size = e.length; i < size; i++) {
			for (byte keyBytes0 : keyBytes) {
				e[i] = (byte) (dee[i] ^ keyBytes0);
			}
		}
		return new String(e);
	}

}
