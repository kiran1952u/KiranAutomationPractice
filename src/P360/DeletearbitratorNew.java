package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DeletearbitratorNew {
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
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();



    }

}