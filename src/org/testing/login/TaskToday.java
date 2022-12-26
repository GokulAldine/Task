package org.testing.login;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskToday {
public static void main(String[] args) {
	System.setProperty("webdriver.driver.chromedriver", "C:\\IDE Eclipse\\Task\\src\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement sendkey = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    sendkey.sendKeys("iphone");
    
	
	WebElement clickbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	clickbutton.click();
	     
   	//WebElement text = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][1]"));
   	//String text2 = text.getText();
   	//System.out.println(text2);
   	 
   	Map <Integer,String> mp = new HashMap <> (); 
	WebElement text = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][1]"));
   	String text2 = text.getText();
   	System.out.println(text2);
   	 
   for (Map.Entry<Integer, String> entry : mp.entrySet()) {
	Integer key = entry.getKey();
	String val = entry.getValue();
	
}
	}
}