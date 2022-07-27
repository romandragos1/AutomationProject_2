package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/contactus']")
    private WebElement contactUsButton;

    @FindBy(id = "Enquiry")
    private WebElement messageField;

    @FindBy(name = "send-email")
    private WebElement submitMessageButton;

    public void contactUsMessage(String messageDescription) {
        loginSite();
        accesContactUsButton();
        enterMessage(messageDescription);
        accesSendMessageButton();
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesContactUsButton() {
        elementMethods.clickElement(contactUsButton);
    }

    public void enterMessage(String value) {
        elementMethods.fillElement(messageField, value);
    }

    public void accesSendMessageButton() {
        elementMethods.clickElement(submitMessageButton);
    }
}
