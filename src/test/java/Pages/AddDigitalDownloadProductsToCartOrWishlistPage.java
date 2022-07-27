package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDigitalDownloadProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddDigitalDownloadProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Digital downloads ']")
    private WebElement digitalDownloadsMenu;

    @FindBy(xpath = "//a[text()='If You Wait (donation)']")
    private WebElement digitalDownload1;

    @FindBy(id = "add-to-cart-button-35")
    private WebElement addToCartDigitalDownload1Button;

    @FindBy(id = "add-to-wishlist-button-35")
    private WebElement addToWishlistDigitalDownload1Button;

    @FindBy(xpath = "//a[text()='Night Visions']")
    private WebElement digitalDownload2;

    @FindBy(id = "add-to-cart-button-34")
    private WebElement addToCartDigitalDownload2Button;

    @FindBy(id = "add-to-wishlist-button-34")
    private WebElement addToWishlistDigitalDownload2Button;

    @FindBy(xpath = "//a[text()='Science & Faith']")
    private WebElement digitalDownload3;

    @FindBy(id = "add-to-cart-button-36")
    private WebElement addToCartDigitalDownload3Button;

    @FindBy(id = "add-to-wishlist-button-36")
    private WebElement addToWishlistDigitalDownload3Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addDigitalDownload1ToCart() {
        loginSite();
        pathToDigitalDownload();
        accesDigitalDownload1();
        addToCartDigitalDownload1();
    }

    public void addDigitalDownload2ToCart() {
        pathToDigitalDownload();
        accesDigitalDownload2();
        addToCartDigitalDownload2();
    }

    public void addDigitalDownload3ToCart() {
        pathToDigitalDownload();
        accesDigitalDownload3();
        addToCartDigitalDownload3();
        accesCartMenu();
    }

    public void addDigitalDownload1ToWishlist() {
        loginSite();
        pathToDigitalDownload();
        accesDigitalDownload1();
        addToWishlistDigitalDownload1();
    }

    public void addDigitalDownload2ToWishlist() {
        pathToDigitalDownload();
        accesDigitalDownload2();
        addToWishlistDigitalDownload2();
    }

    public void addDigitalDownload3ToWishlist() {
        pathToDigitalDownload();
        accesDigitalDownload3();
        addToWishlistDigitalDownload3();
        accesWishlistMenu();
    }

    public void pathToDigitalDownload() {
        elementMethods.clickElement(digitalDownloadsMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesDigitalDownload1() {
        elementMethods.clickElement(digitalDownload1);
    }

    public void addToCartDigitalDownload1() {
        elementMethods.clickElement(addToCartDigitalDownload1Button);
    }

    public void addToWishlistDigitalDownload1() {
        elementMethods.clickElement(addToWishlistDigitalDownload1Button);
    }

    public void accesDigitalDownload2() {
        elementMethods.clickElement(digitalDownload2);
    }

    public void addToCartDigitalDownload2() {
        elementMethods.clickElement(addToCartDigitalDownload2Button);
    }

    public void addToWishlistDigitalDownload2() {
        elementMethods.clickElement(addToWishlistDigitalDownload2Button);
    }

    public void accesDigitalDownload3() {
        elementMethods.clickElement(digitalDownload3);
    }

    public void addToCartDigitalDownload3() {
        elementMethods.clickElement(addToCartDigitalDownload3Button);
    }

    public void addToWishlistDigitalDownload3() {
        elementMethods.clickElement(addToWishlistDigitalDownload3Button);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}