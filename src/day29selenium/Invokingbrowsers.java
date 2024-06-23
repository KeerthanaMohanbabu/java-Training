package day29selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invokingbrowsers {

	public static void main(String[] args) {
        // to invoke the chrome browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the chrome.
		driver.manage().window().maximize();
		
		//to clear the cookies
		
		driver.manage().deleteAllCookies();
		
		// to navigate any URL
		
		driver.get("https://www.credosystemz.com/");
		
		// to get the page title
		
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		
		// to get the current URL
		
		String currenturl= driver.getCurrentUrl();
		System.out.println("CurrentURL is:"+currenturl);
		
		// to close browser
		
		driver.quit();
	
		
		
		// to invoke edge browser
		
		WebDriver driver1= new EdgeDriver();
		
		// to maximize the page	
		driver1.manage().window().maximize();
		
		// to clear cookies	
		driver1.manage().deleteAllCookies();
		
		// to navigate any URL	
		driver1.get("https://www.credosystemz.com/");
		
		// to get title
		String title1= driver1.getTitle();
		System.out.println("Title is:"+title1);
		
		// to get currentURL
		String currenturl1=driver1.getCurrentUrl();
		System.out.println("CurrentURL is:"+currenturl1);
		
		// to close browser
		driver1.quit();
		

		// to invoke edge browser
		
		WebDriver driver2= new FirefoxDriver();
		
		// to maximize the page	
		driver2.manage().window().maximize();
		
		// to clear cookies	
		driver2.manage().deleteAllCookies();
		
		// to navigate any URL	
		driver2.get("https://www.credosystemz.com/");
		
		// to get title
		String title2= driver2.getTitle();
		System.out.println("Title is:"+title2);
		
		// to get currentURL
		String currenturl2=driver2.getCurrentUrl();
		System.out.println("CurrentURL is:"+currenturl2);
		
		// to close browser
		driver2.quit();
		
		

	}

}
