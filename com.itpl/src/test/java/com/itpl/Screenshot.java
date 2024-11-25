package com.itpl;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		//explicit type casting
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/Screenshot/demo.png");
		Files.copy(src, dest);
		*/
		
		//creating object of browser specific class
		
		/*ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/Screenshot/demo1.png");
		Files.copy(src, dest);
		*/
		
		//downcasting into remote web driver
		
		//--------------> doubt
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/Screenshot/demo2.png");
		Files.copy(src, dest);
		*/
		
		//upcasting to remote webdriver
		
		/*RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/Screenshot/demo3.png");
		Files.copy(src, dest);
		
		*/
		
		//by 3rd party class
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		EventFiringWebdriver
		
		
		driver.quit();
		*/
		
	}

}
