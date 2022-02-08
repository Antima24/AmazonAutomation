package com.training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTraining {
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		WebElement signInLink=driver.findElement(By.className("login"));
		signInLink.click();
		driver.findElement(By.id("email")).sendKeys("simplilearn@dispostable.com");
		driver.findElement(By.id("passwd")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
