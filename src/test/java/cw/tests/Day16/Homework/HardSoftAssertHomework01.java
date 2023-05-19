package cw.tests.Day16.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertHomework01 {

/*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Puch Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
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

@Test
    public void test01(){
    driver.get("https://practicetestautomation.com/practice-test-login/");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
    driver.findElement(By.xpath("//button[@id='submit']")).click();
    String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
    String actualURL = driver.getCurrentUrl();
    Assert.assertEquals(expectedURL, actualURL);

    String expectedText = "Congratulations student. You successfully logged in!";
    String actualText = driver.findElement(By.tagName("strong")).getText();
    Assert.assertEquals(expectedText, actualText);

    WebElement logOut = driver.findElement(By.xpath("//a[text()='Log out']"));

    Assert.assertTrue(logOut.isDisplayed());

    //SoftAssertions

    SoftAssert soft = new SoftAssert();

    soft.assertEquals(expectedURL,actualURL);
    soft.assertEquals(actualText,expectedText);
    soft.assertTrue(logOut.isDisplayed());
    soft.assertAll();









}




}
