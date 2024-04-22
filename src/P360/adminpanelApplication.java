package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class  adminpanelApplication {

    @Test
    public void loginpage() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[5]/a")).click();
        driver.findElement(By.name("name")).sendKeys("OnkarBot");
        driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/div[2]/form/div[2]/div/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/div[2]/form/div[2]/div/select/option[5]")).click();
        driver.findElement(By.id("Party")).click();
        Thread.sleep(3000);
    }


        @Test
        public void ViewApplication () throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://testing.presolv360.com/superaccess");
            driver.manage().window().maximize();
            driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
            driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
            driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
            driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[5]/a")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"application\"]/tbody/tr[1]/td[6]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/div/div/div[2]/div/form/div[6]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"application\"]/tbody/tr[1]/td[7]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/div/div/div[2]/div/form/div[6]/button")).click();
            //*[@id="32"]/div/div/div[2]/div/form/div[6]/button
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[5]/div/div[10]/button[1]")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("delapplication")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div/div[10]/button[1]")).click();
            driver.get("https://testing.presolv360.com/admin/application/list");
            driver.navigate().back();

        }

        @Test
        public void MenuFunctionality () throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://testing.presolv360.com/superaccess");
            driver.manage().window().maximize();
            driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
            driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
            driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        }

        }

