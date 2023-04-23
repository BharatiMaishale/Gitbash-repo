package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		/*WebElement popup = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
		popup.click();
		WebElement search = driver.findElement(By.cssSelector("input[class='_3704LK']"));
		search.click();
		search.sendKeys("bluetooth headphones");
		search.submit();
		WebElement firstprod = driver.findElement(By.cssSelector("div[class='_30jeq3']"));
		System.out.println("Price of first prod:"+firstprod.getText());*/
	}		
}
