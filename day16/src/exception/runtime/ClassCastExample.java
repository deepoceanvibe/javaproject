package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog) da;
		System.out.println(new StringBuffer("타입 변환 성공 : Animal -> Dog"));
		
		Animal c = new Cat();
		Dog d2 = (Dog)c;
		System.out.println(new StringBuffer("타입 변환 실패 : Dog -> Cat"));
	}

}
