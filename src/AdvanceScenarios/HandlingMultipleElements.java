package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

		int count=0;
		//for each loop
		for(WebElement wb:alllinks)
		{
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("Total no of links:"+count);
		
		}
		
	}


