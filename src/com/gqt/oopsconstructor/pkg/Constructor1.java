package com.gqt.oopsconstructor.pkg;

/*
 * class Object{
 * Object(){
 *   -------
 *   ------
 *   ------
 *   }
 * }
 */
class Player extends Object
{
	Player(){
		super();
	}
}
class Cricketer extends Player{  //extends Object is the line added by the compiler
	String name;
	String country;
	int age;
	int jersey_no;
	int runs;
	//ZERO-PARAMETERIZED CONSTRUCTOR
	public Cricketer() {
		super();//If it not mentioned by programmer, compiler will add it automatically
		name="Virat";
		country="India";
		age=37;
		jersey_no=10;
		runs=30000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJersey_no() {
		return jersey_no;
	}
	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
}
public class Constructor1 {//Launch
	public static void main(String[] args) {
		Cricketer c=new Cricketer();
		
		c.setName("Virat");
		c.setAge(37);
		c.setRuns(3000);
		c.setCountry("India");
		c.setJersey_no(10);
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getRuns());
		System.out.println(c.getCountry());
		System.out.println(c.getJersey_no());	
	}
}
