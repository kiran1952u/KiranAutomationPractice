package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JunaDataprovider {
    @Test(dataProvider = "testMethod")
    public void test(String email, String pass) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
        driver.close();
    }

    @DataProvider
    public Object[][] testMethod() {
        return new Object[][]{
                {"qakn3@mailinator.com", "kor@1952@#$"},
                {"qakn4@mailinator.com", "kor@1952@#$"},
                {"qakn6@mailinator.com", "kor@1952@#$"},
                {"qakn7@mailinator.com", "kor@1952@#$"},

        };
    }
}

//qakn4@mailinator.com