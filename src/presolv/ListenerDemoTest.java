package presolv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends BaseTest {
    @Test(retryAnalyzer = retry.class)
    public void Lunchapp (){
        driver.get("https://ebay.com");
        Assert.assertTrue(false);


    }

}
