package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBooksProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddBooksProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Books ']")
    private WebElement booksMenu;

    @FindBy(xpath = "//a[text()='Fahrenheit 451 by Ray Bradbury']")
    private WebElement book1;

    @FindBy(id = "add-to-cart-button-37")
    private WebElement addToCartBook1Button;

    @FindBy(id = "add-to-wishlist-button-37")
    private WebElement addToWishlistBook1Button;

    @FindBy(xpath = "//a[text()='First Prize Pies']")
    private WebElement book2;

    @FindBy(id = "add-to-cart-button-38")
    private WebElement addToCartBook2Button;

    @FindBy(id = "add-to-wishlist-button-38")
    private WebElement addToWishlistBook2Button;

    @FindBy(xpath = "//a[text()='Pride and Prejudice']")
    private WebElement book3;

    @FindBy(id = "add-to-cart-button-39")
    private WebElement addToCartBook3Button;

    @FindBy(id = "add-to-wishlist-button-39")
    private WebElement addToWishlistBook3Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addBook1ToCart() {
        loginSite();
        pathToBooks();
        accesBook1();
        addToCartBook1();
    }

    public void addBook2ToCart() {
        pathToBooks();
        accesBook2();
        addToCartBook2();
    }

    public void addBook3ToCart() {
        pathToBooks();
        accesBook3();
        addToCartBook3();
        accesCartMenu();
    }

    public void addBook1ToWishlist() {
        loginSite();
        pathToBooks();
        accesBook1();
        addToWishlistBook1();
    }

    public void addBook2ToWishlist() {
        pathToBooks();
        accesBook2();
        addToWishlistBook2();
    }

    public void addBook3ToWishlist() {
        pathToBooks();
        accesBook3();
        addToWishlistBook3();
        accesWishlistMenu();
    }

    public void pathToBooks() {
        elementMethods.clickElement(booksMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesBook1() {
        elementMethods.clickElement(book1);
    }

    public void addToCartBook1() {
        elementMethods.clickElement(addToCartBook1Button);
    }

    public void addToWishlistBook1() {
        elementMethods.clickElement(addToWishlistBook1Button);
    }

    public void accesBook2() {
        elementMethods.clickElement(book2);
    }

    public void addToCartBook2() {
        elementMethods.clickElement(addToCartBook2Button);
    }

    public void addToWishlistBook2() {
        elementMethods.clickElement(addToWishlistBook2Button);
    }

    public void accesBook3() {
        elementMethods.clickElement(book3);
    }

    public void addToCartBook3() {
        elementMethods.clickElement(addToCartBook3Button);
    }

    public void addToWishlistBook3() {
        elementMethods.clickElement(addToWishlistBook3Button);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}
