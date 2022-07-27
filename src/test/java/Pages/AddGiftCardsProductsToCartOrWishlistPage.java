package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGiftCardsProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddGiftCardsProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Gift Cards ']")
    private WebElement giftCardsMenu;

    @FindBy(xpath = "//a[text()='$25 Virtual Gift Card']")
    private WebElement giftCard1;

    @FindBy(id = "giftcard_43_RecipientName")
    private WebElement recipientNameGiftCard1;

    @FindBy(id = "giftcard_43_RecipientEmail")
    private WebElement recipientEmailGiftCard1;

    @FindBy(id = "giftcard_43_Message")
    private WebElement recipientMessageGiftCard1;

    @FindBy(id = "add-to-cart-button-43")
    private WebElement addToCartGiftCard1Button;

    @FindBy(id = "add-to-wishlist-button-43")
    private WebElement addToWishlistGiftCard1Button;

    @FindBy(xpath = "//a[text()='$50 Physical Gift Card']")
    private WebElement giftCard2;

    @FindBy(id = "giftcard_44_RecipientName")
    private WebElement recipientNameGiftCard2;

    @FindBy(id = "giftcard_44_Message")
    private WebElement recipientMessageGiftCard2;

    @FindBy(id = "add-to-cart-button-44")
    private WebElement addToCartGiftCard2Button;

    @FindBy(id = "add-to-wishlist-button-44")
    private WebElement addToWishlistGiftCard2Button;

    @FindBy(xpath = "//a[text()='$100 Physical Gift Card']")
    private WebElement giftCard3;

    @FindBy(id = "giftcard_45_RecipientName")
    private WebElement recipientNameGiftCard3;

    @FindBy(id = "giftcard_45_Message")
    private WebElement recipientMessageGiftCard3;

    @FindBy(id = "add-to-cart-button-45")
    private WebElement addToCartGiftCard3Button;

    @FindBy(id = "add-to-wishlist-button-45")
    private WebElement addToWishlistGiftCard3Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addGiftCard1ToCart(String recipientNameGiftCard1, String recipientEmailGiftCard1, String recipientMessageGiftCard1) {
        loginSite();
        pathToGiftCards();
        accesGiftCard1();
        recipientNameGiftCard1(recipientNameGiftCard1);
        recipientEmailGiftCard1(recipientEmailGiftCard1);
        recipientMessageGiftCard1(recipientMessageGiftCard1);
        addToCartGiftCard1();
    }

    public void addGiftCard2ToCart(String recipientNameGiftCard2, String recipientMessageGiftCard2) {
        pathToGiftCards();
        accesGiftCard2();
        recipientNameGiftCard2(recipientNameGiftCard2);
        recipientMessageGiftCard2(recipientMessageGiftCard2);
        addToCartGiftCard2();
    }

    public void addGiftCard3ToCart(String recipientNameGiftCard3, String recipientMessageGiftCard3) {
        pathToGiftCards();
        accesGiftCard3();
        recipientNameGiftCard3(recipientNameGiftCard3);
        recipientMessageGiftCard3(recipientMessageGiftCard3);
        addToCartGiftCard3();
        accesCartMenu();
    }

    public void addGiftCard1ToWishlist(String recipientNameGiftCard1, String recipientEmailGiftCard1) {
        loginSite();
        pathToGiftCards();
        accesGiftCard1();
        recipientNameGiftCard1(recipientNameGiftCard1);
        recipientEmailGiftCard1(recipientEmailGiftCard1);
        addToWishlistGiftCard1();
    }

    public void addGiftCard2ToWishlist(String recipientNameGiftCard2) {
        pathToGiftCards();
        accesGiftCard2();
        recipientNameGiftCard2(recipientNameGiftCard2);
        addToWishlistGiftCard2();
    }

    public void addGiftCard3ToWishlist(String recipientNameGiftCard3) {
        pathToGiftCards();
        accesGiftCard3();
        recipientNameGiftCard3(recipientNameGiftCard3);
        addToWishlistGiftCard3();
        accesWishlistMenu();
    }

    public void pathToGiftCards() {
        elementMethods.clickElement(giftCardsMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesGiftCard1() {
        elementMethods.clickElement(giftCard1);
    }

    public void recipientNameGiftCard1(String value) {
        elementMethods.fillElement(recipientNameGiftCard1, value);
    }

    public void recipientEmailGiftCard1(String value) {
        elementMethods.fillElement(recipientEmailGiftCard1, value);
    }

    public void recipientMessageGiftCard1(String value) {
        elementMethods.fillElement(recipientMessageGiftCard1, value);
    }

    public void addToCartGiftCard1() {
        elementMethods.clickElement(addToCartGiftCard1Button);
    }

    public void addToWishlistGiftCard1() {
        elementMethods.clickElement(addToWishlistGiftCard1Button);
    }

    public void accesGiftCard2() {
        elementMethods.clickElement(giftCard2);
    }

    public void recipientNameGiftCard2(String value) {
        elementMethods.fillElement(recipientNameGiftCard2, value);
    }

    public void recipientMessageGiftCard2(String value) {
        elementMethods.fillElement(recipientMessageGiftCard2, value);
    }

    public void addToCartGiftCard2() {
        elementMethods.clickElement(addToCartGiftCard2Button);
    }

    public void addToWishlistGiftCard2() {
        elementMethods.clickElement(addToWishlistGiftCard2Button);
    }

    public void accesGiftCard3() {
        elementMethods.clickElement(giftCard3);
    }

    public void recipientNameGiftCard3(String value) {
        elementMethods.fillElement(recipientNameGiftCard3, value);
    }

    public void recipientMessageGiftCard3(String value) {
        elementMethods.fillElement(recipientMessageGiftCard3, value);
    }

    public void addToCartGiftCard3() {
        elementMethods.clickElement(addToCartGiftCard3Button);
    }

    public void addToWishlistGiftCard3() {
        elementMethods.clickElement(addToWishlistGiftCard3Button);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}
