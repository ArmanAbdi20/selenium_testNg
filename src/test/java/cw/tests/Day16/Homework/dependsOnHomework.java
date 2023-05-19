package cw.tests.Day16.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnHomework {

    /*
    Create tests that depend on each other
Create beforeClass and set up settings.
By creating interdependent tests;
First go to Facebook.
Then go to Google depending on Facebook,
Then go to Amazon depending on Google
Close the driver.
     */

    WebDriver driver;
    @BeforeClass
    public void beforeClass(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void afterClass() {

        driver.close();


  }



  @Test
    public void test01(){

      driver.get("https://www.facebook.com/");


  }


  @Test (dependsOnMethods = {"test01"})
    public void test02() {
      driver.get("https://google.com");

  }

  @Test (dependsOnMethods = {"test02"})
    public void test03(){

      driver.get("https://www.amazon.com/");

  }
}
