package com.gqt.oopsproj.pkg1;
//Shadowing Problem:
//It is a scenario where the compiler is confused in differentiating between instance and local variables.
//This results in the default values being retained in the instance variables.
    
class Dog4{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	
	//general setters and getters
	void setData(String name, int cost, int age, String color, String breed) {
		name=name;//Shadowing Program
		cost=cost;//Shadowing Program
		age=age;//Shadowing Program
		color=color;//Shadowing Program
		breed=breed;//Shadowing Program
     }
	 void getData() {
		 System.out.println(name);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(color);
		 System.out.println(breed);
	 }
}

public class Code4 {
	public static void main(String[] args) {
		Dog4 d4=new Dog4();
		d4.setData("Rocky", 5000, 5, "White", "GR");
		d4.getData();
	}
}
