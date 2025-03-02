package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 133;
		int original_number= 133;
		int output =0;int s;
		while(number>0) {
			s = number%10;
			output=(output*10)+s;
			number=number/10;
			
		}
		if(original_number==output) {
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}

}
