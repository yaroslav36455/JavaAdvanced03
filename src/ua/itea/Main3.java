package ua.itea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main3 {

	public static void main(String[] args) {
		Path path = Paths.get("/home/vessel/Documents/eclipse-workspace/ITEA_Lesson17_Demo/Dog.xml");
		Path pathTarget = Paths.get("/home/vessel/Documents/eclipse-workspace/ITEA_Lesson17_Demo/DogClone.xml");

		System.out.println(path.getRoot());
		System.out.println(Files.exists(path));
		try {
			Files.copy(path, pathTarget, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
