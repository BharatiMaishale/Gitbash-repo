package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestionsample {

	public static void main(String[] args) throws InterruptedException {
		/*ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("Fashion");
   List<WebElement> list = driver.findElements(By.xpath("//div"));
   
   for(WebElement wb:list)
   {
	System.out.println(wb.getText())  ;
	if(wb.getText().contains(" sneakers"))
	{
	 wb.click();
	 break;
	}*/
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		
		Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:list)
		{
			if(wb.getText().contains("m testing"))
			{
				System.out.println(wb.getText());
				Thread.sleep(1000);
				wb.click();
				break;
			}
          
			
	}


	}
}
//