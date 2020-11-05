package ua.itea;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main4 {

	public static void main(String[] args) {
		MyInterface mi = new SomeOtherClass();
		SomeClass sc = new SomeClass();
		
		MyInterface mi2 = new MyInterface() {
			
			@Override
			public void doSomething() {
				System.out.println("iarstenirst");
			}
		};
		
//		sc.method(new MyInterface() {
//			
//			@Override
//			public void doSomething() {
//				System.out.println("iarstenirst");
//			}
//		});
		
		sc.method(()-> System.out.println("FWPPW"));
		
		sc.methodX(new SomeInterfaceX() {
			
			@Override
			public void someMethod(int i, String str) {
				System.out.println(i + "|" + str);
			}
		});
		
		sc.methodX((a, b) -> {
			System.out.println(a + "|" + b);
		});
		
		System.out.println("*********");
		
		Dog dog1 = new Dog("Bobik", 8, null);
		Dog dog2 = new Dog("Suslik", 3, null);
//		Comparator<Dog> comp = new Comparator<Dog>() {
//
//			@Override
//			public int compare(Dog o1, Dog o2) {
//				return o1.getAge() - o2.getAge();
//			}
//			
//		};
		Set<Dog> treeSet = new TreeSet<>((obj1, obj2) -> obj1.getAge() - obj2.getAge());
		
		treeSet.add(dog1);
		treeSet.add(dog2);
		
		System.out.println(treeSet);
		
		List<String> list = Arrays.asList("Str1", "tr2", "Str3", "Str2", "Str1").stream().filter(e -> e.startsWith("S")).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(list);
		
		Arrays.asList(456, 5, -123, 349576, 4).stream().sorted().forEach(System.out::println);
		
		Arrays.asList(dog1, dog2).stream().sorted((obj1, obj2) -> obj1.getAge() - obj2.getAge()).forEach(System.out::println);
	}

}
