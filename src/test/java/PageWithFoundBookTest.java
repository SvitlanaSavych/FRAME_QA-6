import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PageWithFoundBookTest extends BaseTest {



    @Test(priority = 1)
    public void checkingTheAdditionOfTheItemToTheCart() {
        pageWithFoundBook.openWebsite();
        pageWithFoundBook.clickOnTheCartButton();
        pageWithFoundBook.getTextFrom_IntoTheCart_Button();
        pageWithFoundBook.assertCountOfItemsIcon(1);
    }

    @Test(priority = 4)
    public void checkingClickToTheInscription_FreeFromUAH690() {
        pageWithFoundBook.openWebsite();
        pageWithFoundBook.assertGetTextFromTheInscription_FreeFromUAH690("Безкоштовно* вiд 690 грн");
        pageWithFoundBook.clickOnTheInscription_FreeFromUAH690();
        pageWithFoundBook.assertGetTextFromTheInscription_ShippingCost("Вартість доставки!");
        pageWithFoundBook.clickOnTheCrossAndCloseTheWindowOfInscription_ShippingCost();
    }

    @Test(priority = 3)
    public void checkingClickToTheArrowsIcon_FindOutTheSize() {
        pageWithFoundBook.openWebsite();
        pageWithFoundBook.assertGetTextFromTheArrowsIcon("Дізнатися розмір");
        pageWithFoundBook.clickOnTheArrowsIcon();
        pageWithFoundBook.assertGetTextFromTheWindowSizeOfItem("135х205");
        pageWithFoundBook.clickOnTheCrossAndCloseTheWindowSizeOfItem();
    }

    @Test(priority = 2)
    public void checkingClickOnTheClickableInscription_MoreDetails() {
        pageWithFoundBook.openWebsite();
        pageWithFoundBook.assertGetTextFromTheClickableInscription_MoreDetails("Детальніше");
        pageWithFoundBook.clickOnTheClickableInscription_MoreDetails();
        pageWithFoundBook.assertGetTextFromInformation_DescriptionOfTheBook("Опис книги");
    }

    @Test(priority = 5)
    public void checkingClicksOnThePreviousAndNextArrowsOfCarouselOfBooks() {
        pageWithFoundBook.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        int countOfClicks = 3;
        pageWithFoundBook.assertGetTextFromInscription_MoreBooksByTheAuthor("Ще книжки автора:");
        pageWithFoundBook.assertGetTextFromThePreviousArrowOfCarouselOfBooks("Previous");
        pageWithFoundBook.clickOnThePreviousArrowOfCarouselOfBooks(countOfClicks);
        pageWithFoundBook.assertGetTextFromTheNextArrowOfCarouselOfBooks("Next");
        pageWithFoundBook.clickOnTheNextArrowOfCarouselOfBooks(countOfClicks);
    }
}
