import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class CartPageTest extends BaseTest {


    @BeforeTest
    public void addingItemToTheCart() {
        cartPage.openPageWithFoundBook();
    }



    @Test(priority = 1)
    public void checkAddingTheItemNamed_BrandedBag_FromTheColumn_PromotionalOffersToTheCart() {
        cartPage.openWebsite();
        cartPage.assertGetTextFromTheColumn_PromotionalOffers(
                "Акцiйнi\n" +
                        "пропозицiї");
        cartPage.clickOnTheCartButtonInTheColumn_PromotionalOffers();
        cartPage.assertGetTextFromItemBrandedBag(
                "Брендована сумка\n" +
                        "Код товара: 4135923");
        cartPage.assertCountOfPhysicalGoodsInTheCart("Фізичні товари (2)");
    }

    @Test(dependsOnMethods = {"checkAddingTheItemNamed_BrandedBag_FromTheColumn_PromotionalOffersToTheCart"}, alwaysRun = true)
    public void checkDeletingTheItemNamed_BrandedBag_FromTheCart() {
        cartPage.openWebsite();
        cartPage.clickOnTheDeletingCross();
        cartPage.assertCountOfPhysicalGoodsInTheCart("Фізичні товари (1)");
    }

    @Test(priority = 2)
    public void fillingTheOrderFormUsingTheRegisteredDataOfTheClient() {
        cartPage.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        cartPage.assertGetTextFromInscription_OrderingAndRegistration(
                "Оформити замовлення\n" +
                        "та зареєструватися\n" +
                        "за спеціальною ціною\n" +
                        "для постійних клієнтів КСД");
        cartPage.clickOnThe_NewPostOffice_Department();
        cartPage.fillTheOrderingForm();
        cartPage.assertFillTheRegisteredSurnameOfClient("Савич");
        cartPage.assertFillTheNameOfClient("Світлана");
        cartPage.assertFillThePhoneNumberOfClient("950000000");
        cartPage.assertFillTheEmailOfClient("sss@gmail.com");
    }

    @Test(dependsOnMethods = {"fillingTheOrderFormUsingTheRegisteredDataOfTheClient"}, alwaysRun = true)
    public void checkClickingToTheCheckBoxSquare() {
        cartPage.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        cartPage.assertGetTextFromTheInscriptionOfCheckBox("Я приймаю умови обслуговування");
        cartPage.clickOnTheCheckBoxSquare();
        cartPage.assertResultOfCheckBoxSquare();
    }

    @Test(dependsOnMethods = {"fillingTheOrderFormUsingTheRegisteredDataOfTheClient"}, alwaysRun = true)
    public void checkHoveringCursorToInscription_TermsOfService() {
        cartPage.openWebsite();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        cartPage.assertGetTextFromTheInscription_TermsOfService("умови обслуговування");
        cartPage.hoveringCursorToInscription_TermsOfService();
        cartPage.assertGetTextFromWindowWithPopUpInformation(
                "Замовляючи товари та послуги на сайті КСД, Ви даєте добровільну та безумовну згоду на обробку власних персональних даних, зокрема з використанням інформаційних (автоматизованих) систем «Клубу Сімейного Дозвілля». Своєю згодою Ви підтверджуєте, що Вам зрозуміла інформація, зазначена у розділі «Захист персональної інформації». А також ви підтверджуєте, що ознайомилися і приймаєте умови Угоди користувача, умови повернення та обміну придбаних товарів, розміщені в постійному публічному доступі на сайті у розділі «Є питання?».");
    }
}
