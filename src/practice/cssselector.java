package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		
		 
		driver.findElement(By.cssSelector("a#loginButton")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("[class='item active']")).click();
		
		//driver.findElement(By.linkText("View Time-Track")).click();
		driver.findElement(By.partialLinkText("View Time")).click();
	}

}
