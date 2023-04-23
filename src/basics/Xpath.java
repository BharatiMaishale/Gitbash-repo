package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		/*ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		
		//Xpath by contains Attribute
		WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
      
		//cssvalue (webelement)
		String data = font.getCssValue("font");
      System.out.println(data);
      
		///to print the color of the facebook font
	    WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
        String data1 = value.getCssValue("color");
        System.out.println(data1);
	
		
		
 //getlocation()  /webelement)
    WebElement data11 = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
    Point value1 = data11.getLocation();
    System.out.println(value1.getX());
    System.out.println(value1.getY());
    System.out.println(value1);
    
    
    //getsize()
    WebElement data10 = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
   Dimension value22 = data10.getSize();
   System.out.println(value22.getHeight());
   System.out.println(value22.getHeight());
   System.out.println(value22.;
    
		
	// get rect()	for fetching the details of the particular box(username textfield rectangle)
   WebElement data2 = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email address or phone number')]"));
	Rectangle value2 = data2.getRect();
	System.out.println(value2.getHeight());
	System.out.println(value2.getWidth());
	System.out.println(value2.getX());
	System.out.println(value2.getY());   */
		
		
	WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	/*WebElement UN = driver.findElement(By.id("username"));
	UN.sendKeys("admin");
	Thread.sleep(1000);
	//UN.clear();
	
	//isdisplayed
	WebElement data9 = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	if(data9.isDisplayed())
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is displayed");
	
	}
	
	

	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	//checkbox.click();
	
	if(checkbox.isSelected())
	{
		System.out.println("checkbox is checked");
	}
	else
	{
		System.out.println("checkbox is unchecked");
	}
	
	
	}	
		
		WebElement data = driver.findElement(By.id("username"));
		String value = data.getAttribute("id");			
		System.out.println("Attribute value for id is:"+value);
		
		String value1 = data.getAttribute("type");
		System.out.println("Attribute value for id is:"+value1);
		
		String value2 = data.getAttribute("placeholder");
		System.out.println("Attribute value for id is:"+value2);  */
		
	/*	
		WebElement data = driver.findElement(By.id("username"));
		String value3 = data.getTagName();
		System.out.println("tagname is:"+value3);*/
		
		/*WebElement data = driver.findElement(By.id("loginButton"));
		String value = data.getAttribute("href");
		
		System.out.printn("value is:"+value);
		*/
		WebElement user = driver.findElement(By.id("username"));
		
		System.out.println(user.getAriaRole());
		
	WebElement password = driver.findElement(By.name("pwd"));
		
		System.out.println(password.getAriaRole());
		
WebElement login = driver.findElement(By.id("loginButton"));
		
		System.out.println(login.getAriaRole());
		
WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		System.out.println(checkbox.getAriaRole());
		
	}
	
	
}
