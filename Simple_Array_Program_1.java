package learnjava;

public class Simple_Array_Program_1 {
	public static void main(String[] args) {
		
		int[] a= {45,1,3,45,66,7};
		System.out.println("The number of Array Elements ="+a.length);
		System.out.println();
		System.out.println("index\tvalue");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(i+"\t"+a[i]);
		}
	}
}
