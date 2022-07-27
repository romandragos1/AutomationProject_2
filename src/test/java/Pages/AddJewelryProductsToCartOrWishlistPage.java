package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddJewelryProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddJewelryProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Jewelry ']")
    private WebElement jewelryMenu;

    @FindBy(xpath = "//a[text()='Elegant Gemstone Necklace (rental)']")
    private WebElement jewelry1;

    @FindBy(id = "rental_start_date_40")
    private WebElement rentalStartDateJewelry1;

    @FindBy(id = "rental_end_date_40")
    private WebElement rentalEndDateJewelry1;

    @FindBy(id = "add-to-cart-button-40")
    private WebElement addToCartJewelry1Button;

    @FindBy(id = "add-to-wishlist-button-40")
    private WebElement addToWishlistJewelry1Button;

    @FindBy(xpath = "//a[text()='Flower Girl Bracelet']")
    private WebElement jewelry2;

    @FindBy(id = "add-to-cart-button-41")
    private WebElement addToCartJewelry2Button;

    @FindBy(id = "add-to-wishlist-button-41")
    private WebElement addToWishlistJewelry2Button;

    @FindBy(xpath = "//a[text()='Vintage Style Engagement Ring']")
    private WebElement jewelry3;

    @FindBy(id = "add-to-cart-button-42")
    private WebElement addToCartJewelry3Button;

    @FindBy(id = "add-to-wishlist-button-42")
    private WebElement addToWishlistJewelry3Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addJewelry1ToCart(String rentalStartDate, String rentalEndDate) {
        loginSite();
        pathToJewelry();
        accesJewelry1();
        selectRentalStartDate(rentalStartDate);
        selectRentalEndDate(rentalEndDate);
        addToCartJewelry1();
    }

    public void addJewelry2ToCart() {
        pathToJewelry();
        accesJewelry2();
        addToCartJewelry2();
    }

    public void addJewelry3ToCart() {
        pathToJewelry();
        accesJewelry3();
        addToCartJewelry3();
        accesCartMenu();
    }

    public void addJewelry1ToWishlist(String rentalStartDate, String rentalEndDate) {
        loginSite();
        pathToJewelry();
        accesJewelry1();
        selectRentalStartDate(rentalStartDate);
        selectRentalEndDate(rentalEndDate);
        addToWishlistJewelry1();
    }

    public void addJewelry2ToWishlist() {
        pathToJewelry();
        accesJewelry2();
        addToWishlistJewelry2();
    }

    public void addJewelry3ToWishlist() {
        pathToJewelry();
        accesJewelry3();
        addToWishlistJewelry3();
        accesWishlistMenu();
    }

    public void pathToJewelry() {
        elementMethods.clickElement(jewelryMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesJewelry1() {
        elementMethods.clickElement(jewelry1);
    }

    public void selectRentalStartDate(String value) {
        elementMethods.fillElement(rentalStartDateJewelry1, value);
    }

    public void selectRentalEndDate(String value) {
        elementMethods.fillElement(rentalEndDateJewelry1, value);
    }

    public void addToCartJewelry1() {
        elementMethods.clickElement(addToCartJewelry1Button);
    }

    public void addToWishlistJewelry1() {
        elementMethods.clickElement(addToWishlistJewelry1Button);
    }

    public void accesJewelry2() {
        elementMethods.clickElement(jewelry2);
    }

    public void addToCartJewelry2() {
        elementMethods.clickElement(addToCartJewelry2Button);
    }

    public void addToWishlistJewelry2() {
        elementMethods.clickElement(addToWishlistJewelry2Button);
    }

    public void accesJewelry3() {
        elementMethods.clickElement(jewelry3);
    }

    public void addToCartJewelry3() {
        elementMethods.clickElement(addToCartJewelry3Button);
    }

    public void addToWishlistJewelry3() {
        elementMethods.clickElement(addToWishlistJewelry3Button);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}
