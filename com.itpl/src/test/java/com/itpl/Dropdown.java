package com.itpl;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		WebElement d = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s = new Select(d);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
	
		s.selectByValue("Canada");
		Thread.sleep(3000);
		
		s.selectByVisibleText("China");
		Thread.sleep(3000);
		
		List<WebElement> allOptions = s.getAllSelectedOptions();
		
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());	
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
