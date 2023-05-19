package cw.tests.Day16.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderHomework01 {

    /*
    Open the site: https://www.amazon.com/
Search the following keys with DataProvider:
Java
JavaScript
Phyton
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {

        driver.close();
    }


    @Test(dataProvider = "data")
    public void test01(String title) {

        driver.get("https://www.amazon.com/");
        WebElement serchElement = driver.findElement(By.id("twotabsearchtextbox"));

        serchElement.sendKeys(title, Keys.ENTER);

        WebElement resultText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));

        Assert.assertTrue(resultText.getText().contains(title));


    }

    @DataProvider
    public Object[][] data() {

        Object[][]  data = new Object[3][1];
        data[0] = new Object[]{"Python"};
        data[1] = new Object[]{"Java"};
        data[2] = new Object[]{"Javascript"};

        return data;

    }
}
