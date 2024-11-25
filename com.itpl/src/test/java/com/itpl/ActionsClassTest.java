package com.itpl;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassTest {
	
	
		
		@Test
		public void action() throws InterruptedException
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop = driver.findElement(By.xpath("//div[contains(@class,'drop-column')]/ancestor::section[contains(@class,'w-[50%] flex flex-col')]/descendant::div[text()='Mobile Accessories']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
		}

}
