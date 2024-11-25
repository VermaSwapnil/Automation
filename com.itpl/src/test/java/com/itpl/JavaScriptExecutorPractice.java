package com.itpl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://blinkit.com/");
		driver.get("https://www.amazon.in/");
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("window.scrollBy(0,1000)");
	    
	    WebElement scrollTill = driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
	    js.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
	    
	    //js.executeScript("document.getElementById('name').value='Swapnil'");
	    
	    /*WebElement disableButton = driver.findElement(By.xpath(""));
	    js.executeScript("arguments[0].click()", disableButton);
	    */
	    
	    /*WebElement hidden = driver.findElement(By.xpath(""));
	    js.executeScript("arguments[0].value='Trans'",hidden);
	    
	    */
	    
	    
	    Thread.sleep(4000);
	    
	    driver.quit();
	    
		
		
	}

}
