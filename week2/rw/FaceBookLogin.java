package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement uname =driver.findElement(By.id("email"));
		WebElement pword =driver.findElement(By.id("pass"));
		uname.sendKeys("testleaf.2023@gmail.com");
		pword.sendKeys("Tuna@321");	
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(driver.getTitle());
	}

}
