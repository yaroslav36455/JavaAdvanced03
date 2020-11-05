package ua.itea;

public class SomeClass {
	private int i = 88;
	private String str = "TEXT";
	
	public void method(MyInterface mi) {
		mi.doSomething();
	}
	
	public void methodX(SomeInterfaceX six) {
		six.someMethod(i, str);
	}
}
