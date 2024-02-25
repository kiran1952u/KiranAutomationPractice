package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Adminpanel {
    @Test
    public void loginpage () throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/span")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tabs-2-tab-1\"]/section/div/section[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"select2-blkaction-container\"]")).click();
        Thread.sleep(2000);
        WebElement spanElement = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/section/div/section[2]/div/div[1]/div[2]/div[1]/div/div[1]/span[1]"));

        // Perform actions on the span element
        spanElement.click();
        driver.findElement(By.id("select2-blkaction-result-615i-0")).click();







    }

}
