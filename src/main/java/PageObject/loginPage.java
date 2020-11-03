package PageObject;

import SetUp.SetUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends SetUps {

    public loginPage(WebDriver driver) {
        this.driver =driver;

    }

    private WebDriver driver;

    //Using By as a locator to identify the login field
    private By Username = By.id("Username");
    private By Password = By.id("Password");
    private By LoginButton = By.className("btn btn-primary account__btn account__btn--small");

    //create a constructor for each field above

    public void enterUsername (String uname){
        //Find the username element and enter the username
        driver.findElement(Username).sendKeys(uname);
    }

    public void enterPassword (String pwd){
        //Find the password element and enter the password
        driver.findElement(Password).sendKeys(pwd);
    }

    public DashboardPage clickLoginButton (){
        //Find the LoginButton and click
        driver.findElement(LoginButton).click();
        return new DashboardPage (driver);
    }
}
