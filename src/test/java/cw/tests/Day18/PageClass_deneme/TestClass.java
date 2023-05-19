package cw.tests.Day18.PageClass_deneme;

import cw.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass {



    @Test
    public void test(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.saucedemo.com/");

        PageClass pageClass = new PageClass();

        pageClass.userName.sendKeys("standard_user");
        pageClass.password.sendKeys("secret_sauce");

        pageClass.login.click();

        pageClass.selection.click();



    }



}
