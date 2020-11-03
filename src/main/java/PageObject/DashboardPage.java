package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }
    private WebDriver driver;

    //using By to locate DashboardPage element
    private By Feed = By.className("sidebar__link-title");
    private By Message = By.className("sidebar__link-title");
    private By MyMusic = By.className("sidebar__link-title");
    private By ForumGroup = By.className("sidebar__link");
    private By LogOut = By.className("topbar__link");

    public void clickFeed (){
        //Find the Feed element and click
        driver.findElement(Feed).click();
    }

    public void clickMessage (){
        //Find the Message element and click
        driver.findElement(Message).click();
    }

    public void clickMyMusic (){
        //Find MyMusic element and click
        driver.findElement(MyMusic).click();
    }

    public void clickForumGroup (){
        //Find ForumGroup element and click
        driver.findElement(ForumGroup).click();
    }

    public loginPage clickLogOut (){
        //Find LogOut element and click
        driver.findElement(LogOut).click();
        return new loginPage (driver);
    }
}
