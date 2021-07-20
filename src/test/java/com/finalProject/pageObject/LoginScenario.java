package com.finalProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScenario {
    public WebDriver driver;

    public LoginScenario(WebDriver driver){
        this.driver= driver;
    }

   By email = By.xpath("//input[@id='ap_email']");
    public WebElement getemail(){
        return driver.findElement(email);
    }

    By click = By.xpath("//input[@id='continue']");
    public WebElement continueWithClick(){
        return driver.findElement(click);
    }

    By password = By.cssSelector("input[name='password']");
    public  WebElement getPassword(){
        return driver.findElement(password);
    }
    By signIn = By.cssSelector("input[id='signInSubmit']");
    public WebElement clickSignIn(){
        return driver.findElement(signIn);
    }


}
