package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddApparelProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddApparelProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Apparel ']")
    private WebElement apparelMenu;

    @FindBy(xpath = "//a[text()='Shoes ']")
    private WebElement shoesMenu;

    @FindBy(xpath = "//a[text()='adidas Consortium Campus 80s Running Shoes']")
    private WebElement shoes1;

    @FindBy(id = "product_attribute_9")
    private WebElement sizeShoes1;

    @FindBy(xpath = "//span[@style='background-color:#363656']")
    private WebElement colorShoes1;

    @FindBy(id = "add-to-cart-button-25")
    private WebElement addToCartShoes1Button;

    @FindBy(id = "add-to-wishlist-button-25")
    private WebElement addToWishlistShoes1Button;

    @FindBy(xpath = "//a[text()='Nike Floral Roshe Customized Running Shoes']")
    private WebElement shoes2;

    @FindBy(id = "product_attribute_6")
    private WebElement sizeShoes2;

    @FindBy(id = "product_attribute_7")
    private WebElement colorShoes2;

    @FindBy(xpath = "//label[@for='product_attribute_8_19']")
    private WebElement printDesignShoes2;

    @FindBy(id = "add-to-cart-button-24")
    private WebElement addToCartShoes2Button;

    @FindBy(id = "add-to-wishlist-button-24")
    private WebElement addToWishlistShoes2Button;

    @FindBy(xpath = "//a[text()='Nike SB Zoom Stefan Janoski \"Medium Mint\"']")
    private WebElement shoes3;

    @FindBy(id = "add-to-cart-button-26")
    private WebElement addToCartShoes3Button;

    @FindBy(id = "add-to-wishlist-button-26")
    private WebElement addToWishlistShoes3Button;

    @FindBy(xpath = "//a[text()='Clothing ']")
    private WebElement clothingMenu;

    @FindBy(xpath = "//a[text()='Custom T-Shirt']")
    private WebElement clothing1;

    @FindBy(id = "product_attribute_12")
    private WebElement enterTextClothing1;

    @FindBy(id = "add-to-cart-button-29")
    private WebElement addToCartClothing1Button;

    @FindBy(id = "add-to-wishlist-button-29")
    private WebElement addToWishlistClothing1Button;

    @FindBy(xpath = "//div[@data-productid='30']")
    private WebElement clothing2;

    @FindBy(id = "add-to-cart-button-30")
    private WebElement addToCartClothing2Button;

    @FindBy(id = "add-to-wishlist-button-30")
    private WebElement addToWishlistClothing2Button;

    @FindBy(xpath = "//a[text()='Nike Tailwind Loose Short-Sleeve Running Shirt']")
    private WebElement clothing3;

    @FindBy(id = "product_attribute_11")
    private WebElement sizeClothing3;

    @FindBy(id = "add-to-cart-button-27")
    private WebElement addToCartClothing3Button;

    @FindBy(id = "add-to-wishlist-button-27")
    private WebElement addToWishlistClothing3Button;

    @FindBy(xpath = "//a[text()='Oversized Women T-Shirt']")
    private WebElement clothing4;

    @FindBy(id = "add-to-cart-button-28")
    private WebElement addToCartClothing4Button;

    @FindBy(id = "add-to-wishlist-button-28")
    private WebElement addToWishlistClothing4Button;

    @FindBy(xpath = "//a[text()='Accessories ']")
    private WebElement accessoriesMenu;

    @FindBy(xpath = "//a[text()='Obey Propaganda Hat']")
    private WebElement accessory1;

    @FindBy(id = "product_attribute_13")
    private WebElement selectSizeAccessory1;

    @FindBy(id = "add-to-cart-button-31")
    private WebElement addToCartAccessory1Button;

    @FindBy(id = "add-to-wishlist-button-31")
    private WebElement addToWishlistAccessory1Button;

    @FindBy(xpath = "//a[text()='Ray Ban Aviator Sunglasses']")
    private WebElement accessory2;

    @FindBy(id = "add-to-cart-button-33")
    private WebElement addToCartAccessory2Button;

    @FindBy(id = "add-to-wishlist-button-33")
    private WebElement addToWishlistAccessory2Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addShoes1ToCart(String size) {
        loginSite();
        pathToShoes();
        accesShoes1();
        selectSizeShoes1(size);
        selectColorShoes1();
        addToCartShoes1();
    }

    public void addShoes2ToCart(String size, String color) {
        driver.get("https://demo.nopcommerce.com/");
        pathToShoes();
        accesShoes2();
        selectSizeShoes2(size);
        selectColorShoes2(color);
        selectPrintDesignShoes2();
        moveCoursorShoes2();
        addToCartShoes2();
    }

    public void addShoes3ToCart() {
        driver.get("https://demo.nopcommerce.com/");
        pathToShoes();
        accesShoes3();
        addToCartShoes3();
    }

    public void addClothing1ToCart(String text) {
        pathToClothing();
        accesClothing1();
        enterTextClothing1(text);
        addToCartClothing1();
    }

    public void addClothing2ToCart() {
        pathToClothing();
        accesClothing2();
        addToCartClothing2();
    }

    public void addClothing3ToCart(String size) {
        pathToClothing();
        accesClothing3();
        selectSizeClothing3(size);
        addToCartClothing3();
    }

    public void addClothing4ToCart() {
        pathToClothing();
        accesClothing4();
        addToCartClothing4();
    }

    public void addAccessory1ToCart(String size) {
        pathToAccessories();
        accesAccessory1();
        selectSizeAccessory1(size);
        addToCartAccessory1();
    }

    public void addAccessory2ToCart() {
        pathToAccessories();
        accesAccessory2();
        addToCartAccessory2();
        accesCartMenu();
    }

    public void addShoes1ToWishlist(String size) {
        loginSite();
        pathToShoes();
        accesShoes1();
        selectSizeShoes1(size);
        selectColorShoes1();
        addToWishlistShoes1();
    }

    public void addShoes2ToWishlist(String size, String color) {
        pathToShoes();
        accesShoes2();
        selectSizeShoes2(size);
        selectColorShoes2(color);
        selectPrintDesignShoes2();
        moveCoursorShoes2();
        addToWishlistShoes2();
    }

    public void addShoes3ToWishlist() {
        pathToShoes();
        accesShoes3();
        addToWishlistShoes3();
    }

    public void addClothing1ToWishlist(String text) {
        pathToClothing();
        accesClothing1();
        enterTextClothing1(text);
        addToWishlistClothing1();
    }

    public void addClothing2ToWishlist() {
        pathToClothing();
        accesClothing2();
        addToWishlistClothing2();
    }

    public void addClothing3ToWishlist(String size) {
        pathToClothing();
        accesClothing3();
        selectSizeClothing3(size);
        addToWishlistClothing3();
    }

    public void addClothing4ToWishlist() {
        pathToClothing();
        accesClothing4();
        addToWishlistClothing4();
    }

    public void addAccessory1ToWishlist(String size) {
        pathToAccessories();
        accesAccessory1();
        selectSizeAccessory1(size);
        addToWishlistAccessory1();
    }

    public void addAccessory2ToWishlist() {
        pathToAccessories();
        accesAccessory2();
        addToWishlistAccessory2();
        accesWishlistMenu();
    }

    public void pathToShoes() {
        elementMethods.hoverElement(apparelMenu);
        elementMethods.hoverElement(shoesMenu);
        elementMethods.clickElement(shoesMenu);
    }

    public void pathToClothing() {
        elementMethods.hoverElement(apparelMenu);
        elementMethods.hoverElement(clothingMenu);
        elementMethods.clickElement(clothingMenu);
    }

    public void pathToAccessories() {
        elementMethods.hoverElement(apparelMenu);
        elementMethods.hoverElement(accessoriesMenu);
        elementMethods.clickElement(accessoriesMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesShoes1() {
        elementMethods.clickElement(shoes1);
    }

    public void selectSizeShoes1(String value) {
        elementMethods.selectTextElement(sizeShoes1, value);
    }

    public void selectColorShoes1() {
        elementMethods.clickElement(colorShoes1);
    }

    public void addToCartShoes1() {
        elementMethods.clickElement(addToCartShoes1Button);
    }

    public void addToWishlistShoes1() {
        elementMethods.clickElement(addToWishlistShoes1Button);
    }

    public void accesShoes2() {
        elementMethods.clickElement(shoes2);
    }

    public void selectSizeShoes2(String value) {
        elementMethods.selectTextElement(sizeShoes2, value);
    }

    public void selectColorShoes2(String value) {
        elementMethods.selectTextElement(colorShoes2, value);
    }

    public void selectPrintDesignShoes2() {
        elementMethods.clickElement(printDesignShoes2);
    }

    public void moveCoursorShoes2() {
        elementMethods.hoverElement(apparelMenu);
    }

    public void addToCartShoes2() {
        elementMethods.clickElement(addToCartShoes2Button);
    }

    public void addToWishlistShoes2() {
        elementMethods.clickElement(addToWishlistShoes2Button);
    }

    public void accesShoes3() {
        elementMethods.clickElement(shoes3);
    }

    public void addToCartShoes3() {
        elementMethods.clickElement(addToCartShoes3Button);
    }

    public void addToWishlistShoes3() {
        elementMethods.clickElement(addToWishlistShoes3Button);
    }

    public void accesClothing1() {
        elementMethods.clickElement(clothing1);
    }

    public void enterTextClothing1(String value) {
        elementMethods.fillElement(enterTextClothing1, value);
    }

    public void addToCartClothing1() {
        elementMethods.clickElement(addToCartClothing1Button);
    }

    public void addToWishlistClothing1() {
        elementMethods.clickElement(addToWishlistClothing1Button);
    }

    public void accesClothing2() {
        elementMethods.clickElement(clothing2);
    }

    public void addToCartClothing2() {
        elementMethods.clickElement(addToCartClothing2Button);
    }

    public void addToWishlistClothing2() {
        elementMethods.clickElement(addToWishlistClothing2Button);
    }

    public void accesClothing3() {
        elementMethods.clickElement(clothing3);
    }

    public void selectSizeClothing3(String value) {
        elementMethods.selectTextElement(sizeClothing3, value);
    }

    public void addToCartClothing3() {
        elementMethods.clickElement(addToCartClothing3Button);
    }

    public void addToWishlistClothing3() {
        elementMethods.clickElement(addToWishlistClothing3Button);
    }

    public void accesClothing4() {
        elementMethods.clickElement(clothing4);
    }

    public void addToCartClothing4() {
        elementMethods.clickElement(addToCartClothing4Button);
    }

    public void addToWishlistClothing4() {
        elementMethods.clickElement(addToWishlistClothing4Button);
    }

    public void accesAccessory1() {
        elementMethods.clickElement(accessory1);
    }

    public void selectSizeAccessory1(String value) {
        elementMethods.selectTextElement(selectSizeAccessory1, value);
    }

    public void addToCartAccessory1() {
        elementMethods.clickElement(addToCartAccessory1Button);
    }

    public void addToWishlistAccessory1() {
        elementMethods.clickElement(addToWishlistAccessory1Button);
    }

    public void accesAccessory2() {
        elementMethods.clickElement(accessory2);
    }

    public void addToCartAccessory2() {
        elementMethods.clickElement(addToCartAccessory2Button);
    }

    public void addToWishlistAccessory2() {
        elementMethods.clickElement(addToWishlistAccessory2Button);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}
