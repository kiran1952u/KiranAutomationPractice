package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DeleteArbitratorfirefox {
    @Test
    public void Deletedarbitrator () throws InterruptedException {
        //this is for the firefox driver we can automate firefox browser also
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
        driver.findElement(By.xpath("//*[@id=\"addnew \"]/span/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"addnew \"]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        // this functionality use for the delete the existing arbitrator
        driver.findElement(By.xpath("//*[@id=\"arbitrator_newreg\"]/tbody/tr[1]/td[8]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div[10]/button[1]")).click();





    }
}
