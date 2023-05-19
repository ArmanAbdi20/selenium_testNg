package cw.tests.Day16.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationsHomework01 {

    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test01(){

        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        search.sendKeys("ClarusWay");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
        WebElement result = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String actual =  result.getText();
        System.out.println("actual " + actual);
        String expected ="Yaklaşık 42.200 sonuç bulundu";
        Assert.assertTrue(actual.contains("Yaklaşık"));

    }

    @Test
    public void test02(){

        driver.get("https://eksisozluk2023.com/");
        WebElement search = driver.findElement(By.xpath("//input[@id='search-textbox']"));
        search.sendKeys("ClarusWay");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
