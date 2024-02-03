package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageWithFoundBook extends BasePage {
    public PageWithFoundBook(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By cartButton = By.xpath("//img[@src='/img/icons/svg/buttons/button_card_red_ua.svg']");
        private final static By intoTheCart_Button = By.xpath("//img[@src='/img/icons/svg/buttons/button_card_gray_ua.svg'][@alt='У кошику']");
        private final static By countOfItemsIcon = By.xpath("//a[@href='/cart/']/span/b");
        private final static By inscription_FreeFromUAH690 = By.xpath("//a[@class='_head_bl_free_deliv pointer']/span");
        private final static By inscription_ShippingCost = By.xpath("//span[@class='hint_t']");
        private final static By closeWindowOfInscription_ShippingCost = By.xpath("//img[@class='close']");
        private final static By arrowsIcon = By.xpath("//a[@href='javascript:void(0);']");
        private final static By sizeOfItem = By.xpath("(//div[@class='s_font_s'])[1]");
        private final static By closeTheWindowSizeOfItem = By.xpath("//img[@title='закрыть']");
        private final static By clickableInscription_MoreDetails = By.xpath("//a[@href='#prod_opis']");
        private final static By information_DescriptionOfTheBook = By.xpath("//header[@id='prod_opis']");
        private final static By previousArrowOfCarouselOfBooks = By.xpath("(//button[@class='slick-prev slick-arrow'])[2]");
        private final static By nextArrowOfCarouselOfBooks = By.xpath("(//button[@class='slick-next slick-arrow'])[2]");
        private final static By inscription_MoreBooksByTheAuthor = By.xpath("(//a[@href='/authorbooks/djoan-garris-books/'])[2]");
    }

    private static class Strings {
        private final static String siteUrl = "https://bookclub.ua/catalog/books/pop/kradiyka-sunic-kniga-4";
    }

    public void openWebsite() {
        logger.info("Відкриваю сайт");
        driver.get(Strings.siteUrl);
    }

    public void clickOnTheCartButton() {
        logger.info("Клікаю на кнопку 'До кошику' " + Locators.cartButton);
        waiters.waitForVisabilityOfWebElement(Locators.cartButton);
        elements.click(Locators.cartButton);
    }

    public String getTextFrom_IntoTheCart_Button() {
        return elements.getTextFromElement(Locators.intoTheCart_Button);
    }

    public int getIntegerFromCountOfItemsIcon() {
        return Integer.parseInt(elements.getTextFromElement(Locators.countOfItemsIcon));
    }

    public void assertCountOfItemsIcon(int expectedResult) {
        assertions.equalsOfInts(getIntegerFromCountOfItemsIcon(), expectedResult);
    }

    public String getTextFromTheInscription_FreeFromUAH690() {
        return elements.getTextFromElement(Locators.inscription_FreeFromUAH690);
    }

    public void assertGetTextFromTheInscription_FreeFromUAH690(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheInscription_FreeFromUAH690(), expectedResult);
    }

    public void clickOnTheInscription_FreeFromUAH690() {
        logger.info("Клікаю на напис 'Безкоштовно* від 690 грн' " + Locators.inscription_FreeFromUAH690);
        elements.click(Locators.inscription_FreeFromUAH690);
    }

    public String getTextFromTheInscription_ShippingCost() {
        return elements.getTextFromElement(Locators.inscription_ShippingCost);
    }

    public void assertGetTextFromTheInscription_ShippingCost(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheInscription_ShippingCost(), expectedResult);
    }

    public void clickOnTheCrossAndCloseTheWindowOfInscription_ShippingCost() {
        logger.info("Клікаю на хрестик вікна з написом 'Вартість доставки!' " + Locators.closeWindowOfInscription_ShippingCost);
        elements.click(Locators.closeWindowOfInscription_ShippingCost);
    }

    public String getTextFromTheArrowsIcon() {
        return elements.getTextFromElement(Locators.arrowsIcon);
    }

    public void assertGetTextFromTheArrowsIcon(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheArrowsIcon(), expectedResult);
    }

    public void clickOnTheArrowsIcon() {
        logger.info("Клікаю на значок стрілочки 'Дізнатися розмір' " + Locators.arrowsIcon);
        elements.click(Locators.arrowsIcon);
    }

    public String getTextFromTheWindowSizeOfItem() {
        return elements.getTextFromElement(Locators.sizeOfItem);
    }

    public void assertGetTextFromTheWindowSizeOfItem(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheWindowSizeOfItem(), expectedResult);
    }

    public void clickOnTheCrossAndCloseTheWindowSizeOfItem() {
        logger.info("Клікаю на хрестик і закриваю вікно розміру товару " + Locators.closeTheWindowSizeOfItem);
        elements.click(Locators.closeTheWindowSizeOfItem);
    }

    public String getTextFromTheClickableInscription_MoreDetails() {
        return elements.getTextFromElement(Locators.clickableInscription_MoreDetails);
    }

    public void assertGetTextFromTheClickableInscription_MoreDetails(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheClickableInscription_MoreDetails(), expectedResult);
    }

    public void clickOnTheClickableInscription_MoreDetails() {
        logger.info("Клікаю на клікабельний напис 'Детальніше' " + Locators.clickableInscription_MoreDetails);
        elements.click(Locators.clickableInscription_MoreDetails);
    }

    public String getTextFromInformation_DescriptionOfTheBook() {
        return elements.getTextFromElement(Locators.information_DescriptionOfTheBook);
    }

    public void assertGetTextFromInformation_DescriptionOfTheBook(String expectedResult) {
        assertions.equalsOfStrings(getTextFromInformation_DescriptionOfTheBook(), expectedResult);
    }

    public String getTextFromInscription_MoreBooksByTheAuthor() {
        return elements.getTextFromElement(Locators.inscription_MoreBooksByTheAuthor);
    }

    public void assertGetTextFromInscription_MoreBooksByTheAuthor(String expectedResult) {
        assertions.equalsOfStrings(getTextFromInscription_MoreBooksByTheAuthor(), expectedResult);
    }

    public String getTextFromThePreviousArrowOfCarouselOfBooks() {
        return elements.getTextFromElement(Locators.previousArrowOfCarouselOfBooks);
    }

    public void assertGetTextFromThePreviousArrowOfCarouselOfBooks(String expectedResult) {
        assertions.equalsOfStrings(getTextFromThePreviousArrowOfCarouselOfBooks(), expectedResult);
    }

    public void clickOnThePreviousArrowOfCarouselOfBooks(int countOfClicks) {
        logger.info("Клікаю на стрілочку (Previous) каруселі книжок  " + Locators.previousArrowOfCarouselOfBooks + " " + countOfClicks + " раз.");
        for (int i = 0; i < countOfClicks; i++) {
            elements.click(Locators.previousArrowOfCarouselOfBooks);
        }
    }

    public String getTextFromTheNextArrowOfCarouselOfBooks() {
        return elements.getTextFromElement(Locators.nextArrowOfCarouselOfBooks);
    }

    public void assertGetTextFromTheNextArrowOfCarouselOfBooks(String expectedResult) {
        assertions.equalsOfStrings(getTextFromTheNextArrowOfCarouselOfBooks(), expectedResult);
    }

    public void clickOnTheNextArrowOfCarouselOfBooks(int countOfClicks) {
        logger.info("Клікаю на стрілочку (Next) каруселі книжок  " + Locators.nextArrowOfCarouselOfBooks + " " + countOfClicks + " раз.");
        for (int i = 0; i < countOfClicks; i++) {
            elements.click(Locators.nextArrowOfCarouselOfBooks);
        }
    }
}




