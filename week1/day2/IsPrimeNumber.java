package week1.day2;

public class IsPrimeNumber {
	public boolean isprime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<n-1;i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}
public static void main(String[] args) {
	int number=15;
	IsPrimeNumber s= new IsPrimeNumber();
	Boolean result = s.isprime(number);
	if (result)
	System.out.println("the given number is prime");
	else
	System.out.println("the given number is not a prime");
}
}

