import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Xpath by Attribute
		//htmltag[AttributeName='AttributeValue']
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
    
   driver.findElement(By.xpath("//td[contains(@id,'loginButtonContainer')]")).click(); 
	}

}
