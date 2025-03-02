package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b1= new Browser();
		String s=b1.launchBrowser("Chrome");
		System.out.println(s);
		b1.loadUrl();

	}

}
