package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class Incaseuserpanel {
    public void incaseuserpanel() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.incase360.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("kiran@presolv360.com");
        driver.findElement(By.name("userPassword")).sendKeys("1952");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();





    }
}
