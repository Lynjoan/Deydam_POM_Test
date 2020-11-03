package SetUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUps {

    // create a loginPage
  protected loginPage loginPage;

    //import Selenium webDriver
    private WebDriver driver;

@BeforeTest
    //import ChromeDriver
    public void setUp(){
    System.setProperty("WebDriver.chrome.driver","resources/chromedriver.exe");
    driver = new ChromeDriver();

    //maximize windows size
    driver.manage().window().maximize();

    //launch the application URL and wait
    driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //instantiate login after launching the browser
    loginPage = new loginPage(driver);

}

@AfterTest
     public void cleanUp(){
    driver.manage().deleteAllCookies();

}

@AfterClass
    public void closeBrowser(){
    driver.quit();
}

}
