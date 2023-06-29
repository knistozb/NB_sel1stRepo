
/// Selenium Class: Day 1- June 4, 2023, Sunday with new Instructor Shibab ///////


package nb_launchBrowser_pkg;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class NB_CL1_LaunchChrome {

	
	
	
		// IN-Class HW: Practice all the JAVA topics from w3schools website

	
		// IQA 1
		// When we create an object in webdriver, we are using the class that uses the concept of inheritance
	
		// Web Elements: all the different options you can click on the given website
		
		// Go to website, and after hovering over where you want to inspect, click inspect to get the exact class name so you can copy paste that in your code

	
	

	
// Exercise 1: Launching chrome and inputting the searching text.....	
	public static void main(String[] args) throws InterruptedException {
		
//		Scanner snc = new Scanner(System.in);
		
		//Launch Chrome:
		WebDriver driver = new ChromeDriver();
		// Fetch Website:
		driver.get("https://www.google.com/");
		// Maximize Browser
 		driver.manage().window().maximize();    // opens up the window in full screen
		// Type desired input like Selenium 123
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium Java");
		
		// Click on Search Button: it is not resolved yettttt
		driver.findElement(By.className("gNO89b")).click();
//		Thread.sleep(3000);
		// Close the browser
		driver.close();
		
	    
// From Java StackFlow but didn't work for it kept saying WebDriverWait undefined.... to resolve that click search issue:
// 		WebElement p = driver.findElement(By.className("gLFyf"));
//	    //enter text with sendKeys() then apply submit()
//	    p.sendKeys("Selenium Java");
//	    // Explicit wait condition for search results
//	    WebDriverWait w = new WebDriverWait (driver, 5);
////	    w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
////	    p.submit();
////	    driver.close();		
//		
	}
		
}






