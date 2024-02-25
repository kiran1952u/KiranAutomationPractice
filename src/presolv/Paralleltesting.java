package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Paralleltesting {
    WebDriver driver;
    @Test
    @AfterClass
    void logotest () throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        logo.isDisplayed();
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(2000);
    }
    @Test
    void homepagtile (){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(options);
        driver.get("https://www.google.co.in/");


    }
}
