package presolv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://gor-pathology.web.app/");
        driver1.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input")).sendKeys("test@kennect.io");
        driver1.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input")).sendKeys("Qwerty@1234");
        driver1.findElement(By.xpath("/html/body/div[2]/div/div/form/button[1]")).click();
        driver1.manage().window().maximize();
        Thread.sleep(5000);
			  
       
        
          JavascriptExecutor js = (JavascriptExecutor) driver1;
           js.executeScript("window.scrollBy(1,400)");
           Thread.sleep(3000);
           driver1.findElement(By.xpath("//input[@id='patient-test']")).click();
           Thread.sleep(5000);
           
           driver1.findElement(By.xpath("/html/body/div[2]/div/nav/div[2]/div/div/div/div[2]/ul/a[2]/div")).click();
           Thread.sleep(3000);
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[1]/a[2]/button/span[1]")).click();
           driver1.findElement(By.name("name")).sendKeys("jojo");
           driver1.findElement(By.name("email")).sendKeys("qakn3@mailinator.com");
           driver1.findElement(By.name("phone")).sendKeys("2124567833");
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]")).click();
           driver1.findElement(By.name("height")).sendKeys("158");
           driver1.findElement(By.name("weight")).sendKeys("67");
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[3]/div[1]/div/div")).click();
           driver1.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/input")).sendKeys("29");
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[4]/div[2]/div[2]/div/input")).sendKeys("89");
           driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[4]/div[2]/div[1]/div/input")).sendKeys("88");
           Thread.sleep(2000);
           JavascriptExecutor js1 = (JavascriptExecutor) driver1;
           js.executeScript("window.scrollBy(1,400)");
           Thread.sleep(6000);

          driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]")).click();
//          driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div/div/input")).click();
//          Thread.sleep(3000);

//          driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/div")).click();
//          Thread.sleep(6000);
          
            driver1.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/div")).click();
            driver1.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[3]")).click();
            Thread.sleep(3000);		
//            driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/input")).click();
      
            
//            driver.findElement(By.id("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/input")).click();

	}

}
