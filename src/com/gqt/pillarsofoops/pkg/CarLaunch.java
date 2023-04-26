package com.gqt.pillarsofoops.pkg;

abstract class Car{
	String color;
	int price;
	int year;
	String city;

	void color() {
		System.out.println("Car color is blue");
	}
	
	void price() {
		System.out.println("Car price is Rs.345000");
	}
	abstract void year();
	abstract void city();

	
}
class Innova extends Car{
	@Override
	void year() {
		System.out.println("Innova established in the year 2001");
	}
	@Override
	void city() {
		System.out.println("Innova is more used in Delhi");
	}
	
}//abstract and non abstract functionality

class Road{
	void CarRd(Car c) {
		c.color();
		c.price();
		c.year();
		c.city();		
	}
}
public class CarLaunch {
	public static void main(String[] args) {
		Innova i=new Innova();
		Road r=new Road();
		r.CarRd(i);
	}
}
