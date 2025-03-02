package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b2= new Browser();
		String s=b2.launchBrowser("Edge");
		System.out.println(s);
		b2.loadUrl();
	}

}
