package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAction {
	
	public static void main(String args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
		System.out.println(driver.findElement(By.xpath("//input[1]")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
				
				
		
	}

}
