package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyForVendorAccountPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public ApplyForVendorAccountPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/vendor/apply']")
    private WebElement applyForVendorAccountButton;

    @FindBy(id = "Name")
    private WebElement vendorName;

    @FindBy(id = "Description")
    private WebElement messageDescription;

    @FindBy(name = "uploadedFile")
    private WebElement uploadedFile;

    @FindBy(id = "apply-vendor")
    private WebElement submitButton;

    public void applyForVendorAccount(String vendorName, String messageDescription, String fileDirectory) {
        loginSite();
        applyForVendorButton();
        enterVendorName(vendorName);
        entermessageDescription(messageDescription);
        uploadFileDirectory(fileDirectory);
        submit();
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void applyForVendorButton() {
        elementMethods.clickElement(applyForVendorAccountButton);
    }

    public void enterVendorName(String value) {
        elementMethods.fillElement(vendorName, value);
    }

    public void entermessageDescription(String value) {
        elementMethods.fillElement(messageDescription, value);
    }

    public void uploadFileDirectory(String value) {
        elementMethods.fillElement(uploadedFile, value);
    }

    public void submit() {
        elementMethods.clickElement(submitButton);
    }
}
