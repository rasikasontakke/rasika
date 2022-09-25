package pkg1;

public class Arithmatic {
	public int sum(int a,int b) {
	int c;
	c=a+b;
	System.out.println("Result of sum"+c);
	return c;
	}
	public int sub(int x,int y) {
		int z;
		z=x-y;
		System.out.println("Result of sub"+z);
		return z;
	}
	public void mult(int a1, int a2) {
		int a3;
		a3 = a1 * a2;
		System.out.println("Result of mult" + a3);
	}
	public static void main(String[] args) {
		Arithmatic obj=new Arithmatic();
		int sumResult=obj.sum(10 , 2);
		int subResult=obj.sub(10, 2);
	     obj.mult(sumResult, subResult);
	}
}