package com.itpl;



import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Meesho {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(static method of expected conditions class);
		*/
		
		
		/*driver.get("https://www.meesho.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		*/
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Friends",Keys.ENTER);
		
	    /*
		driver.findElement(By.tagName(""));
	    driver.findElement(By.id(""));
	    driver.findElement(By.name(""));
	    driver.findElement(By.className(""));
	    driver.findElement(By.linkText(""));
	    driver.findElement(By.partialLinkText(""));
	    driver.findElement(By.cssSelector("//tagname[attributeName='AttributeValue']"));
	    driver.findElement(By.cssSelector("[AttributeName='AttributeValue']")); 
		*/
		
		
		//XPath by attribute
		driver.findElement(By.xpath("//input[@class='attributeValue']"));
		
		//xpath by contains attribute
		driver.findElement(By.xpath("(//input[contains(@class,'search-input-elm')])[1]"));
		
		//xpath by visible text
		driver.findElement(By.xpath("//span[text()='Men']"));
		
		//xpath by contains visible text
		driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		//xpath by axes
		
		//ancestor
		driver.findElement(By.xpath(""));
		//desendent
		driver.findElement(By.xpath(""));
		//following-sibling
		driver.findElement(By.xpath(""));
		//preceeding-sibling
		driver.findElement(By.xpath(""));
		
	}

}
