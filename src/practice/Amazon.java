package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*WebElement data = driver.findElement(By.name("field-keywords"));
       data.sendKeys("shoes");
       data.submit();*/
		
		driver.findElement(By.linkText("Amazon miniTV")).click();
	}

}
