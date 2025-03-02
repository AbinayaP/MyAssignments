package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,m=1;
		int sum ;
		System.out.println(n);
		System.out.println(m);
		for (int i=1;i<7;i++) {
			sum= n+m;
			n=m;
			m=sum;
			System.out.println(sum);
		}

	}

}
