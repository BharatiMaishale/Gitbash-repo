package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Practicelocators
{
public static void main(String[] args)
{

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.manage().window().maximize();
	//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");

    driver.findElement(By.cssSelector("a[id='loginButton']")).click();



}
}
