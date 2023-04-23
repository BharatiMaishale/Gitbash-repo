package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassEx {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
	//selectbyIndex
		WebElement daylist = driver.findElement(By.id("day"));
		Thread.sleep(2000);
     Select sel=new Select(daylist);
     sel.selectByIndex(20);
    
   //Selectbyvalue
     WebElement monthlist = driver.findElement(By.id("month"));
     Select sele=new Select(monthlist);
     sele.selectByValue("6");
     
     //selectbyvisibletext
     
  WebElement yearlist = driver.findElement(By.id("year"));
  Select selec=new Select(yearlist);
  selec.selectByVisibleText("2022");
	}

}
