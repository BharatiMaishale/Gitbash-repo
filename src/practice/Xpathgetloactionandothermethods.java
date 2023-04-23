package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathgetloactionandothermethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
        String data = font.getCssValue("font-size");
        System.out.println(data);
        
       WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
        String data1 = value.getCssValue("color");
        System.out.println(data1);*/
        
        //get size
          
        
       WebElement data = driver.findElement(By.xpath("//a[text()='मराठी']"));
       Point value1 = data.getLocation();
       System.out.println(value1.getX());
       System.out.println(value1.getY());
       System.out.println(value1);  
       
       WebElement data1 = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email address or phone number')]"));
   	Rectangle value = data1.getRect();
   	System.out.println(value.getHeight());
   	System.out.println(value.getWidth());
   	System.out.println(value.getX());
   	System.out.println(value.getY());
   	
        
	}
	

}
