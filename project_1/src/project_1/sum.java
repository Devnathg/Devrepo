package project_1;

public class sum {
	public static void main(String[] args) {
		int n=1236773956;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
