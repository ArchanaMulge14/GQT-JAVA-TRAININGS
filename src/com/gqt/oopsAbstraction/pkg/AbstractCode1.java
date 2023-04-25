package com.gqt.oopsAbstraction.pkg;
//abstract class
abstract class Animal{
	abstract void eat();
	void sleep() {
		System.out.println("Animal sleeps");	
		}
}

class Elephant extends Animal{
	@Override
	void eat() {
		System.out.println("Elephant eats fruits and grass.");	
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
	System.out.println("Tiger eats fresh meat");	
	}
}

class Monkey extends Animal{
	@Override
	void eat() {
	System.out.println("Monkey eats fruits and grass");	
	}
}

class Forest{
	void allowAnimal(Animal a) {
		a.eat();
		a.sleep();
	}
}
public class AbstractCode1 {
	public static void main(String args[]) {
		Elephant e=new Elephant();
		Tiger t=new Tiger();
		Monkey m=new Monkey();
		
		Forest f=new Forest();
		f.allowAnimal(e);
		f.allowAnimal(t);
		f.allowAnimal(m);
	}
}
