package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollPageJavaScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
		}

	}

}
