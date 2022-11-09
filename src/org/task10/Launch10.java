package org.task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sutha\\eclipse-workspace\\SeleniumDay2Task10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		WebElement txtUserName=driver.findElement(By.id("username"));
		txtUserName.sendKeys("sutha");
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword .sendKeys("sutha@123");
	}

}
