package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddElectronicsProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddElectronicsProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Electronics ']")
    private WebElement electronicsMenu;

    @FindBy(xpath = "//a[text()='Camera & photo ']")
    private WebElement cameraFotoMenu;

    @FindBy(xpath = "//a[text()='Nikon D5500 DSLR']")
    private WebElement cameraFoto1;

    @FindBy(id = "add-to-cart-button-14")
    private WebElement addToCartCameraFoto1BlackButton;

    @FindBy(id = "add-to-wishlist-button-14")
    private WebElement addToWishlistCameraFoto1BlackButton;

    @FindBy(id = "add-to-cart-button-15")
    private WebElement addToCartCameraFoto1RedButton;

    @FindBy(id = "add-to-wishlist-button-15")
    private WebElement addToWishlistCameraFoto1RedButton;

    @FindBy(xpath = "//a[text()='Leica T Mirrorless Digital Camera']")
    private WebElement cameraFoto2;

    @FindBy(id = "add-to-cart-button-16")
    private WebElement addToCartCameraFoto2Button;

    @FindBy(id = "add-to-wishlist-button-16")
    private WebElement addToWishlistCameraFoto2Button;

    @FindBy(xpath = "//a[text()='Cell phones ']")
    private WebElement cellPhonesMenu;

    @FindBy(xpath = "//a[text()='HTC One M8 Android L 5.0 Lollipop']")
    private WebElement cellPhone1;

    @FindBy(id = "add-to-cart-button-18")
    private WebElement addToCartCellPhone1Button;

    @FindBy(id = "add-to-wishlist-button-18")
    private WebElement addToWishlistCellPhone1Button;

    @FindBy(xpath = "//a[text()='HTC One Mini Blue']")
    private WebElement cellPhone2;

    @FindBy(id = "add-to-cart-button-19")
    private WebElement addToCartCellPhone2Button;

    @FindBy(id = "add-to-wishlist-button-19")
    private WebElement addToWishlistCellPhone2Button;

    @FindBy(xpath = "//a[text()='Nokia Lumia 1020']")
    private WebElement cellPhone3;

    @FindBy(id = "add-to-cart-button-20")
    private WebElement addToCartCellPhone3Button;

    @FindBy(id = "add-to-wishlist-button-20")
    private WebElement addToWishlistCellPhone3Button;

    @FindBy(xpath = "//a[text()='Others ']")
    private WebElement othersMenu;

    @FindBy(xpath = "//a[text()='Beats Pill 2.0 Wireless Speaker']")
    private WebElement others1;

    @FindBy(id = "add-to-cart-button-21")
    private WebElement addToCartOthers1;

    @FindBy(id = "add-to-wishlist-button-21")
    private WebElement addToWishlistOthers1;

    @FindBy(xpath = "//a[text()='Portable Sound Speakers']")
    private WebElement others2;

    @FindBy(id = "add-to-cart-button-23")
    private WebElement addToCartOthers2;

    @FindBy(id = "add-to-wishlist-button-23")
    private WebElement addToWishlistOthers2;

    @FindBy(xpath = "//a[text()='Universal 7-8 Inch Tablet Cover']")
    private WebElement others3;

    @FindBy(id = "add-to-cart-button-22")
    private WebElement addToCartOthers3;

    @FindBy(id = "add-to-wishlist-button-22")
    private WebElement addToWishlistOthers3;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addcameraFoto1ToCart() throws InterruptedException {
        loginSite();
        pathToCameraPhoto();
        accesCameraFoto1();
        addToCartCameraFoto1Black();
        Thread.sleep(700);
        addToCartCameraFoto1Red();
    }

    public void addcameraFoto2ToCart() {
        pathToCameraPhoto();
        accesCameraFoto2();
        addToCartCameraFoto2();
    }

    public void addCellPhone1ToCart() {
        pathToCellPhones();
        accesCellPhone1();
        addToCartPhone1();
    }

    public void addCellPhone2ToCart() {
        pathToCellPhones();
        accesCellPhone2();
        addToCartPhone2();
    }

    public void addCellPhone3ToCart() {
        pathToCellPhones();
        accesCellPhone3();
        addToCartPhone3();
    }

    public void addSpeaker1ToCart() {
        pathToOthers();
        accesOthers1();
        addToCartOthers1();
    }

    public void addSpeaker2ToCart() {
        pathToOthers();
        accesOthers2();
        addToCartOthers2();
    }

    public void addTabletCoverToCart() {
        pathToOthers();
        accesOthers3();
        addToCartOthers3();
        accesCartMenu();
    }

    public void addcameraFoto1ToWishlist() throws InterruptedException {
        loginSite();
        pathToCameraPhoto();
        accesCameraFoto1();
        addToWishlistCameraFoto1Black();
        Thread.sleep(700);
        addToWishlistCameraFoto1Red();
    }

    public void addcameraFoto2ToWishlist() {
        pathToCameraPhoto();
        accesCameraFoto2();
        addToWishlistCameraFoto2();
    }

    public void addCellPhone1ToWishlist() {
        pathToCellPhones();
        accesCellPhone1();
        addToWishlistPhone1();
    }

    public void addCellPhone2ToWishlist() {
        pathToCellPhones();
        accesCellPhone2();
        addToWishlistPhone2();
    }

    public void addCellPhone3ToWishlist() {
        pathToCellPhones();
        accesCellPhone3();
        addToWishlistPhone3();
    }

    public void addSpeaker1ToWishlist() {
        pathToOthers();
        accesOthers1();
        addToWishlistOthers1();
    }

    public void addSpeaker2ToWishlist() {
        pathToOthers();
        accesOthers2();
        addToWishlistOthers2();
    }

    public void addTabletCoverToWishlist() {
        pathToOthers();
        accesOthers3();
        addToWishlistOthers3();
        accesWishlistMenu();
    }

    public void pathToCameraPhoto() {
        elementMethods.hoverElement(electronicsMenu);
        elementMethods.hoverElement(cameraFotoMenu);
        elementMethods.clickElement(cameraFotoMenu);
    }

    public void pathToCellPhones() {
        elementMethods.hoverElement(electronicsMenu);
        elementMethods.hoverElement(cellPhonesMenu);
        elementMethods.clickElement(cellPhonesMenu);
    }

    public void pathToOthers() {
        elementMethods.hoverElement(electronicsMenu);
        elementMethods.hoverElement(othersMenu);
        elementMethods.clickElement(othersMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesCameraFoto1() {
        elementMethods.clickElement(cameraFoto1);
    }

    public void addToCartCameraFoto1Black() {
        elementMethods.clickElement(addToCartCameraFoto1BlackButton);
    }

    public void addToWishlistCameraFoto1Black() {
        elementMethods.clickElement(addToWishlistCameraFoto1BlackButton);
    }

    public void addToCartCameraFoto1Red() {
        elementMethods.clickElement(addToCartCameraFoto1RedButton);
    }

    public void addToWishlistCameraFoto1Red() {
        elementMethods.clickElement(addToWishlistCameraFoto1RedButton);
    }

    public void accesCameraFoto2() {
        elementMethods.clickElement(cameraFoto2);
    }

    public void addToCartCameraFoto2() {
        elementMethods.clickElement(addToCartCameraFoto2Button);
    }

    public void addToWishlistCameraFoto2() {
        elementMethods.clickElement(addToWishlistCameraFoto2Button);
    }

    public void accesCellPhone1() {
        elementMethods.clickElement(cellPhone1);
    }

    public void addToCartPhone1() {
        elementMethods.clickElement(addToCartCellPhone1Button);
    }

    public void addToWishlistPhone1() {
        elementMethods.clickElement(addToWishlistCellPhone1Button);
    }

    public void accesCellPhone2() {
        elementMethods.clickElement(cellPhone2);
    }

    public void addToCartPhone2() {
        elementMethods.clickElement(addToCartCellPhone2Button);
    }

    public void addToWishlistPhone2() {
        elementMethods.clickElement(addToWishlistCellPhone2Button);
    }

    public void accesCellPhone3() {
        elementMethods.clickElement(cellPhone3);
    }

    public void addToCartPhone3() {
        elementMethods.clickElement(addToCartCellPhone3Button);
    }

    public void addToWishlistPhone3() {
        elementMethods.clickElement(addToWishlistCellPhone3Button);
    }

    public void accesOthers1() {
        elementMethods.clickElement(others1);
    }

    public void addToCartOthers1() {
        elementMethods.clickElement(addToCartOthers1);
    }

    public void addToWishlistOthers1() {
        elementMethods.clickElement(addToWishlistOthers1);
    }

    public void accesOthers2() {
        elementMethods.clickElement(others2);
    }

    public void addToCartOthers2() {
        elementMethods.clickElement(addToCartOthers2);
    }

    public void addToWishlistOthers2() {
        elementMethods.clickElement(addToWishlistOthers2);
    }

    public void accesOthers3() {
        elementMethods.clickElement(others3);
    }

    public void addToCartOthers3() {
        elementMethods.clickElement(addToCartOthers3);
    }

    public void addToWishlistOthers3() {
        elementMethods.clickElement(addToWishlistOthers3);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }
}
