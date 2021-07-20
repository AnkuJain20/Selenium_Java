import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInFireFox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Anku\\work\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anku\\work\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/mozilla/geckodriver/releases");
        driver.close();

    }
}
