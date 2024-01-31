package presolv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class dowhile {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
	        driver.get("https://bridge-bu.dollarbull.co.in/");

	        WebElement umn = driver.findElement(By.id("email_id"));

	        umn.sendKeys("dollarbull@boppotechnologies.com");

	        driver.findElement(By.name("password")).sendKeys("12345678");

	        driver.findElement(By.name("submit")).click();

	        driver.findElement(By.linkText("Customer Management")).click();

	        // driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[2]/div/a")).click();

	        WebElement umn1 = driver.findElement(By.id("custid"));

	        umn1.sendKeys("feemargin");

	        driver.findElement(By.id("searchstudent")).click();

	        driver.findElement(By.linkText("View Details")).click();

	        driver.findElement(By.id("stocks_btn")).click();

	        driver.findElement(By.linkText("Customer")).click();

	        driver.findElement(By.linkText("Dashboard")).click();

	        //driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[2]/div[1]/form/span/a")).click();

	        driver.findElement(By.linkText("Stock")).click();

	        driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[2]/div/a")).click();

	        // driver.findElement(By.xpath("//*[@id=\"user-row-\"]/td[5]/a/img")).click(); for deactivate stocks

	        // driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/ul/span/button/i")).click();

	        //driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/ul/span/ul/li/a/span")).click();// this for logout

	        driver.findElement(By.linkText("User Management")).click();

	        driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[3]/div/a")).click();

	        driver.findElement(By.linkText("Customer Management")).click();

	        driver.findElement(By.linkText("Partner Management")).click();// click on partner management

	        driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[3]/div/a")).click();

	        driver.findElement(By.linkText("Add Partner")).click(); // line 41 to 46 is for add partner you can you add new partner as well

	        driver.findElement(By.id("name")).sendKeys("kiran");

	        driver.findElement(By.name("mobile_no")).sendKeys("9137884573");

	        driver.findElement(By.id("email")).sendKeys("harry@mailinator.com");

	        driver.findElement(By.id("address")).sendKeys("thane");

	        driver.findElement(By.xpath("//*[@id=\"updatestudent\"]")).click();

	        driver.findElement(By.linkText("Partner")).click();

	        driver.findElement(By.id("patemail")).sendKeys("harry@mailinator.com");

	        driver.findElement(By.id("searchstudent")).click();

	        // driver.findElement(By.xpath("//*[@id=\"user-row-\"]/td[8]/a[4]")).click(); // for resend partner credentials

	        //driver.findElement(By.xpath("//*[@id=\"user-row-\"]/td[8]/a[3]/img")).click(); deactivate partner

	        driver.findElement(By.xpath("//*[@id=\"user-row-\"]/td[9]/a/img")).click();

	        driver.findElement(By.linkText("Dashboard")).click();

	        driver.findElement(By.linkText("Dollarbull Featured")).click();

	        driver.findElement(By.xpath("//*[@id=\"type_chosen\"]/a")).click();

	        driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[3]/div[3]/div[1]")).click();

	        driver.findElement(By.id("stocksymbol")).sendKeys("AAPL");

	        driver.findElement(By.id("searchstudent")).click();

	        driver.findElement(By.name("add_company_id[]")).click();

	        driver.findElement(By.xpath("//*[@id=\"featuresubmit\"]")).click(); // add stocks script

	        driver.findElement(By.name("add_company_id")).click();

	        driver.findElement(By.name("featuresubmit")).click();
	        
	

}
	}
