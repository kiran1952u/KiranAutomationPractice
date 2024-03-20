package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.EDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Resourcepage {
    @Test
    public void Resoucepage  () throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://presolv360.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/ul/li[4]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/ul/li[4]/div[2]/a[5]")).click();
        Thread.sleep(2000);
        driver.get("https://presolv360.com/odr-on-air");
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/ul/li[5]/a")).click();
        driver.quit();




        Thread.sleep(2000);





    }
}
