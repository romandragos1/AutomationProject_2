package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalizeAnOrderPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public FinalizeAnOrderPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Computers ']")
    private WebElement computersMenu;

    @FindBy(xpath = "//a[text()='Notebooks ']")
    private WebElement notebooksMenu;

    @FindBy(xpath = "//a[text()='Asus N551JK-XO076H Laptop']")
    private WebElement notebook3;

    @FindBy(id = "add-to-cart-button-5")
    private WebElement addToCartNotebook3;

    @FindBy(xpath = "//a[@class='ico-cart']")
    private WebElement cartMenu;

    @FindBy(id = "checkout_attribute_1")
    private WebElement giftWrappingOption;

    @FindBy(id = "termsofservice")
    private WebElement agreeTermsCheckbox;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    private WebElement shipToTheSameAddressContinue;

    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    private WebElement shippingByLandContinue;

    @FindBy(id = "paymentmethod_1")
    private WebElement selectCreditCardPayment;

    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    private WebElement selectCreditCardPaymentContinue;

    @FindBy(id = "CreditCardType")
    private WebElement selectCreditCardType;

    @FindBy(id = "CardholderName")
    private WebElement insertCreditCardholderName;

    @FindBy(id = "CardNumber")
    private WebElement insertCreditCardNumber;

    @FindBy(id = "ExpireMonth")
    private WebElement selectCreditCardExpireMonth;

    @FindBy(id = "ExpireYear")
    private WebElement selectCreditCardExpireYear;

    @FindBy(id = "CardCode")
    private WebElement insertCreditCardCardCode;

    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    private WebElement insertCreditCardInformationContinue;

    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    private WebElement confirmOrder;

    @FindBy(xpath = "//a[text()='Click here for order details.']")
    private WebElement orderDetails;

    public void finalizeOrder() {
        giftWrapping();
        agreeTerms();
        checkoutCart();
        shipToTheSameAddress();
        shippingByLand();
        selectCreditCardPayment();
        insertPaymentDetails();
        confirmOrder();
        orderDetails();
    }

    public void accessProductForFinalizeOrder() {
        loginSite();
        pathToNotebooks();
        accesNotebook3();
        addNotebook3ToCart();
        accesCartMenu();
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void pathToNotebooks() {
        elementMethods.hoverElement(computersMenu);
        elementMethods.hoverElement(notebooksMenu);
        elementMethods.clickElement(notebooksMenu);
    }

    public void accesNotebook3() {
        elementMethods.clickElement(notebook3);
    }

    public void addNotebook3ToCart() {
        elementMethods.clickElement(addToCartNotebook3);
    }

    public void giftWrapping() {
        elementMethods.selectTextElement(giftWrappingOption, "Yes [+$10.00]");
    }

    public void agreeTerms() {
        elementMethods.clickElement(agreeTermsCheckbox);
    }

    public void checkoutCart() {
        elementMethods.clickElement(checkoutButton);
    }

    public void shipToTheSameAddress() {
        elementMethods.clickElement(shipToTheSameAddressContinue);
    }

    public void shippingByLand() {
        elementMethods.clickElement(shippingByLandContinue);
    }

    public void selectCreditCardPayment() {
        elementMethods.clickElement(selectCreditCardPayment);
        elementMethods.clickElement(selectCreditCardPaymentContinue);
    }

    public void insertPaymentDetails() {
        elementMethods.selectTextElement(selectCreditCardType, "Master card");
        elementMethods.fillElement(insertCreditCardholderName, "Dragos Roman");
        elementMethods.fillElement(insertCreditCardNumber, "5105105105105100");
        elementMethods.selectTextElement(selectCreditCardExpireMonth, "05");
        elementMethods.selectTextElement(selectCreditCardExpireYear, "2027");
        elementMethods.fillElement(insertCreditCardCardCode, "844");
        elementMethods.clickElement(insertCreditCardInformationContinue);
    }

    public void accesCartMenu() {
        elementMethods.clickElement(cartMenu);
    }

    public void confirmOrder() {
        elementMethods.clickElement(confirmOrder);
    }

    public void orderDetails() {
        elementMethods.clickElement(orderDetails);
    }
}