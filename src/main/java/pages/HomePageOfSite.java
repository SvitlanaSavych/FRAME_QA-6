package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageOfSite extends BasePage {

    public HomePageOfSite(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By tabEnter = By.xpath("//span[text()='Вхід']");
        private final static By loginToTheSiteWindow = By.xpath("//div[@class='log-header']");
        private final static By numberOfClientField = By.xpath(("(//input[@name='getusr'])[2]"));
        private final static By surnameOfClientField = By.xpath("(//input[@name='getwrd'])[2]");
        private final static By enterButton = By.xpath("//input[@type='submit']");
        private final static By exitButton = By.xpath("//div[@class='entrance']/input");
        private final static By errorText = By.cssSelector(".f132d");
        private final static By tabPersonalAccount = By.xpath("//span[text()='Кабінет']");
        private final static By loupeSearch = By.xpath("//input[@src='/imgmail/1.gif']");
        private final static By searchField = By.xpath("//input[@name='q']");
        private final static By searchResult = By.xpath("//a[@class='multi-title']/span");
        private final static By paymentTab = By.xpath("//span[text()='Оплата']");
        private final static By resultOfCheckingPaymentTab = By.tagName("h1");
        private final static By eBooksTab = By.xpath("(//a[@href='/catalog/e-books/'])[1]");
        private final static By textMenuOfeBooksTab = By.xpath("//li[@class='gmenu gm5 ']/ul/li");
    }

    private static class Strings {
        private final static String siteUrl = "https://bookclub.ua/";
        private final static String incorrectNumberOfClient = "55555";
        private final static String correctNumberOfClient = "207027";
        private final static String surnameOfClient = "Савич";
        private final static String authors = "сучасні автори";
    }

    public void openWebsite() {
        logger.info("Відкриваю сайт");
        driver.get(Strings.siteUrl);
    }

    public void clickOnTabEnter() {
        logger.info("Клікаю на вкладку 'Вхід' " + Locators.tabEnter);
        elements.click(Locators.tabEnter);
    }

    public String getTextFromThe_LoginToTheSite_Window() {
        return elements.getTextFromElement(Locators.loginToTheSiteWindow);
    }

    public void assertGetTextFromThe_LoginToTheSite_Window(String expectedResult) {
        assertions.equalsOfStrings(getTextFromThe_LoginToTheSite_Window(), expectedResult);
    }

    public void fillTheIncorrectFields() {
        logger.info("Заповнюю форму 'Вхід на сайт'");
        elements.sendKeys(Locators.numberOfClientField, Strings.incorrectNumberOfClient);
        elements.sendKeys(Locators.surnameOfClientField, Strings.surnameOfClient);
    }
    public void assertFillTheIncorrectNumberOfClient(String expectedResult){
        assertions.equalsOfStrings(Strings.incorrectNumberOfClient, expectedResult);
    }
    public void assertFillTheCorrectNumberOfClient(String expectedResult){
        assertions.equalsOfStrings(Strings.correctNumberOfClient, expectedResult);
    }
    public void assertFillTheSurnameOfClient(String expectedResult){
        assertions.equalsOfStrings(Strings.surnameOfClient, expectedResult);
    }
    public String getTheErrorText() {
        return elements.getTextFromElement(Locators.errorText);
    }

    public void assertGetTheErrorText(String expectedResult) {
        assertions.equalsOfStrings(getTheErrorText(), expectedResult);
    }

    public void fillTheCorrectFields() {
        logger.info("Заповнюю форму 'Вхід на сайт'");
        elements.sendKeys(Locators.numberOfClientField, Strings.correctNumberOfClient);
        elements.sendKeys(Locators.surnameOfClientField, Strings.surnameOfClient);
    }

    public void clickOnTheEnterButton() {
        logger.info("Клікаю на кнопку 'Увійти' " + Locators.enterButton);
        elements.click(Locators.enterButton);
    }

    public void hoveringCursorToTabPersonalAccount() {
        logger.info("Наводжу курсор на вкладку 'Кабінет' " + Locators.tabPersonalAccount);
        action.hoverTheCursorToElement(Locators.tabPersonalAccount);
    }

    public String getTextFromTheTabPersonalAccount() {
        return elements.getTextFromElement(Locators.tabPersonalAccount);
    }

    public void assertGetTextFromTheTabPersonalAccount(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheTabPersonalAccount(), expectedResult);
    }

    public String getTextFromTheTabEnter() {
        return elements.getTextFromElement(Locators.tabEnter);
    }

    public void assertGetTextFromTheTabEnter(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheTabEnter(), expectedResult);
    }

    public void clickOnTheExitButton() {
        logger.info("Клікаю на кнопку 'Вийти' " + Locators.exitButton);
        elements.click(Locators.exitButton);
    }

    public void clickOnLoupeSearch() {
        logger.info("Клікаю на лупу пошуку товару " + Locators.loupeSearch);
        elements.click(Locators.loupeSearch);
    }

    public void writeTextToSearchField() {
        waiters.waitForVisabilityOfWebElement(Locators.searchField);
        elements.sendKeys(Locators.searchField, Strings.authors);
    }

    public String getSearchResult() {
        return elements.getTextFromElement(Locators.searchResult);
    }

    public void assertGetSearchResult(String expectedResult) {
        assertions.equalsOfStrings(getSearchResult(), expectedResult);
    }

    public void clickOnPaymentTab() {
        logger.info("Клікаю на вкладку 'Оплата' " + Locators.paymentTab);
        elements.click(Locators.paymentTab);
    }

    public String getResultOfCheckingPaymentTab() {
        return elements.getTextFromElement(Locators.resultOfCheckingPaymentTab);
    }

    public void assertGetResultOfCheckingPaymentTab(String expectedResult) {
        assertions.equalsOfStrings(getResultOfCheckingPaymentTab(), expectedResult);
    }

    public void hoveringCursorToeBooksTab() {
        logger.info("Наводжу курсор на вкладку 'eBooks' " + Locators.eBooksTab);
        action.hoverTheCursorToElement(Locators.eBooksTab);
    }

    public String getTextFromDropDownMenu() {
        return elements.getTextFromElement(Locators.textMenuOfeBooksTab);
    }

    public void assertGetTextFromDropDownMenu(String expectedResult) {
        assertions.equalsOfStrings(getTextFromDropDownMenu(), expectedResult);
    }
}
