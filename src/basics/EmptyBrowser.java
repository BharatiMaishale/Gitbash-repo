package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class EmptyBrowser {
	
public static void main(String[] args) {
	
	//launching URL
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
		
	
	driver.get("https://www.instagram.com/sem/campaign/emailsignup/?campaign_id=13530338610&extra_1=s|c|547419127631|e|instagram%20%27|&placement=&creative=547419127631&keyword=instagram%20%27&partner_id=googlesem&extra_2=campaignid%3D13530338610%26adgroupid%3D126262414014%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1321618851291%26loc_physical_ms%3D1007771%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvcLNtYCw_QIVqoNLBR1bVAMAEAAYASAAEgLnkPD_BwE");
	driver.manage().window().minimize();
	driver.manage().window().maximize();

	String data = driver.getTitle();
	System.out.println(data);
	
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	String source = driver.getPageSource();
	System.out.println(source);
	
     driver.close();
	 driver.quit();
	
/*	//launching the URL
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=10335663283111552202&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062013&hvtargid=kwd-49491430&hydadcr=14454_2316419&gclid=Cj0KCQiA3eGfBhCeARIsACpJNU8ACNP0rD_N-yoDPpiYAEgsBH-XOota-ciGr4KvFwCagqvr9o7ylQoaAo8lEALw_wcB");
	
	//minimize screen
		driver.manage().window().minimize();
		
	//maximize screen
	driver.manage().window().maximize();
	
	//printing the title of the webpage
	String data=driver.getTitle();
	System.out.println(data);
	
	//prints current URL of the Application
	 String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	//prints sourcecode of the page
	 String source = driver.getPageSource();
	System.out.println(source);
	
	//close method closes the current focusing window
	driver.close();
	
	//close all the windows
	driver.quit();
	
	*/
}
}
