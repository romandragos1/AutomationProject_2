package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddComputersProductsToCartOrWishlistPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddComputersProductsToCartOrWishlistPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Computers ']")
    private WebElement computersMenu;

    @FindBy(xpath = "//a[text()='Desktops ']")
    private WebElement desktopsMenu;

    @FindBy(xpath = "//a[text()='Build your own computer']")
    private WebElement desktop1;

    @FindBy(id = "product_attribute_1")
    private WebElement selectProcessor;

    @FindBy(id = "product_attribute_2")
    private WebElement selectRam;

    @FindBy(id = "product_attribute_3_7")
    private WebElement selectHdd;

    @FindBy(id = "product_attribute_4_9")
    private WebElement selectOs;

    @FindBy(id = "product_attribute_5_11")
    private WebElement selectAcrobatReader;

    @FindBy(id = "product_attribute_5_12")
    private WebElement selectTotalCommander;

    @FindBy(id = "add-to-cart-button-1")
    private WebElement addToCartDesktop1Button;

    @FindBy(id = "add-to-wishlist-button-1")
    private WebElement addToWishlistDesktop1Button;

    @FindBy(xpath = "//a[text()='Digital Storm VANQUISH 3 Custom Performance PC']")
    private WebElement desktop2;

    @FindBy(id = "add-to-cart-button-2")
    private WebElement addToCartDesktop2Button;

    @FindBy(id = "add-to-wishlist-button-2")
    private WebElement addToWishlistDesktop2Button;

    @FindBy(xpath = "//a[text()='Lenovo IdeaCentre 600 All-in-One PC']")
    private WebElement desktop3;

    @FindBy(id = "add-to-wishlist-button-3")
    private WebElement addToWishlistDesktop3Button;

    @FindBy(id = "add-to-cart-button-3")
    private WebElement addToCartDesktop3Button;

    @FindBy(xpath = "//a[text()='Notebooks ']")
    private WebElement notebooksMenu;

    @FindBy(xpath = "//a[text()='Apple MacBook Pro 13-inch']")
    private WebElement notebook1;

    @FindBy(id = "add-to-cart-button-4")
    private WebElement addToCartNotebook1Button;

    @FindBy(id = "add-to-wishlist-button-4")
    private WebElement addToWishlistNotebook1Button;

    @FindBy(xpath = "//a[text()='Asus N551JK-XO076H Laptop']")
    private WebElement notebook2;

    @FindBy(id = "add-to-cart-button-5")
    private WebElement addToCartNotebook2Button;

    @FindBy(id = "add-to-wishlist-button-5")
    private WebElement addToWishlistNotebook2Button;

    @FindBy(xpath = "//a[text()='HP Envy 6-1180ca 15.6-Inch Sleekbook']")
    private WebElement notebook3;

    @FindBy(id = "add-to-cart-button-8")
    private WebElement addToCartNotebook3Button;

    @FindBy(id = "add-to-wishlist-button-8")
    private WebElement addToWishlistNotebook3Button;

    @FindBy(xpath = "//a[text()='HP Spectre XT Pro UltraBook']")
    private WebElement notebook4;

    @FindBy(id = "add-to-cart-button-7")
    private WebElement addToCartNotebook4Button;

    @FindBy(id = "add-to-wishlist-button-7")
    private WebElement addToWishlistNotebook4Button;

    @FindBy(xpath = "//a[text()='Lenovo Thinkpad X1 Carbon Laptop']")
    private WebElement notebook5;

    @FindBy(id = "add-to-cart-button-9")
    private WebElement addToCartNotebook5Button;

    @FindBy(id = "add-to-wishlist-button-9")
    private WebElement addToWishlistNotebook5Button;

    @FindBy(xpath = "//a[text()='Samsung Series 9 NP900X4C Premium Ultrabook']")
    private WebElement notebook6;

    @FindBy(id = "add-to-cart-button-6")
    private WebElement addToCartNotebook6Button;

    @FindBy(id = "add-to-wishlist-button-6")
    private WebElement addToWishlistNotebook6Button;

    @FindBy(xpath = "//a[text()='Software ']")
    private WebElement softwareMenu;

    @FindBy(xpath = "//a[text()='Sound Forge Pro 11 (recurring)']")
    private WebElement software1;

    @FindBy(id = "add-to-cart-button-12")
    private WebElement addToCartSoftware1Button;

    @FindBy(id = "add-to-wishlist-button-12")
    private WebElement addToWishlistSoftware1Button;

    @FindBy(xpath = "//a[text()='Windows 8 Pro']")
    private WebElement software2;

    @FindBy(id = "add-to-cart-button-11")
    private WebElement addToCartSoftware2Button;

    @FindBy(id = "add-to-wishlist-button-11")
    private WebElement addToWishlistSoftware2Button;

    @FindBy(xpath = "//a[@class='ico-wishlist']")
    private WebElement wishlistMenu;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    public void addDesktop1ToCart(String procesor, String ram) throws InterruptedException {
        loginSite();
        pathToDesktops();
        accesDesktop1();
        selectProcessorDesktop1(procesor);
        selectRamDesktop1(ram);
        clickHddDesktop1();
        clickOsDesktop1();
        clickAcrobatReaderDesktop1();
        clickTotalCommanderDesktop1();
        addToCartDesktop1();
        waitForElementDesktop1();
    }

    public void addDesktop2ToCart() {
        pathToDesktops();
        accesDesktop2();
        addToCartDesktop2();
    }

    public void addDesktop3ToCart() {
        pathToDesktops();
        accesDesktop3();
        addToCartDesktop3();
    }

    public void addNotebook1ToCart() {
        pathToNotebooks();
        accesNotebook1();
        addToCartNotebook1();
    }

    public void addNotebook2ToCart() {
        pathToNotebooks();
        accesNotebook2();
        addToCartNotebook2();
    }

    public void addNotebook3ToCart() {
        pathToNotebooks();
        accesNotebook3();
        addToCartNotebook3();
    }

    public void addNotebook4ToCart() {
        pathToNotebooks();
        accesNotebook4();
        addToCartNotebook4();
    }

    public void addNotebook5ToCart() {
        pathToNotebooks();
        accesNotebook5();
        addToCartNotebook5();
    }

    public void addNotebook6ToCart() {
        pathToNotebooks();
        accesNotebook6();
        addToCartNotebook6();
    }

    public void addSoftware1ToCart() {
        pathToSoftware();
        accesSoftware1();
        addToCartSoftware1();
    }

    public void addSoftware2ToCart() {
        pathToSoftware();
        accesSoftware2();
        addToCartSoftware2();
        accesCartMenu();
    }

    public void addDesktop1ToWishlist(String procesor, String ram) throws InterruptedException {
        loginSite();
        pathToDesktops();
        accesDesktop1();
        selectProcessorDesktop1(procesor);
        selectRamDesktop1(ram);
        clickHddDesktop1();
        clickOsDesktop1();
        clickAcrobatReaderDesktop1();
        clickTotalCommanderDesktop1();
        addToWishlistDesktop1();
        waitForElementDesktop1();
    }

    public void addDesktop2ToWishlist() {
        pathToDesktops();
        accesDesktop2();
        addToWishlistDesktop2();
    }

    public void addDesktop3ToWishlist() {
        pathToDesktops();
        accesDesktop3();
        addToWishlistDesktop3();
    }

    public void addNotebook1ToWishlist() {
        pathToNotebooks();
        accesNotebook1();
        addToWishlistNotebook1();
    }

    public void addNotebook2ToWishlist() {
        pathToNotebooks();
        accesNotebook2();
        addToWishlistNotebook2();
    }

    public void addNotebook3ToWishlist() {
        pathToNotebooks();
        accesNotebook3();
        addToWishlistNotebook3();
    }

    public void addNotebook4ToWishlist() {
        pathToNotebooks();
        accesNotebook4();
        addToWishlistNotebook4();
    }

    public void addNotebook5ToWishlist() {
        pathToNotebooks();
        accesNotebook5();
        addToWishlistNotebook5();
    }

    public void addNotebook6ToWishlist() {
        pathToNotebooks();
        accesNotebook6();
        addToWishlistNotebook6();
    }

    public void addSoftware1ToWishlist() {
        pathToSoftware();
        accesSoftware1();
        addToWishlistSoftware1();
    }

    public void addSoftware2ToWishlist() {
        pathToSoftware();
        accesSoftware2();
        addToWishlistSoftware2();
        accesWishlistMenu();
    }

    public void pathToDesktops() {
        elementMethods.hoverElement(computersMenu);
        elementMethods.hoverElement(desktopsMenu);
        elementMethods.clickElement(desktopsMenu);
    }

    public void pathToNotebooks() {
        elementMethods.hoverElement(computersMenu);
        elementMethods.hoverElement(notebooksMenu);
        elementMethods.clickElement(notebooksMenu);
    }

    public void pathToSoftware() {
        elementMethods.hoverElement(computersMenu);
        elementMethods.hoverElement(softwareMenu);
        elementMethods.clickElement(softwareMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesDesktop1() {
        elementMethods.clickElement(desktop1);
    }

    public void selectProcessorDesktop1(String value) {
        elementMethods.selectTextElement(selectProcessor, value);
    }

    public void selectRamDesktop1(String value) {
        elementMethods.selectTextElement(selectRam, value);
    }

    public void clickHddDesktop1() {
        elementMethods.clickElement(selectHdd);
    }

    public void clickOsDesktop1() {
        elementMethods.clickElement(selectOs);
    }

    public void clickAcrobatReaderDesktop1() {
        elementMethods.clickElement(selectAcrobatReader);
    }

    public void clickTotalCommanderDesktop1() {
        elementMethods.clickElement(selectTotalCommander);
    }

    public void addToCartDesktop1() {
        elementMethods.clickElement(addToCartDesktop1Button);
    }

    public void addToWishlistDesktop1() {
        elementMethods.clickElement(addToWishlistDesktop1Button);
    }

    public void waitForElementDesktop1() throws InterruptedException {
        Thread.sleep(700);
    }

    public void accesDesktop2() {
        elementMethods.clickElement(desktop2);
    }

    public void addToCartDesktop2() {
        elementMethods.clickElement(addToCartDesktop2Button);
    }

    public void addToWishlistDesktop2() {
        elementMethods.clickElement(addToWishlistDesktop2Button);
    }

    public void accesDesktop3() {
        elementMethods.clickElement(desktop3);
    }

    public void addToCartDesktop3() {
        elementMethods.clickElement(addToCartDesktop3Button);
    }

    public void addToWishlistDesktop3() {
        elementMethods.clickElement(addToWishlistDesktop3Button);
    }

    public void accesNotebook1() {
        elementMethods.clickElement(notebook1);
    }

    public void addToCartNotebook1() {
        elementMethods.clickElement(addToCartNotebook1Button);
    }

    public void addToWishlistNotebook1() {
        elementMethods.clickElement(addToWishlistNotebook1Button);
    }

    public void accesNotebook2() {
        elementMethods.clickElement(notebook2);
    }

    public void addToCartNotebook2() {
        elementMethods.clickElement(addToCartNotebook2Button);
    }

    public void addToWishlistNotebook2() {
        elementMethods.clickElement(addToWishlistNotebook2Button);
    }

    public void accesNotebook3() {
        elementMethods.clickElement(notebook3);
    }

    public void addToCartNotebook3() {
        elementMethods.clickElement(addToCartNotebook3Button);
    }

    public void addToWishlistNotebook3() {
        elementMethods.clickElement(addToWishlistNotebook3Button);
    }

    public void accesNotebook4() {
        elementMethods.clickElement(notebook4);
    }

    public void addToCartNotebook4() {
        elementMethods.clickElement(addToCartNotebook4Button);
    }

    public void addToWishlistNotebook4() {
        elementMethods.clickElement(addToWishlistNotebook4Button);
    }

    public void accesNotebook5() {
        elementMethods.clickElement(notebook5);
    }

    public void addToCartNotebook5() {
        elementMethods.clickElement(addToCartNotebook5Button);
    }

    public void addToWishlistNotebook5() {
        elementMethods.clickElement(addToWishlistNotebook5Button);
    }

    public void accesNotebook6() {
        elementMethods.clickElement(notebook6);
    }

    public void addToCartNotebook6() {
        elementMethods.clickElement(addToCartNotebook6Button);
    }

    public void addToWishlistNotebook6() {
        elementMethods.clickElement(addToWishlistNotebook6Button);
    }

    public void accesSoftware1() {
        elementMethods.clickElement(software1);
    }

    public void addToCartSoftware1() {
        elementMethods.clickElement(addToCartSoftware1Button);
    }

    public void addToWishlistSoftware1() {
        elementMethods.clickElement(addToWishlistSoftware1Button);
    }

    public void accesSoftware2() {
        elementMethods.clickElement(software2);
    }

    public void addToCartSoftware2() {
        elementMethods.clickElement(addToCartSoftware2Button);
    }

    public void addToWishlistSoftware2() {
        elementMethods.clickElement(addToWishlistSoftware2Button);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }

    public void accesWishlistMenu() {
        elementMethods.clickElement(wishlistMenu);
    }
}