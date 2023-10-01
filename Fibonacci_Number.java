package learnjava;
import java.util.Scanner;

public class Fibonacci_Number {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number=");
		int n=sc.nextInt();
		int f0=0,f1=1,f;
		System.out.print("Frist "+n+" fibonacci numbers are:\n");
		System.out.print(f0+",");
		for(int i=0; i<n; i++) {
			f=f0+f1;
			System.out.print(""+f+",");
			f1=f0;
			f0=f;
			
		}
	}

}
