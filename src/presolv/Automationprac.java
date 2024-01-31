package presolv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationprac {

	private ChromeOptions options;

	@Test
				  public void f() throws InterruptedException {
					  ChromeOptions options = new ChromeOptions();
                      options.addArguments("--remote-allow-origins=*");

					  WebDriverManager.chromedriver().setup();
				      ChromeDriver driver = new ChromeDriver(options);

				      driver.get("https://www.automationexercise.com/");
				      driver.manage().window().maximize();

				      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
				      driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("kiran");
				      driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("bot33232@mailinator.com");
				      driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
				      driver.findElement(By.id("id_gender1")).click();
				      driver.findElement(By.id("password")).sendKeys("kiran@nvn43");
				      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input")).sendKeys("kirannikam@121");
				      JavascriptExecutor js = (JavascriptExecutor) driver;
				      js.executeScript("window.scrollBy(0,250)", "");
				      driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")).click();
			          driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[7]")).click();
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
			          driver.findElement(By.id("zipcode")).sendKeys("400221");			       
			          driver.findElement(By.id("mobile_number")).sendKeys("9187654354");
			          Thread.sleep(3000);
			          WebElement button = driver.findElement(By.tagName("button"));

			          // Perform a click action on the button
			          button.click();
			          WebElement continueLink = driver.findElement(By.xpath("//a[normalize-space()='Continue']"));

			          // Perform a click action on the link
			          continueLink.click();
			          Thread.sleep(2000);
			          driver.navigate().back()	;	          
////			          kirannikam@12
//			          
//			            
//			 
	}
				
				
				@Test
				  public void f1() throws InterruptedException {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver(options);

				      driver.get("https://www.automationexercise.com/");
				      driver.manage().window().maximize();
				      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
				      driver.findElement(By.name("email")).sendKeys("bot5525@mailinator.com");
				      driver.findElement(By.name("password")).sendKeys("kiran@12345");
				   // Find the button using different locators (modify as per your HTML structure)
				        WebElement button = driver.findElement(By.tagName("button")); // Using tagName as an example

				        // Perform a click action on the button
				        button.click();
				      
				      
				      
				      
				      
				      
				}
				
				@Test
				  public void f11() throws InterruptedException {

					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver(options);
				      driver.get("https://www.automationexercise.com/");
				      driver.manage().window().maximize();
				      Thread.sleep(2000);
				      WebElement anchorElement = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
                      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
				      driver.navigate().to("https://www.automationexercise.com/products");
				      driver.navigate().back();
				      driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")).click();
				      driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
				      Thread.sleep(5000);
				      driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
				      driver.navigate().to("https://automationexercise.com/product_details/1");
				      driver.navigate().back();
				      driver.navigate().to("https://automationexercise.com/product_details/1");
				      driver.navigate().back();
				      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[1]/a")).click();
				      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")).click();
				      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[1]/input")).sendKeys("kiran");
				      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[2]/input")).sendKeys("ksdfsdfj@444.com");
				      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input")).sendKeys("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input");
				      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[4]/textarea")).sendKeys("hfskldjfksdfknsdkfjskfj");
//				      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[6]/input")).click();
//				      Thread.sleep(5000);
				      driver.navigate().to("https://automationexercise.com/contact_us");
				      driver.navigate().back();
				      driver.navigate().to("https://automationexercise.com/contact_us");
				      driver.navigate().back();
				      
				      
				      
				    	 }
				
				@Test
				  public void f111() throws InterruptedException {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver(options);
				      driver.get("https://www.automationexercise.com/");
				      driver.manage().window().maximize();
				      Thread.sleep(2000);
				      driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();
				      driver.navigate().to("https://automationexercise.com/test_cases");
				      driver.navigate().refresh();



				    	 }

				
				
				
				      
				      
				      
				      
				      
				
				
				
				
				
				
				
	}
		

