package ua.itea;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		File file = new File("/home/vessel/Documents/eclipse-workspace/ITEA_Lesson17_Demo");
		
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isFile());
//		System.out.println(file.getParent());
		
		while (true) {
			System.out.println("-------");
			for (File f : file.listFiles()) {
				if (f.isDirectory()) {
					System.out.println(f.getName());	
				}
			}
			System.out.println("-------");
			
			for (File f : file.listFiles()) {
				if (f.isFile()) {
					System.out.println(f.getName());	
				}
			}
			
			Scanner scanner = new Scanner(System.in);
				
			scanner.nextLine();
			file = file.getParentFile();
			
		}
		
	}

}
