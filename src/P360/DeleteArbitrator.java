package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javax.swing.text.html.CSS;

public class DeleteArbitrator {
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
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"arbitrator_newreg\"]/tbody/tr[1]/td[8]/a[1]/i")).click();
        driver.findElement(By.name("ad1")).sendKeys("jfhsdf");
        driver.findElement(By.name("ad2")).sendKeys("skdfjdsklfjkldfsjodsjfkljdsklfj");
        driver.findElement(By.name("ad1")).sendKeys("jhsdfkjh");
        driver.findElement(By.name("city")).sendKeys("Mumbai");
        driver.findElement(By.name("pincode")).sendKeys("400605");
        driver.findElement(By.name("state")).sendKeys("Maharashtra");
        driver.findElement(By.name("country")).sendKeys("India");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"smkform\"]/div[7]/div[1]/div/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/form/div[7]/div[1]/div/select/option[4]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/form/div[8]/div/div/textarea")).sendKeys("kajsdhfkdsh");

        driver.findElement(By.xpath("//*[@id=\"smkform\"]/div[9]/div/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"smkform\"]/div[9]/div/div/select/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[class='btn ybigbtn']")).click();


    }
}
