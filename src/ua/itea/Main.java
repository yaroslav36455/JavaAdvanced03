package ua.itea;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		File file = new File("DogFile");
		Owner owner = new Owner();
	    owner.setName("Vasya");
		
		Dog dog = new Dog("Bobik", 5, owner);
 
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(dog);
			
//			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			try (FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				
				Dog dogClone = (Dog) ois.readObject();
				
				dog.getOwner().setName("Petro");
				
				System.out.println(dog);
				System.out.println(dogClone);
				
			} catch (IOException | ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
