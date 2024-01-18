package presolv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationprac {
	
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
				      driver.findElement(By.id("password")).sendKeys("kirannikam@123");
				      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input")).sendKeys("kirannikam@122");
				      JavascriptExecutor js = (JavascriptExecutor) driver;
				      js.executeScript("window.scrollBy(0,250)", "");
//				      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")).click();
//			          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[7]")).click();
			          Select objSelect =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")));
			          objSelect.selectByValue("2");
			         
			          Select objSelect1 =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select")));
			          objSelect1.selectByVisibleText("March");
			          
			          Select objSelect11 =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select")));
			          objSelect11.selectByValue("2019");
			          
			          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/div/span/input")).click();
			          driver.findElement(By.name("first_name")).sendKeys("kiran");
			         
			          driver.findElement(By.id("last_name")).sendKeys("nikakm");
			          
			          driver.findElement(By.id("company")).sendKeys("AQM technologies");
			         
			          driver.findElement(By.name("address1")).sendKeys("Thane west , near talavpadi , Ganesh aprts , room no 403 , thane west");
			          
			          driver.findElement(By.name("address2")).sendKeys("Thane west , near talavpadi , Ganesh aprts , room no 403 , thane west");
			         
			          Select objSelect111 =new Select(driver.findElement(By.name("country")));
			          objSelect111.selectByVisibleText("Australia");
			          
			          driver.findElement(By.id("state")).sendKeys("Maharastra");
			          
			          driver.findElement(By.id("city")).sendKeys("Mumbai City");
			          
			          driver.findElement(By.id("zipcode")).sendKeys("400602");
			         
			          driver.findElement(By.id("mobile_number")).sendKeys("9137884512");
			          
			          WebElement createAccountButton = driver.findElement(By.className("btn-default"));

			          // Perform some action on the button, for example, click
			          createAccountButton.click();
			          
			        
			            
			 
	}
	}


