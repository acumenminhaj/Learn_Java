package learnjava;

public class FibonacciNumber_using_Array {
	public static void main(String[]args) {
		final int Array_length=10;
		int[] a= new int[Array_length];
		
		for (int i=0; i<a.length;i++) {
			a[i]=fib(i);
			}
		System.out.println("index\tvalue");
		for (int i=0; i<a.length; i++) {
			System.out.println(i+"\t"+a[i]);
		}
	}
public static int fib(int n) {
	if (n<=1) {
		return n;
	}
	else {
		return fib(n-1)+fib(n-2);
		
		}
	}
	

}
