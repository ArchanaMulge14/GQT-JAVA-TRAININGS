package com.gqt.oopsInheritance.pkg;
class Parent{
	void walk() { //inherited method
		System.out.println("Parent walk in a brisk manner");
	}
	void eyeColor() {  //Overridden
		System.out.println("Parent Eye color is black");
	}
}
class child extends Parent{
	@Override //annotation used to indicate that the method is an overriden method
	void eyeColor() {  //Overridden method
		System.out.println("Child's Eye color is changed to blue");
	}
	void swim() {//specialized method
		System.out.println("Child can swim");
	}
}

public class InheritCode1 {
	public static void main(String[] args) {
		child c=new child();
		c.walk();
		c.eyeColor();
		c.swim();
    }
}
