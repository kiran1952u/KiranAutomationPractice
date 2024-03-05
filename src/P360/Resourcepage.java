package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Resourcepage {
    @Test
    public void Resoucepage  () throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://presolv360.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/ul/li[4]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/ul/li[4]/div[2]/a[5]")).click();
        Thread.sleep(2000);










//        Thread.sleep(2000);
//        driver.quit();





    }
}
