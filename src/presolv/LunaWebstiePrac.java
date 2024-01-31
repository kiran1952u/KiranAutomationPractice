package presolv;import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.pqc.legacy.math.linearalgebra.ByteUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LunaWebstiePrac {
    @Test
    public void Createpage() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
        driver.findElement(By.id("firstname")).sendKeys("botKN");
        driver.findElement(By.id("lastname")).sendKeys("nikam");
        driver.findElement(By.id("email_address")).sendKeys("qakn6@mailinator.com");
        driver.findElement(By.name("password")).sendKeys("kor@1952@#$");
        driver.findElement(By.name("password_confirmation")).sendKeys("kor@1952@#$");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[1]/div/div[5]")).click();



    }

//    @Test
//
//    public void Singinpage() throws InterruptedException {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver(options);
//
//        driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
//        driver.findElement(By.id("email")).sendKeys("qakn3@mailinator.com");
//        driver.findElement(By.id("pass")).sendKeys("kor@1952@#$");
//        driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
////        driver.findElement(By.id("qty")).sendKeys("2");
////        Thread.sleep(3000);
////        WebElement element = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]"));
////        System.out.println(element.getTagName());
//
//        driver.get("https://magento.softwaretestingboard.com/argus-all-weather-tank.html");
//        driver.navigate().back();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[4]/a")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[1]/div/div")).click();
//        driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
//        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
////        driver.get("https://magento.softwaretestingboard.com/fusion-backpack.html#reviews");https://magento.softwaretestingboard.com/fusion-backpack.html#reviews
////        driver.navigate().back();
//        Thread.sleep(3000);
//        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[4]/div/div[1]/a"));
//        element.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // Scroll up by 500 pixels. You can adjust the value as needed.
//        js.executeScript("window.scrollBy(0, -800);");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
////        driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[1]/a")).click();
//
//
//    }

}