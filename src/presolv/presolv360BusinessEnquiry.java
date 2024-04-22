package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class presolv360BusinessEnquiry {
    public void fillform() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://presolv360.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='flex_row btn_wrp']//div//button[@class='blue_btn'][normalize-space()='Business Enquiry']")).click();
        driver.findElement(By.id("name")).sendKeys("KIA");
        driver.findElement(By.id("orgname")).sendKeys("sdfds");
        driver.findElement(By.id("number")).sendKeys("9131784525");
        driver.findElement(By.id("email")).sendKeys("virat@presolv360.com");
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div/button")).click();
    }
}
