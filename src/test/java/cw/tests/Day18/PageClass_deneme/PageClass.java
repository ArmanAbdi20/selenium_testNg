package cw.tests.Day18.PageClass_deneme;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {

    /*
    Navigate to https://www.saucedemo.com/
Enter the user name as standard_user
Enter the password as secret_sauce
Click on login button.
- Choose price low to high with soft Assert.
- Verify item prices are sorted from low to high with hard Assert.
     */
    public PageClass() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id ="user-name")
    WebElement userName;

    @FindBy (id ="password")
    WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    WebElement login;

    @FindBy (xpath ="//select[@class='product_sort_container']")
    WebElement selection;



}
