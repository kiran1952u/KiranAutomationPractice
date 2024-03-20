package P360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addarbitrator {
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
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        driver.quit();





    }

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]  {

                {"Sophie Turner", "arbitrator", "sophie.turner@gmail.com", "9876543345"},
                {"Daniel Smith", "arbitrator", "daniel.smith@gmail.com", "9876543346"},
                {"Ella Johnson", "arbitrator", "ella.johnson@gmail.com", "9876543347"},
                {"Jacob Martinez", "arbitrator", "jacob.martinez@gmail.com", "9876543348"},
                {"Avery Cooper", "arbitrator", "avery.cooper@gmail.com", "9876543349"},
                {"Grace Thompson", "arbitrator", "grace.thompson@gmail.com", "9876543350"},
                {"William Taylor", "arbitrator", "william.taylor@gmail.com", "9876543351"},
                {"Emily Harris", "arbitrator", "emily.harris@gmail.com", "9876543352"},
                {"Benjamin Wright", "arbitrator", "benjamin.wright@gmail.com", "9876543353"},
                {"Scarlett Brown", "arbitrator", "scarlett.brown@gmail.com", "9876543354"},
                {"Jackson Davis", "arbitrator", "jackson.davis@gmail.com", "9876543355"},
                {"Aria Wilson", "arbitrator", "aria.wilson@gmail.com", "9876543356"},
                {"Ethan Miller", "arbitrator", "ethan.miller@gmail.com", "9876543357"},
                {"Natalie Thomas", "arbitrator", "natalie.thomas@gmail.com", "9876543358"},
                {"Lucy Rodriguez", "arbitrator", "lucy.rodriguez@gmail.com", "9876543359"}

        };
    }
}