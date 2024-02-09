package presolv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"browser", "app"})
    @Test
    void setup(String browser, String app) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(options);

            driver.get(app);
            System.out.println("Opening Chrome browser with app: " + app);
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Similar setup for Firefox
            // ...

        }
    }
}
