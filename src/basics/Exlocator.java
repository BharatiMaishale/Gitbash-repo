package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exlocator {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=18121021262973133792&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007771&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAo-yfBhD_ARIsANr56g4xTWYMaOmjGuvaN1vAUZLWShqxrml1ogyw2ee4_a4EFW_Uvu1R0aAaAt1kEALw_wcB");
           
		/*linktext
		/*driver.findElement(By.linkText("Amazon miniTV")).click();*/
	driver.findElement(By.partialLinkText("Amazon m")).click();
		 
		 
		/*	WebElement data=driver.findElement(By.name("field-keywords"));
	

	/*data.sendKeys("puma");
	data.submit();
	
	web element data=driver.findelement(By.name("field-keywords");
	 * data.SendKeys("bluetooth earbuds");
	 * data.click();*/
	 
	
	
		
		
		
		

	}

}
