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

import java.util.ArrayList;

public class Resourcepage {
    @Test
    public void Resoucepage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
//        FirefoxDriver driver = new FirefoxDriver();
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
//        driver.quit();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/section/div[1]/a/button")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js4 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js5 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js6 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js7 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js8 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js9 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js11 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        JavascriptExecutor js12 = (JavascriptExecutor) driver;

        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[1]/ul/li[4]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[1]/ul/li[4]/div[2]/a[1]")).click();

        driver.get("https://presolv360.com/clause");
//        ((JavascriptExecutor) driver).executeScript("window.open();");
        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Assumes the new tab is the second tab

        // Open the webpage in the new tab
//        driver.get("https://www.example.com");

        // Create JavascriptExecutor object
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        JavascriptExecutor jsd3 = (JavascriptExecutor) driver;
        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        JavascriptExecutor jesd = (JavascriptExecutor) driver;
        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        JavascriptExecutor djsd = (JavascriptExecutor) driver;
        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        JavascriptExecutor jdsd = (JavascriptExecutor) driver;
        // Scroll down by a certain pixel
        js.executeScript("window.scrollBy(0, 500)");








        driver.close();


        driver.quit();


    }
}
