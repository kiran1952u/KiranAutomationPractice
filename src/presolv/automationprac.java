package presolv;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationprac {
	@Test
	  public void f() throws InterruptedException {
		  
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.automationexercise.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
	      driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("kiran");
	      driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("kiran7@mailinator.com");
	      driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
	      driver.findElement(By.id("id_gender1")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys("kirannikam@123");
	      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input")).sendKeys("kirannikam@122");
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,250)", "");
//	      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")).click();
//          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[7]")).click();
          Select objSelect =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")));
          objSelect.selectByValue("2");
          Thread.sleep(2000);
          Select objSelect1 =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select")));
          objSelect1.selectByVisibleText("March");
          Thread.sleep(2000);
          Select objSelect11 =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select")));
          objSelect11.selectByValue("2019");
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/div/span/input")).click();
          driver.findElement(By.name("first_name")).sendKeys("kiran");
          Thread.sleep(2000);
          driver.findElement(By.id("last_name")).sendKeys("nikakm");
          Thread.sleep(2000);
          driver.findElement(By.id("company")).sendKeys("AQM technologies");
          Thread.sleep(2000);
          driver.findElement(By.name("address1")).sendKeys("Thane west , near talavpadi , Ganesh aprts , room no 403 , thane west");
          Thread.sleep(2000);
          driver.findElement(By.name("address2")).sendKeys("Thane west , near talavpadi , Ganesh aprts , room no 403 , thane west");
          Thread.sleep(2000);
          Select objSelect111 =new Select(driver.findElement(By.name("country")));
          objSelect111.selectByVisibleText("Australia");
          Thread.sleep(2000);
          driver.findElement(By.id("state")).sendKeys("Maharastra");
          Thread.sleep(2000);
          driver.findElement(By.id("city")).sendKeys("Mumbai City");
          Thread.sleep(2000);
          driver.findElement(By.id("zipcode")).sendKeys("400602");
          Thread.sleep(2000);
          driver.findElement(By.id("mobile_number")).sendKeys("9137884512");
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
          driver.findElement(By.xpath("/html/body/section/div/div/div/div/a")).click();
          
	      }
	public static void main(String[] args) {
		
		
        
	}

}
