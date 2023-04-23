package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalenderEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
	
		String month = "April 2023";
		String date = "10";
		
	   driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
        Thread.sleep(1000);
        
      driver.findElement(By.xpath("//span[text()='Return']")).click();
       /* String month1 = "April";
		String date1 = "26";
       driver.findElement(By.xpath("//div[text()='"+month1+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date1+"'][2]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[text()='Search']")).click();*/
       
       
	}

}
