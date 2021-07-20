package com.finalProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By signin = By.id("nav-link-accountList-nav-line-1");

    public WebElement getLogin() {
        return driver.findElement(signin);
    }

    By searchbox = By.id("twotabsearchtextbox");

    public WebElement clickOnSearchbox() {
        return driver.findElement(searchbox);
    }

    By searchClick = By.id("nav-search-submit-button");

    public WebElement searchClick() {
        return driver.findElement(searchClick);
    }

    By fashion = By.xpath("//*[@id='nav-xshop']/a[5]");

    public WebElement getHomeAndKitchen() {
        return driver.findElement(fashion);
    }

    By women = By.xpath("//*[@id='nav-subnav']/a[2]/span[1]");
    public WebElement cliclWomen(){
        return driver.findElement(women);
    }

   By brand = By.xpath("//*[@id='p_89/Baggit']/span/a/div");
    public WebElement clickBrand()
    {
        return driver.findElement(brand);
    }


}
