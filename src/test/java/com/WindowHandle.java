package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {


    @Test
    public void getWindowHandle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anku\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
       Set< String> windows = driver.getWindowHandles();
      Iterator <String> it = windows.iterator();
     String parentID = it.next();
     String childID = it.next();
     driver.switchTo().window(childID);
     driver.switchTo().window(parentID);
     driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
    }
}
