package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class Adminpanel {
    @Test
    public void loginpage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/span")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tabs-2-tab-1\"]/section/div/section[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"select2-blkaction-container\"]")).click();
        Thread.sleep(2000);
        WebElement spanElement = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/section/div/section[2]/div/div[1]/div[2]/div[1]/div/div[1]/span[1]"));

        // Perform actions on the span element
        spanElement.click();
        Thread.sleep(3000);

    }

    @Test(dataProvider = "userData")
    public void CreateArbitratorNew (String name , String last_name , String email ,String mobileNo ) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span/span")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
        driver.findElement(By.name("name")).sendKeys(name);
        Thread.sleep(2000);
        driver.findElement(By.name("last_name")).sendKeys(last_name);
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.name("mobileNo")).sendKeys(mobileNo);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/div[2]/form/button")).click();
        driver.quit();





    }
//    @Test
//    public void Deletearbitrator () throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver(options);
//
//
//        driver.get("https://testing.presolv360.com/superaccess");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
//        Thread.sleep(2000);
//        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
//        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
//        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/section/div[2]/div[1]/section/div/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[8]/button"));
//
//        // Click the button
//        button.click();
//
//        driver.findElement(By.xpath("/html/body/div[4]/div/div[10]/button[1]")).click();
//


//    }

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]{                {"Sophia Wilson", "arbitrator", "sophia@gmail.com", "9876543222"},
                {"Thomas Johnson", "arbitrator", "thomas@gmail.com", "9876543223"},
                {"Victoria Williams", "arbitrator", "victoria@gmail.com", "9876543224"},
                {"William Davis", "arbitrator", "william@gmail.com", "9876543225"},
                {"Xavier Smith", "arbitrator", "xavier@gmail.com", "9876543226"},
                {"Yasmine Miller", "arbitrator", "yasmine@gmail.com", "9876543227"},
                {"Zane Wilson", "arbitrator", "zane@gmail.com", "9876543228"},
                {"Amy Johnson", "arbitrator", "amy@gmail.com", "9876543229"},
                {"Benjamin Williams", "arbitrator", "benjamin@gmail.com", "9876543230"},
                {"Catherine Davis", "arbitrator", "catherine@gmail.com", "9876543231"},
                {"Daniel Smith", "arbitrator", "daniel@gmail.com", "9876543232"},
                {"Ella Miller", "arbitrator", "ella@gmail.com", "9876543233"},
                {"Felix Wilson", "arbitrator", "felix@gmail.com", "9876543234"},
                {"Gabrielle Johnson", "arbitrator", "gabrielle@gmail.com", "9876543235"},
                {"Hugo Williams", "arbitrator", "hugo@gmail.com", "9876543236"},
                {"Isabella Davis", "arbitrator", "isabella@gmail.com", "9876543237"},
                {"Jacob Smith", "arbitrator", "jacob@gmail.com", "9876543238"},
                {"Katherine Miller", "arbitrator", "katherine@gmail.com", "9876543239"},
                {"Liam Wilson", "arbitrator", "liam@gmail.com", "9876543240"},
                {"Mila Johnson", "arbitrator", "mila@gmail.com", "9876543241"},


        };
    }
}