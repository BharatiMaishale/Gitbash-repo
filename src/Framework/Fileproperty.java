package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fileproperty {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		//FileInputStream fis=new FileInputStream("C:\\Users\\2022\\Desktop\\commondata10.properties.txt");
		FileInputStream fis= new FileInputStream("./commondata10.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");;
	
		  String USERNAME = pro.getProperty("username");
	      String PASSWORD = pro.getProperty("password");
		
	  	driver.get(URL);
	  
	  	
	      
	    //  driver.findElement(By.id("username")).sendKeys(USERNAME);
	   //   driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	      

	}

}
