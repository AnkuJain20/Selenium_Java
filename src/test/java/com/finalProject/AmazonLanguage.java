package com.finalProject;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonLanguage {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anku\\work\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in//");
        String title = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}