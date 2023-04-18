package com.gqt.oopsconstructor.pkg;
class Player2 extends Object
{
	Player2(){
		super();
	}
}
class Cricketer3 extends Player1{  //extends Object is the line added by the compiler
	String name;
	String country;
	int age;
	int jersey_no;
	int runs;
	//PARAMETERIZED CONSTRUCTOR
	public Cricketer3(String name, String country, int age, int jersey_no, int runs) {
		this();//this is used for promoting the local chaining of constructors
		System.out.println("Entered back the parameterized constructor");
		this.name=name;
		this.country=country;
		this.age=age;
		this.jersey_no=jersey_no;
		this.runs=runs;
	}
	public Cricketer3() {
		super();
		System.out.println("Entered the zero parameterized constructor");	
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
public class Constructor3 {
	public static void main(String[] args) {
		Cricketer3 c3 = new Cricketer3("Dhoni", "India", 45, 7, 20000);
		
		System.out.println(c3.getName());
		System.out.println(c3.getAge());
		System.out.println(c3.getRuns());
		System.out.println(c3.getCountry());
		System.out.println(c3.getJersey_no());
	}
}
