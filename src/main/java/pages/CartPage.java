package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By cartButton = By.xpath("//img[@src='/img/icons/svg/buttons/button_card_red_ua.svg']");
        private final static By cartIcon = By.xpath("//div[@class='cart-icon cart-icon-1']");
        private final static By column_PromotionalOffers = By.id("txt_action_pr");
        private final static By cartButtonInTheColumn_PromotionalOffers = By.xpath("(//img[@class='cartimg cart--main'])[1]");
        private final static By brandedBag = By.xpath("(//td[@class='cartorderinp'])[9]");
        private final static By inscriptionOfPhysicalGoods = By.xpath("//a[@href='./index.html?cartchange=1']");
        private final static By deletingCross = By.xpath("(//img[@src='/images/cart-del3b.gif'])[2]");
        private final static By inscription_OrderingAndRegistration = By.xpath("(//div[@class='bnc_no_reg'])/div");
        private final static By newPostOffice_Department = By.xpath("(//div[@class='ab_title fleft'])[1]");
        private final static By registeredSurnameOfClientField = By.id("fio1_noreg");
        private final static By nameOfClientField = By.id("fio2_noreg");
        private final static By phoneNumberOfClientField = By.id("phonemob_noreg");
        private final static By emailOfClientField = By.id("auemail_noreg");
        private final static By dropDownPointerOfSities = By.xpath("(//div[@class='line_dropdown pointer'])[1]");
        private final static By sityOfClientField = By.xpath("//div[@class='onecity2'][text()='Бориспіль']");
        private final static By dropDownMenuOfNewPostOffice_DepartmentOfClientField = By.xpath("(//div[@class='line_dropdown'])[1]");
        private final static By newPostOffice_DepartmentOfClientField = By.xpath("(//span[@class='col_span'])[8]");
        private final static By inscriptionOfCheckBox = By.xpath("//div[@class='uslobsl1']");
        private final static By activeCheckBoxSquare = By.xpath("//div[@class='square square_act']");
        private final static By passiveCheckBoxSquare = By.xpath("//div[@class='square square_pas']");
        private final static By inscription_TermsOfService = By.xpath("//a[@class='uslobsl_a']");
        private final static By windowWithPopUpInformation = By.xpath("//div[@class='winhelp']/p");
    }

    private static class Strings {
        private final static String siteUrl = "https://bookclub.ua/cart/";
        private final static String pageWithBookUrl = "https://bookclub.ua/catalog/books/pop/kradiyka-sunic-kniga-4";
        private final static String registeredSurnameOfClient = "Савич";
        private final static String nameOfClient = "Світлана";
        private final static String phoneNumberOfClient = "950000000";
        private final static String emailOfClient = "sss@gmail.com";
    }

    public void openWebsite() {
        logger.info("Відкриваю сайт");
        driver.get(Strings.siteUrl);
    }

    public void openPageWithFoundBook() {
        logger.info("Відкриваю сторінку сайту із вибраною книгою");
        driver.get(Strings.pageWithBookUrl);
        elements.click(Locators.cartButton);
        elements.click(Locators.cartIcon);
    }

    public String getTextFromTheColumn_PromotionalOffers() {
        return elements.getTextFromElement(Locators.column_PromotionalOffers);
    }

    public void assertGetTextFromTheColumn_PromotionalOffers(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheColumn_PromotionalOffers(), expectedResult);
    }

    public void clickOnTheCartButtonInTheColumn_PromotionalOffers() {
        logger.info("Клікаю на кнопку в графі 'Акційні пропозиції' " + Locators.cartButtonInTheColumn_PromotionalOffers);
        elements.click(Locators.cartButtonInTheColumn_PromotionalOffers);
    }

    public String getTextFromItemBrandedBag() {
        return elements.getTextFromElement(Locators.brandedBag);
    }

    public void assertGetTextFromItemBrandedBag(String expectedResult) {
        assertions.equalsOfStrings(getTextFromItemBrandedBag(), expectedResult);
    }

    public String getTextFromInscriptionOfPhysicalGoods() {
        return elements.getTextFromElement(Locators.inscriptionOfPhysicalGoods);
    }

    public void assertCountOfPhysicalGoodsInTheCart(String expectedResult) {
        assertions.equalsOfStrings(getTextFromInscriptionOfPhysicalGoods(), expectedResult);
    }

    public void clickOnTheDeletingCross() {
        logger.info("Клікаю на хрестик видалення товару з кошику під номером 2 " + Locators.deletingCross);
        elements.click(Locators.deletingCross);
    }

    public String getTextFromInscription_OrderingAndRegistration() {
        return elements.getTextFromElement(Locators.inscription_OrderingAndRegistration);
    }

    public void assertGetTextFromInscription_OrderingAndRegistration(String expectedResult) {
        assertions.equalsOfStrings(getTextFromInscription_OrderingAndRegistration(), expectedResult);
    }

    public void clickOnThe_NewPostOffice_Department() {
        logger.info("Клікаю на напис 'Відділення Нової пошти' " + Locators.newPostOffice_Department);
        elements.click(Locators.newPostOffice_Department);
    }

    public void fillTheOrderingForm() {
        logger.info("Заповнюю форму замовлення");
        elements.sendKeys(Locators.registeredSurnameOfClientField, Strings.registeredSurnameOfClient);
        elements.sendKeys(Locators.nameOfClientField, Strings.nameOfClient);
        elements.sendKeys(Locators.phoneNumberOfClientField, Strings.phoneNumberOfClient);
        elements.sendKeys(Locators.emailOfClientField, Strings.emailOfClient);
        elements.click(Locators.dropDownPointerOfSities);
        elements.click(Locators.sityOfClientField);
        elements.click(Locators.dropDownMenuOfNewPostOffice_DepartmentOfClientField);
        elements.click(Locators.newPostOffice_DepartmentOfClientField);
    }

    public void assertFillTheRegisteredSurnameOfClient(String expectedResult) {
        assertions.equalsOfStrings(Strings.registeredSurnameOfClient, expectedResult);
    }

    public void assertFillTheNameOfClient(String expectedResult) {
        assertions.equalsOfStrings(Strings.nameOfClient, expectedResult);
    }

    public void assertFillThePhoneNumberOfClient(String expectedResult) {
        assertions.equalsOfStrings(Strings.phoneNumberOfClient, expectedResult);
    }

    public void assertFillTheEmailOfClient(String expectedResult) {
        assertions.equalsOfStrings(Strings.emailOfClient, expectedResult);
    }

    public String getTextFromTheInscriptionOfCheckBox() {
        return elements.getTextFromElement(Locators.inscriptionOfCheckBox);
    }

    public void assertGetTextFromTheInscriptionOfCheckBox(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheInscriptionOfCheckBox(), expectedResult);
    }

    public void clickOnTheCheckBoxSquare() {
        logger.info("Клікаю на квадратик чек-боксу " + Locators.activeCheckBoxSquare);
        elements.click(Locators.activeCheckBoxSquare);
    }

    public void assertResultOfCheckBoxSquare() {
        WebElement checkbox = driver.findElement(Locators.passiveCheckBoxSquare);
        assertions.resultOfCheckBoxSquare(checkbox);
    }

    public String getTextFromTheInscription_TermsOfService() {
        return elements.getTextFromElement(Locators.inscription_TermsOfService);
    }

    public void assertGetTextFromTheInscription_TermsOfService(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheInscription_TermsOfService(), expectedResult);
    }

    public void hoveringCursorToInscription_TermsOfService() {
        logger.info("Наводжу курсор на напис 'умови обслуговування' " + Locators.inscription_TermsOfService);
        action.hoverTheCursorToElement(Locators.inscription_TermsOfService);
    }

    public String getTextFromWindowWithPopUpInformation() {
        return elements.getTextFromElement(Locators.windowWithPopUpInformation);
    }

    public void assertGetTextFromWindowWithPopUpInformation(String expectedResult) {
        assertions.equalsOfStrings(getTextFromWindowWithPopUpInformation(), expectedResult);
    }
}
