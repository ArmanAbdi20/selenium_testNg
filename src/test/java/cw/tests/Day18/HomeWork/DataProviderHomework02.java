package cw.tests.Day18.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderHomework02 {


    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
Login with negative credentilas by Data Provider.
Then assert that ‘’Invalid credentials’’ is displayed.
     */

   private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test (dataProvider = "veri")
    public void testDataProvider(String userName, String password){

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userNameLoc = driver.findElement(By.xpath("//input[@name='username']"));
        userNameLoc.sendKeys(userName);
        WebElement passwordLoc = driver.findElement(By.xpath("//input[@name='password']"));
        passwordLoc.sendKeys(password);
        WebElement loginBut = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBut.click();
        WebElement alertMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        Assert.assertTrue(alertMessage.isDisplayed(),"Text is not displayed");

    }



    @DataProvider
    public Object[][] veri (){


        return new Object[][]{
                {"Admin","EbikGabık"},
                {"ebikGabık","admin123"},
                {"ebik","Gabık"}
        };
    }
}
