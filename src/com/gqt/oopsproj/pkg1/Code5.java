package com.gqt.oopsproj.pkg1;
//Solution to Shadowing problem:
//The usage of this keyword with instance variables will help the compiler to recognize the instance 
//and local variables.
//The variables with this keyword association is the instance variable.
//Instance variables are also called as Object variables as they will be getting memories along with Object.
class Dog5{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	
	//general setters and getters
	void setData(String name, int cost, int age, String color, String breed) {
		this.name=name;//Shadowing Program
		this.cost=cost;//Shadowing Program
		this.age=age;//Shadowing Program
		this.color=color;//Shadowing Program
		this.breed=breed;//Shadowing Program
     }
	 void getData() {
		 System.out.println(name);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(color);
		 System.out.println(breed);
	 }
}
public class Code5 {
	public static void main(String[] args) {
		Dog5 d5=new Dog5();
		d5.setData("Rocky", 5000, 5, "White", "GR");
		d5.getData();
	}
}
