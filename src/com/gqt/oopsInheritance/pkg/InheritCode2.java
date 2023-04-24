package com.gqt.oopsInheritance.pkg;
class plane{
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
class CargoPlane extends plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane at low heights");
	}
	void carryGood(){
		System.out.println("Cargo Plane carry goods");
	}
}
class FighterPlane extends plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane at great heights");
	}
	void carryWeapon(){
		System.out.println("Fighter Plane carry goods");
	}
}
public class InheritCode2 {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		
		fp.takeOff();
		fp.fly();
		fp.land();	
	}
}
