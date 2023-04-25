package com.gqt.oopsAbstraction.pkg;
//abstract class
abstract class Plane{
    void takeOff() {
		System.out.println("Plane is flying");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane Landed");
	}
}
class passengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane Flying");
	}	
}
class cargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane Flying");
	}
}
class fighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane Flying");
	}
}
class airport{
	void permitPlane(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}
public class AbstractCode2 {
	public static void main(String args[]) {
		passengerPlane pp=new passengerPlane();
		cargoPlane cp=new cargoPlane();
		fighterPlane fp=new fighterPlane();
		
		airport a=new airport();
		a.permitPlane(pp);
		a.permitPlane(cp);
		a.permitPlane(fp);
	}
}
