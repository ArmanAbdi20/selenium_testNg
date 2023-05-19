package cw.tests.Day18.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderHomework03 {

    /*
    Open the site: http://opencart.abstracta.us/index.php?route=account/login
Login with that credentials
Email: clarusway@gmail.com
Password: 123456789
Using the Search function do it with Data Provider for Mac, iPad and Samsung.
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

    @Test (dataProvider = "dataProvider")
    public void testDataProvider02(String serch)  {

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        WebElement emailLoc = driver.findElement(By.xpath("//input[@name='email']"));
        emailLoc.sendKeys("clarusway@gmail.com");
        WebElement passwordLoc = driver.findElement(By.xpath("//input[@name='password']"));
        passwordLoc.sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement serchBox = driver.findElement(By.xpath("//input[@name='search']"));
        serchBox.sendKeys(serch);


    }


    @DataProvider
    public Object[][] dataProvider(){

        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }

}
