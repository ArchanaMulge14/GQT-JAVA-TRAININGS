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
class Player1 extends Object
{
	Player1(){
		super();
	}
}
class Cricketer2 extends Player1{  //extends Object is the line added by the compiler
	String name;
	String country;
	int age;
	int jersey_no;
	int runs;
	//ZERO-PARAMETERIZED CONSTRUCTOR
	public Cricketer2(String name, String country, int age, int jersey_no, int runs) {
		super();//If it not mentioned by programmer, compiler will add it automatically
		this.name=name;
		this.country=country;
		this.age=age;
		this.jersey_no=jersey_no;
		this.runs=runs;
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
public class Constructor2 {
	public static void main(String[] args) {
		Cricketer2 c2 = new Cricketer2("Dhoni", "India", 45, 7, 20000);
		
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getRuns());
		System.out.println(c2.getCountry());
		System.out.println(c2.getJersey_no());
		
	}
}
