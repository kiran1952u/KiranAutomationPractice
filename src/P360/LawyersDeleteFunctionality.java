package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LawyersDeleteFunctionality {
    @Test
    public void deletearbitrator() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addnew \"]/ul/li[4]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lawyerapprove\"]/tbody/tr[1]/td[7]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div[10]/button[1]")).click();
        


    }
}