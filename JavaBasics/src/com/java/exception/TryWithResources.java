package com.java.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResources {
	// Try with resources
	public static void writeData(Path path1, Path path2) throws IOException {
		
		try (BufferedReader in = Files.newBufferedReader(path1); // passing as an argument
				BufferedWriter out = Files.newBufferedWriter(path2);) {
			out.write(in.readLine());
		} // when it comes out of try block, automatically reader and writer gets closed
			// Hence the need of finally block can be eliminated in this case (From Java 7)
	}
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\bhavy\\OneDrive\\Desktop\\Test1.txt");
		Path path2 = Paths.get("C:\\Users\\bhavy\\OneDrive\\Desktop\\Test2.txt");
		writeData(path, path2);
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			String name = scanner.next();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			scanner.close();
		}
	}
}
