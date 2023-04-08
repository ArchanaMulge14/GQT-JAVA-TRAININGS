package GQTCODES;
import java.util.Scanner;
public class ArrayCode4 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the count of the school:");
			int scl=sc.nextInt();
			
			int arr[][][]=new int[scl][][];
			//taking class count
			for(int i=0;i<arr.length;i++) {
				System.out.println("enter the count of the classes inside the school"+(i+1));
				arr[i]=new int[sc.nextInt()][];
			}
				//taking student count
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside School"+(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("Enter the count of the students inside the class"+(j+1));
						arr[i][j]=new int[sc.nextInt()];
					}
				}
				for(int i=0;i<arr.length;i++) {
					System.out.println("inside School:"+(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("inside class:"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println("Enter the marks of the student:"+(k+1));
							arr[i][j][k]=sc.nextInt();
				}
			}
		}
				for(int i=0;i<arr.length;i++) {
					System.out.println("inside School:"+(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("inside class:"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println("inside Students:"+(k+1)+"is:"+arr[i][j][k]);
					
				}
			}
	    }
	}
}

