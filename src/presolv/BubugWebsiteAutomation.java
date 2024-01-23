package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BubugWebsiteAutomation {

    @Test
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://bugbug.io/blog/software-testing/best-selenium-practice-websites/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/header/div/div[3]/a[1]/span")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/p[2]/a")).click();
        driver.findElement(By.name("email")).sendKeys("kirannikam1423@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("kir1952@");
        driver.findElement(By.name("password2")).sendKeys("kir1952@");
        driver.findElement(By.name("isAllowedEmailMarketing")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/form/button/div/div[3]")).click();
        Thread.sleep(5000);
        driver.navigate().to("https://app.bugbug.io/sign-up/success/");
        driver.navigate().back();
        driver.navigate().to("https://app.bugbug.io/sign-up/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/p[2]/a")).click();
        driver.findElement(By.name("email")).sendKeys("kirannikam143bhai@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/form/button")).click();





    }

}
