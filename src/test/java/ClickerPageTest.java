import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ClickerPageTest extends BaseTest {


    @BeforeClass
    public void acceptCookies(){
        clickerPage.openWebsite();
//        try {
//            clickerPage.acceptCookies();
//        }catch (Exception e){
//
//        }
    }

    @Test
    public void clickOnPlusButtonAndCheckResultField(){
        clickerPage.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        int countOfClicks = 5;
        clickerPage.switchToClickButtonsFrame();
        clickerPage.clickOnPlusButton(countOfClicks);
        clickerPage.assertCountOfClicks(8);
    }

    @Test
    public void clickOnPlusButtonAndCheckResultField2(){
        clickerPage.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        int countOfClicks = 5;
        clickerPage.switchToClickButtonsFrame();
        clickerPage.clickOnPlusButton(countOfClicks);
        clickerPage.assertCountOfClicks(countOfClicks);
    }
}
