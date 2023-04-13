package com.gqt.oopsproj.pkg1;

class Cricketer{
	String name;
	String country;
	int age;
	int jersy_no;
	int runs;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	//getter
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getRuns() {
			return runs;
		}
		public String getCountry() {
			return country;
		}
		public int getJersy_no() {
			return jersy_no;
		}
}
public class Code6 {
	public static void main(String[] args) {
		Cricketer c1=new Cricketer();
		c1.setName("SachinT");
		c1.setAge(45);
		c1.setRuns(6992);
		c1.setCountry("India");
		c1.setJersy_no(7);
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getRuns());
		System.out.println(c1.getCountry());
		System.out.println(c1.getJersy_no());
	}
}
