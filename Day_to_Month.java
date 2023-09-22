package java_trial;
import java.util.Scanner;
public class Day_to_Month{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Day=");
		int day= sc.nextInt();
		int month=day/30;
		int newday=day-(month*30);
		System.out.print(day+" Day is equal to "+month+" months and "+newday+" days");
	}
		
}

