package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		;
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		List<WebElement> list = driver.findElements(By.xpath("//li"));
			
		/*for(WebElement wb:list)
		{
			System.out.println(wb.getText());
			if(wb.getText().contains("headset boat"));
			{
				
				wb.click();
				break;
				
			}
			
			
		}*/
		//not getting
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Testing");
		List<WebElement> list = driver.findElements(By.xpath("//li"));
		
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
			if(wb.getText().contains(" interview questions"))
					{
				wb.click();
				break;
					}
		}
		*/
		
		
		}
	}


