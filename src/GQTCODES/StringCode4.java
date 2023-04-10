package GQTCODES;

public class StringCode4 {
	public static void main(String[] args) {
		String s1="Global";
		String s2="GLOBAL";
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}

}
