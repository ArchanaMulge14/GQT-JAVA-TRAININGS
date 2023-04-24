package com.gqt.oopsInheritance.pkg;
/*
 * Polymorphism: It is the way representing 1:M relation
 * Parent type reference to child objects
 */
class plane1{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {//Overridden method
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane1 extends plane1{
	@Override
	void fly() {
		System.out.println("Cargo Plane at low heights");
	}
	void carryGood(){
		System.out.println("Cargo Plane carry goods");
	}
}
class FighterPlane1 extends plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane at great heights");
	}
	void carryWeapon(){
		System.out.println("Fighter Plane carry goods");
	}
}
public class InheritCode3 {
	public static void main(String[] args) {
		CargoPlane1 cp1=new CargoPlane1();
		FighterPlane1 fp1=new FighterPlane1();
		
		plane1 ref;//parent reference
		
		ref=cp1;//address of CargoPlane object is now available with ref also
		ref.takeOff();
		ref.fly();
		ref.land();
		cp1.carryGood();//we cannot give parent reference to specialized methods of the child class
		
		ref=fp1;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp1.carryWeapon();
	}
}
