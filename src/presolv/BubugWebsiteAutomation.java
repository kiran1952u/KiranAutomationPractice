package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.apache.poi.hssf.record.FtPioGrbitSubRecord.length;

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
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/a/div[1]/svg/g/g/rect[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/a/div[2]/p")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div/div/div/div/div[1]/header/div/div[2]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Kntest");
        WebElement inputField = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/input"));

        // Define the number of random words you want to enter
        int numberOfWords = 3; // Change this to the desired number

        // Send multiple random words to the input field
        for (int i = 0; i < numberOfWords; i++) {
            String randomWord = generateRandomString(); // Adjust the length as needed
            inputField.sendKeys(randomWord + " " + "kiran " + " bot " + " noob " + " PUBG "); // Add a space between words
            // You can adjust the delay or perform other actions between sending words if needed
        }

        // Find and click on the element using its XPath
        WebElement elementToClick = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/input"));
        elementToClick.click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/button/svg")).click();


    }

    @org.jetbrains.annotations.NotNull
    static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            randomString.append(characters.charAt(index));
        }
        return randomString.toString();
    }
}
