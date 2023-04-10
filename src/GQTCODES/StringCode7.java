package GQTCODES;

public class StringCode7 {
	public static void main(String[] args) {
		String s1="Sita";
		String s2="Rama";
		
		//s1.concat(s2);//Immutable
		s1=s1.concat(s2);//mutable
		
		System.out.println(s1);
	}

}
