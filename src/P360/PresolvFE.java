package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "userData")
public class PresolvFE {
    public void BusinessE(String name, String orgname, String number, String email) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://presolv360.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='flex_row btn_wrp']//div//button[@class='blue_btn'][normalize-space()='Business Enquiry']")).click();
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("orgname")).sendKeys(orgname);
        driver.findElement(By.id("number")).sendKeys(number);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.quit();


    }

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]{
                {"Virat Kohli", "Presolv360", "9137884789", "virat@presolv360.com"},
                {"Ajinkya Rahane", "Presolv360", "9137884756", "ajinkya@presolv360.com"},
                {"Rohit Sharma", "Presolv360", "9137884712", "rohit@presolv360.com"},
                {"Shubman Gill", "Presolv360", "9137884725", "shubman@presolv360.com"},
                {"Shreyas Iyer", "Presolv360", "9137884725", "shreyas@presolv360.com"},
                {"Rishabh Pant", "Presolv360", "9137252554", "rishabh@presolv360.com"},


        };


        // Add more sets of data as needed

    }

}


