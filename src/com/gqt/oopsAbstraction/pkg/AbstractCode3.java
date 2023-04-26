package com.gqt.oopsAbstraction.pkg;
abstract class Calculator1{
	abstract void add();
	abstract void sub();
}
public class AbstractCode3 {
	public static void main(String[] args) {
		Calculator1 c1=new Calculator1() {
			@Override
			void add() {
				System.out.println("ADD");
			}
			@Override
			void sub() {
				System.out.println("SUB");
			}
		};
		System.out.println(c1);
	}
}
