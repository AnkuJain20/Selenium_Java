import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AmazonSearchProduct {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anku\\work\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in//");
        String title = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println(title);
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
////        driver.findElement(By.id("nav-search-submit-button")).click();

//        driver.findElement(By.id("glow-ingress-line1")).click();


//        driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("560103");
//        driver.findElement(By.xpath("//*[@id='GLUXZipUpdate']/span/input")).click();


     String productSearchTab = "twotabsearchtextbox";
       driver.findElement(By.id(productSearchTab)).sendKeys("phone");
       String clickOnProductSearchTab = "nav-search-submit-button";
       driver.findElement(By.id(clickOnProductSearchTab)).click();
//        driver.navigate().refresh();
       String clickOnOnePlusCheckbox = "//*[@id='p_89/OnePlus']/span/a/span";
//       driver.findElement(By.xpath(clickOnOnePlusCheckbox)).click();
       Thread.sleep(10000);
//        String minPriceFilter = "low-price";
//        driver.findElement(By.id(minPriceFilter)).sendKeys("10000");
//        String maxPriceFilter = "high-price";
//        driver.findElement(By.id(maxPriceFilter)).sendKeys("25000");
//        String goButton = "//input[@class='a-button-input']";
//        driver.findElement(By.xpath(goButton)).click();
//        String cliclOnPhoneLink = "Samsung Galaxy M12 (Black,6GB RAM, 128GB Storage) 6000 mAh with 8nm Processor | True 48 MP Quad Camera | 90Hz Refresh Rate";
//       driver.findElement(By.linkText(cliclOnPhoneLink)).click();
//       String addToCart = "//*[@id='add-to-cart-button']";
//       driver.findElement(By.xpath(addToCart)).click();
//       driver.findElement(By.xpath("//*[@id='p_89/OnePlus']/span/a/span"));
driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();

//

    }
}
