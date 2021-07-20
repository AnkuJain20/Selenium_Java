package com.finalProject.TestExecution;

import com.finalProject.Base.Base;
import com.finalProject.data.DataProviderTest;
import com.finalProject.pageObject.LandingPage;
import com.finalProject.pageObject.LoginScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTests() throws IOException {
        driver = initializeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    public void basePageNavigation() throws IOException {
        LandingPage landingPage= new LandingPage(driver);
        landingPage.getLogin().click();
    }

    @Test
    public void basePageNavigation2() throws IOException {
        LandingPage landingPage= new LandingPage(driver);
        landingPage.clickOnSearchbox().sendKeys("iphone");
        landingPage.searchClick().click();

    }

//    @Test(dataProvider= "loginData", dataProviderClass = DataProviderTest.class)
    @Test
    public void CheckLogin(String uname, String pwd){
//        System.out.println(uname + pwd);
        LandingPage landingPage= new LandingPage(driver);
        landingPage.getLogin().click();

      
//        WebDriverWait wait = new WebDriverWait(driver,10);
//                wait.until(ExpectedConditions.visibilityOfAllElements());

        LoginScenario login = new LoginScenario(driver);
        login.getemail().sendKeys(uname);

        login.continueWithClick().click();
        login.getPassword().sendKeys(pwd);
        login.clickSignIn().click();
        Assert.assertFalse(false);
    }

   @Test
    public void fashionClick(){
       LandingPage landingPage= new LandingPage(driver);
       landingPage.getHomeAndKitchen().click();
       landingPage.cliclWomen().click();
       landingPage.clickOnSearchbox().sendKeys("Hand bag");
       landingPage.searchClick().click();
       landingPage.clickBrand().click();
}


//    @AfterMethod
//    public  void closeBrowser(){
//        driver.close();
//    }

}
