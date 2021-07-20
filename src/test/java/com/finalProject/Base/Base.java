package com.finalProject.Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static String baseUrl;
    private static Properties properties;

    static {
       readProperties();
       baseUrl= properties.getProperty("baseUrl");
    }

    private static void readProperties() {
        System.out.println("Reading properties file");
        properties = new Properties();
        String filePath = "src/test/resources/data.properties";
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            properties.load(bufferedReader);
            reader.close();
        } catch (Exception e){
            System.out.println("exception occured:");
        }

    }

    public WebDriver initializeDriver()  {
        WebDriver driver=null;
        String browserName = properties.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anku\\work\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }


    }

