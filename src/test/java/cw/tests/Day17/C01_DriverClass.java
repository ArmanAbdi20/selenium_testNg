package cw.tests.Day17;

import cw.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_DriverClass {





    @Test
    public void test01(){

        // driver objesi kullanmak için Driver class dan getDriver method return edebiliriz

        WebDriver driver = Driver.getDriver();

        driver.get("http://www.amazon.com");

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Amazon"));

        Driver.closeDriver();
    }
}
