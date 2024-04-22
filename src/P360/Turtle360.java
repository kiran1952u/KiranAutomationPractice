package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Turtle360 {
    public static class Login  {
        @Test
        public void Loginpage() throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(options);

            driver.get("https://turtle.presolv360.com/");
            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.findElement(By.id("email")).sendKeys("shishir@presolv360.com");
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("shishir@presolv360");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div/div/main/div/form/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/ul/li[2]/a/div")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[3]/a/button")).click();
            //        Thread.sleep(3000);
            driver.findElement(By.name("batchId")).sendKeys("Batch_29012024");
            driver.findElement(By.xpath("//*[@id=\"mui-component-select-enterpriseName\"]")).click();
            Thread.sleep(3000);
            WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/form/div[1]/div[2]/div/div"));
            Thread.sleep(3000);

            driver.quit();
            //        System.out.println(element.getTagName());


        }

    }
}
