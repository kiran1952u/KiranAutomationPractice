package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static WebDriver driver = null;


    @BeforeSuite
    public   void lunchbrowser(){
      WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
}
    @AfterSuite
    public void Closingbrowser(){
        driver.close();

    }
}

