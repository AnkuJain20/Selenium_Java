package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CalenderHandle {
    @Test
    public void handleCalenderUI() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anku\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
      List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover"));
     int count = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).size();
        System.out.println(count);
      int a =  alldates.size();
        System.out.println(a);

    }
}