package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PriceFilter {
    @Test
    public void checkFilter() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anku\\work\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in//");
        String title1 = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String minPriceFilter = "low-price";
        driver.findElement(By.id(minPriceFilter)).sendKeys("10000");
        String maxPriceFilter = "high-price";
        driver.findElement(By.id(maxPriceFilter)).sendKeys("25000");
        String goButton = "//input[@class='a-button-input']";
        driver.findElement(By.xpath(goButton)).click();
        String product_price_list = "//span[@class='a-price-whole']";
        String product_link_list = "//a[@class='a-link-normal a-text-normal']";
        List<WebElement> listOfProducts = driver.findElements(By.xpath(product_link_list));
        System.out.println("Number of products searched: " + listOfProducts.size());
        List<WebElement> product_prices = driver.findElements(By.xpath(product_price_list));
        System.out.println("Get all the product prices");
        boolean bResult1 = false;
        int price_temp = 0;

        for (int i = 0; i < product_prices.size(); i++) {
            price_temp = Integer.parseInt(product_prices.get(i).getText().replace(",", ""));
//            if (price_temp>=min && price_temp<=max){
//                bResult = true;
//                logger.info("For index: " + i + " Product Price: " + price_temp + " and for Product: " + product_prices.get(i).getText());
//            }else{
//                bResult = false;
//                logger.error("Product list is not with in Price range. Failed.");
//                break;
//            }
//        }
//
//        if (bResult){
//            Assert.assertTrue("Search Result is with in the defined range i.e. Min: " + min + " Max: " + max,true);
//            logger.info("All product is filtered with right price range. Min: " + min + " Max: " + max);
//        }else{
//            logger.error("All product is not filtered with right price range. Min: " + min + " Max: " + max);
//            Assert.fail("Search Result is not with in the defined range i.e. Min: " + min + " Max: " + max );
//        }
//        ;

        }
    }
}
