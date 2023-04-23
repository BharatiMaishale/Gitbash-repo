package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Fashion")).click();
		//driver.findElement(By.linkText("Watches")).click();

		
		//driver.findElement(By.cssSelector("label[for='twotabsearchtextbox']"));
		//driver.findElement(By.cssSelector("li[class='sl-sobe-carousel-sub-card celwidget csm-placement-id-16200c87-382c-45f1-8cf5-14da301e6695_6 csm-widget-ref-AF_WIN_bub_w_cml_t_6 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-6']")).click();
		
	
		
		
		//WebElement price = driver.findElement(By.cssSelector("span[class='a-price-whole']"));
		//System.out.println("Price of watch:"+price.getText());
		
	}

}
