package com.gqt.pillarsofoops.pkg;
//PROGRAM CONTAINING PILLARS OF OPPS
import java.util.Scanner;
abstract class Shapes{
	double area;
	
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}///abstraction

class Square extends Shapes{
	double side;
	@Override 
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side: ");
		side=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=side*side;//area variable is an inherited variable from the Shape class
	}
}

class Circle extends Shapes{
	private double radius;
	final double pi=3.147;
	@Override 
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=pi*radius*radius;//area variable is an inherited variable from the Shape class
	}
}

class Rectangle extends Shapes{
	private double l,b;
	final double pi=3.147;
	@Override 
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		l=sc.nextDouble();
		System.out.println("Enter the breadth: ");
		b=sc.nextDouble();
	}
	@Override
	void calculate() {
		area=l*b;//area variable is an inherited variable from the Shape class
	}
}

//Polymorphism
class Geometry{
	void ShapeOps(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
public class Launch {
	public static void main(String[] args) {
		Square s=new Square();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		Geometry g=new Geometry();
		g.ShapeOps(s);
		g.ShapeOps(c);
		g.ShapeOps(r);
	}
}
