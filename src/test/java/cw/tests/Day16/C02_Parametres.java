package cw.tests.Day16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class C02_Parametres {


    protected WebDriver driver;

    @BeforeMethod
    @Parameters ("browser")
    public void setup(@Optional("chrome") String browser){


        // browser i parametre olarak alsak
        // switch ile veya if /else bloklarına tabi tutulur
        // browser imiz "chrome" ise chromedriver set edilir
        // browser imiz "firefox" ise firefoxdriver set edilir


        switch (browser){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
             break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void teardown() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void test(){

        driver.get("https://www.amazon.com/");

    }
}
