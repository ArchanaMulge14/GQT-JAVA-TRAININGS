package com.gqt.oopsproj.pkg1;

class Dog3{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	
	//general setters and getters
	void setData(String a, int b, int c, String d, String e) {
		name=a;
		cost=b;
		age=c;
		color=d;
		breed=e;
     }
	 void getData() {
		 System.out.println(name);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(color);
		 System.out.println(breed);
	 }
}	
public class Code3 {
	public static void main(String[] args) {
		Dog3 d3=new Dog3();
		d3.setData("Rocky", 5000, 5, "White", "GR");
		d3.getData();
	}
}


