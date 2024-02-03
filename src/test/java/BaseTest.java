import driverFactory.DriverSetUp;
import functions.ActionClass;
import functions.AssertionsClass;
import functions.ElementsClass;
import functions.WaitersClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.*;
import utils.TestResultListeners;

@Listeners(TestResultListeners.class)
public class BaseTest {
    protected WebDriver driver = DriverSetUp.startChromeDriver();

    protected ActionClass action = new ActionClass(driver);
    protected AssertionsClass assertions = new AssertionsClass(driver);
    protected ElementsClass elements = new ElementsClass(driver);
    protected WaitersClass waiters = new WaitersClass(driver);


    protected BasePage basePage = new BasePage(driver);
    protected ClickerPage clickerPage = new ClickerPage(driver);
    protected HomePageOfSite homePageOfSite = new HomePageOfSite(driver);
    protected PageWithFoundBook pageWithFoundBook = new PageWithFoundBook(driver);
    protected CartPage cartPage = new CartPage(driver);


    @BeforeSuite
    public void startDriver() {
        driver = DriverSetUp.startChromeDriver();
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
