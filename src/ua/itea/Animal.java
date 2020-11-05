package ua.itea;

import java.io.Serializable;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		name = "Suslik";
		age = 12;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
