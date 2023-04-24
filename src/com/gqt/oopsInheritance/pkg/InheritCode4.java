package com.gqt.oopsInheritance.pkg;
class plane2{
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
class CargoPlane2 extends plane2{
	@Override
	void fly() {
		System.out.println("Cargo Plane at low heights");
	}
	void carryGood(){
		System.out.println("Cargo Plane carry goods");
	}
}
class FighterPlane2 extends plane2{
	@Override
	void fly() {
		System.out.println("Fighter Plane at great heights");
	}
	void carryWeapon(){
		System.out.println("Fighter Plane carry goods");
	}
}
class Airport{
	void permitPlane(plane2 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class InheritCode4 {
	public static void main(String[] args) {
		CargoPlane2 cp2=new CargoPlane2();
		FighterPlane2 fp2=new FighterPlane2();
		
		Airport a = new Airport();
		
		a.permitPlane(cp2);	
		cp2.carryGood();//we cannot give parent reference to specialized methods of the child class
		
		a.permitPlane(fp2);
		fp2.carryWeapon();
	}
}
