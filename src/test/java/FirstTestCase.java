import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTestCase {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Anku\\work\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        System.out.println(driver.getTitle());
////        driver.close();
//        driver.get("https://facebook.com");
////
//        driver.findElement(By.name("email")).sendKeys("jain.20a@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("freedom123");
//        driver.findElement(By.name("login")).click();
driver.get("https://www.rediff.com/");
driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Anku");
        driver.findElement(By.cssSelector("input#password")).sendKeys("jain");
//        driver.close();
        Actions actions = new Actions(driver);



    }
}