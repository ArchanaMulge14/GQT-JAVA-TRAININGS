package com.gqt.oopsproj.pkg1;
//Example program where Encapsulation is not present
class Dog{
	String name;
	int cost;
	int age;
	String color;
	String breed;
}
public class Code1 {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="tommy";
		d1.cost=2000;
		d1.age=3;
		d1.color="Brown";
		d1.breed="GR";
	}
}
//As seen in the above code we are able t access the properties of Dog
//inside the main class directly by creating the object of dog.

//As per encapsulation these properties are considered as most important 
//components. Hence these must not be directly accessible outside the class.