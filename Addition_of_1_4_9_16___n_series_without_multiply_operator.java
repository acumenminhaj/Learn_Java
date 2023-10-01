package learnjava;

import java.util.Scanner;

public class Addition_of_1_4_9_16___n_series_without_multiply_operator {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); 
        int sum = 0;
        int c= 1;
        int od = 3;
        System.out.print("1");

        for (int i = 1; i <n; i++) {
        	sum += c;
            c=c+ od;
            System.out.print("+"+c);
            od =od+ 2; 
            
            
            
    	    
        }
        sum += c;
        
        System.out.println("");
        System.out.println("Sum of the series: " + sum);
        

    }


}
