package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=smsxon&gclid=EAIaIQobChMIvZWItPL-9AIVk4zICh1IyACREAAYASAAEgJlpvD_BwE&hvadid=409979711423&hvdev=c&hvlocphy=1027028&hvnetw=s&hvqmt=e&hvrand=18080789205251109096&hvtargid=kwd-30348971927&hydadcr=28061_11850839&tag=googhydr-20&ref=pd_sl_22c9vulzs0_e");
	    WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    searchbox.sendKeys("samsung earbuds");
		Thread.sleep(3000);
	    driver.quit();
	}

}
