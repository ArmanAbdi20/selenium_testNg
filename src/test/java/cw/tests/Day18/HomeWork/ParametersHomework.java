package cw.tests.Day18.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ParametersHomework {

    /*
    Go to URL: https://www.amazon.com
Search words: Java, Selenium
Assert get text result est that the result text contains the searched Word.
Run tests from XML file.

     */
    private WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test (dataProvider = "getData")
    @Parameters("searchWords")
    public void test(String searchWords){

        driver.get("http://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys(searchWords, Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));

        Assert.assertTrue(result.getText().contains(searchWords));


    }

    @DataProvider
    public Object[][] getData(){

        return new Object [][]{
                {"Java"},
                {"Selenium"},

        } ;
    }

}
