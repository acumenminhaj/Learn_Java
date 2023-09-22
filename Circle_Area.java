package java_trial;
import java.util.Scanner;


public class Circle_Area {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius:");
		int r= sc.nextInt();
		
		double area=Math.PI*r*r ;
		System.out.print(" Circle_Area is:"+area);
		
				
	}
		

}
