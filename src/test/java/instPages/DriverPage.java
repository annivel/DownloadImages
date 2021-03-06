package instPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import link.Links;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class DriverPage {

   public static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Links.LINK);
    }
    public DriverPage() {
        PageFactory.initElements(driver, this);
    }


}

