package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); 
		WebElement uname =driver.findElement(By.id("username"));
		WebElement pword =driver.findElement(By.id("password"));
		uname.sendKeys("demosalesmanager");
		pword.sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.quit();

	}

}
