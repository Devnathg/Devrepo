package method;

public class sumnumber {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("sub result is"+c1);
		return c1;
		}
	public int mul(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("mul result is"+c2);
		return c2;
		}
	public void Div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("Final result is"+c3);
		
	}
public static void main(String[] args) {
	
	sumnumber ob=new sumnumber();
	int sum1=ob.sum(10, 2);
	int sum2=ob.sum(sum1, 2);
	int sub1=ob.sub(sum2, 2);
	int mul1=ob.mul(sub1, 2);
	ob.Div(mul1, 2);
	
	
}
}
