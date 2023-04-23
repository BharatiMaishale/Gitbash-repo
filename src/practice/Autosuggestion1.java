package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestion1 {

	public static void main(String[] args) {
		 {
			 ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("bluetooth",Keys.ENTER);
			
			List<WebElement> list = driver.findElements(By.tagName("//li"));
			
			for (WebElement wb:list)
			{
			
				if(wb.getText().contains(" earphone"))
				{
					System.out.println(wb.getText());
					wb.click();
					break;
					}
				}
			
		/*	driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();	
			driver.findElement(By.name("field-keywords")).sendKeys("shoes");		
			
			
			List<WebElement> list = driver.findElements(By.tagName("//div"));
			
			for(WebElement wb:list)
			{
				System.out.println(wb.getText());
				if(wb.getText().contains("shoes for men sneakers"))
				{
					wb.click();
					break;
				}
			
			}*/
	}
  }	
}		
	



