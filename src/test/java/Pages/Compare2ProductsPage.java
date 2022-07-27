package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compare2ProductsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public Compare2ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Electronics ']")
    private WebElement electronicsMenu;

    @FindBy(xpath = "//a[text()='Cell phones ']")
    private WebElement cellPhonesMenu;

    @FindBy(xpath = "//a[text()='HTC One M8 Android L 5.0 Lollipop']")
    private WebElement cellPhone1;

    @FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/18\"),!1']")
    private WebElement addToCompareListCellPhone1Button;

    @FindBy(xpath = "//a[text()='HTC One Mini Blue']")
    private WebElement cellPhone2;

    @FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/19\"),!1']")
    private WebElement addToCompareListCellPhone2Button;

    @FindBy(xpath = "//a[@href='/compareproducts']")
    private WebElement compareProductsButton;

    public void compareProducts() throws InterruptedException {
        loginSite();
        addPhone1ToCompareList();
        addPhone2ToCompareList();
        Thread.sleep(300);
        accesCompareProductsList();
    }

    public void pathToCellPhones() {
        elementMethods.hoverElement(electronicsMenu);
        elementMethods.hoverElement(cellPhonesMenu);
        elementMethods.clickElement(cellPhonesMenu);
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void addPhone1ToCompareList() {
        pathToCellPhones();
        elementMethods.clickElement(cellPhone1);
        elementMethods.clickElement(addToCompareListCellPhone1Button);
    }

    public void addPhone2ToCompareList() {
        driver.get("https://demo.nopcommerce.com/");
        pathToCellPhones();
        elementMethods.clickElement(cellPhone2);
        elementMethods.clickElement(addToCompareListCellPhone2Button);
    }

    public void accesCompareProductsList() {
        elementMethods.clickElement(compareProductsButton);
    }
}