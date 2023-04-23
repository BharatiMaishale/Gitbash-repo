package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Svg {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//*[name()='svg' and @ class='gb_1e']")).click();
		
		driver.findElement(By.xpath("//*[name()='svg' and @ class='gb_1e']")).click();
		
	}

}
