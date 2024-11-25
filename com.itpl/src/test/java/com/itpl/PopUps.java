package com.itpl;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PopUps {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Alert alt = driver.switchTo().alert();
		
		//alert pop-up
		alt.accept();
		
		//confirmation pop-up
		alt.accept();
		//OR
		alt.dismiss();
		
		//prompt-popup
		alt.sendKeys("YES");
		alt.getText();
		alt.accept();
		
		//authentication pop-up
		driver.get("protocol://username:password@URL");
		
		//notification pop-up
		
		/*
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver1 = new ChromeDriver(opt);
		opt.addArguments("--disable -notifications");  
		*/
	
	}

}
