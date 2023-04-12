package com.gqt.oopsproj.pkg1;
import java.lang.String;
class Dog2{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	
	//Implementation of Getter and Setter methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Code2 {
	public static void main(String[] args) {
		Dog2 d2=new Dog2();
		d2.setName("Snoopy");
		d2.setCost(2000);
		d2.setAge(3);
		d2.setColor("Brown");
		d2.setBreed("GR");
		
		System.out.println(d2.getName());
		System.out.println(d2.getCost());
		System.out.println(d2.getAge());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());		
	}
}
