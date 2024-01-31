package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class TestLogin {


    public void TestLoginPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
//        driver.findElement(By.id("username")).sendKeys("student");
//        driver.findElement(By.name("password")).sendKeys("Password123");
//        driver.findElement(By.id("submit")).click();
//        driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[1]/a")).click();
//        driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[2]/a")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
        driver.findElement(By.name("customer.firstName")).sendKeys("kiran");
        driver.findElement(By.name("customer.lastName")).sendKeys("nika");
        driver.findElement(By.id("customer.address.street")).sendKeys("Colaba  , sahid bagat sing rode , near gate way of india");
        driver.findElement(By.id("customer.address.city")).sendKeys("Mumbai City");
        driver.findElement(By.name("customer.address.state")).sendKeys("Maharastra");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("4000605");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("9137884555");
        driver.findElement(By.name("customer.ssn")).sendKeys("788954");
        driver.findElement(By.name("customer.username")).sendKeys("@#kirannikak1952@3");
        driver.findElement(By.id("customer.password")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td[2]/input")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();

    }

    @Test
    public class Forgetpassword {

        public void TestLoginPage() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[2]/a")).click();


        }

        @Test
        public class ProductPage {

            public void TestLoginPage() throws InterruptedException {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");

                WebDriverManager.chromedriver().setup();
                ChromeDriver driver = new ChromeDriver(options);
                driver.get("https://parabank.parasoft.com/parabank/index.htm");
                driver.manage().window().maximize();
                Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[4]/a")).click();


            }


            @Test
            public class AdminPage {

                public void     DataAccessMode() {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");

                    WebDriverManager.chromedriver().setup();
                    ChromeDriver driver = new ChromeDriver(options);
                    driver.get("https://parabank.parasoft.com/parabank/index.htm");
                    driver.manage().window().maximize();
                    driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[6]/a")).click();
                    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table[1]/tbody/tr[2]/td[1]/input")).click();
                    driver.findElement(By.name("soapEndpoint")).sendKeys("sdnflsndfl");
                    driver.findElement(By.name("restEndpoint")).sendKeys("klsndlfsd");
                    driver.findElement(By.name("endpoint")).sendKeys("skjhdfks");
                    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/input")).click();
                    driver.findElement(By.name("action")).click();
                    driver.findElement(By.xpath("//button[normalize-space()='Clean']")).click();
                    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr/td[3]/input")).click();


                }
            }
        }
    }
}