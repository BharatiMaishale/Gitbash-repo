package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locator {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/*driver.findElement(By.className("textField pwdfield")).sendKeys("manager");	*/

		driver.findElement(By.id("loginButtonContainer")).click();
		/*driver.findElement(By.linkText("View Time-Track")).click();*/
		driver.findElement(By.partialLinkText("View Time")).click();
		
		
		
		
	}

}
