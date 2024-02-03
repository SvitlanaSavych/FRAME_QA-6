import org.testng.annotations.Test;

public class HomePageOfSiteTest extends BaseTest {



    @Test(dependsOnMethods = {"loginIntoPersonalAccountWithExistentClientNumberAndRegisteredSurname"}, alwaysRun = true)
    public void loginIntoPersonalAccountWithNonExistentClientNumberAndRegisteredSurname() {
        homePageOfSite.openWebsite();
        homePageOfSite.clickOnTabEnter();
        homePageOfSite.assertGetTextFromThe_LoginToTheSite_Window("Вхід на сайт");
        homePageOfSite.fillTheIncorrectFields();
        homePageOfSite.assertFillTheIncorrectNumberOfClient("55555");
        homePageOfSite.assertFillTheSurnameOfClient("Савич");
        homePageOfSite.clickOnTheEnterButton();
        homePageOfSite.assertGetTheErrorText("Допущено помилку у вашому клубному номері або у прізвищі. Будь ласка, спробуйте ще раз.");
    }

    @Test(priority = 1)
    public void loginIntoPersonalAccountWithExistentClientNumberAndRegisteredSurname() {
        homePageOfSite.openWebsite();
        homePageOfSite.clickOnTabEnter();
        homePageOfSite.assertGetTextFromThe_LoginToTheSite_Window("Вхід на сайт");
        homePageOfSite.fillTheCorrectFields();
        homePageOfSite.assertFillTheCorrectNumberOfClient("207027");
        homePageOfSite.assertFillTheSurnameOfClient("Савич");
        homePageOfSite.clickOnTheEnterButton();
        homePageOfSite.hoveringCursorToTabPersonalAccount();
        homePageOfSite.assertGetTextFromTheTabPersonalAccount("Кабінет");
        homePageOfSite.clickOnTheExitButton();
        homePageOfSite.assertGetTextFromTheTabEnter("Вхід");
    }

    @Test(priority = 3)
    public void searchBooksFromCategoryOfModernAuthors() {
        homePageOfSite.openWebsite();
        homePageOfSite.clickOnLoupeSearch();
        homePageOfSite.writeTextToSearchField();
        homePageOfSite.assertGetSearchResult("Сучасні автори");
    }

    @Test(priority = 4)
    public void checkClickingOnPaymentTab() {
        homePageOfSite.openWebsite();
        homePageOfSite.clickOnPaymentTab();
        homePageOfSite.assertGetResultOfCheckingPaymentTab("Способи оплати замовлення");
    }

    @Test(priority = 2)
    public void checkingDropDownMenuOfeBooksTabWithInformationOfThisCategory() {
        homePageOfSite.openWebsite();
        homePageOfSite.hoveringCursorToeBooksTab();
        homePageOfSite.assertGetTextFromDropDownMenu(
                "Художні\n" +
                "Сучасні автори\n" +
                "Романи про кохання\n" +
                "Історико-пригодницькі\n" +
                "Детективи\n" +
                "Фантастика\n" +
                "Фентезі\n" +
                "Трилери\n" +
                "Класика\n" +
                "Книги для підлітків\n" +
                "Прикладні\n" +
                "Здоров’я\n" +
                "Психологія\n" +
                "Бізнес-література\n" +
                "Саморозвиток, мотивація\n" +
                "Езотерика\n" +
                "Історія і факти\n" +
                "Научпоп\n" +
                "Дитячі\n" +
                "Дітям 7-12 років\n" +
                "Дітям від 12 років");
    }
}
