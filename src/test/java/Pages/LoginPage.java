package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement loginButtonFromHomepage;

    @FindBy(id = "Email")
    private WebElement emailElement;

    @FindBy(id = "Password")
    private WebElement passwordElement;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement submitButton;

    public void login_nopCommerce(String email, String password) {
        clickLoginButtonFromHomepage();
        fillEmailElement(email);
        fillPasswordElement(password);
        clickSubmitButton();
    }

    public void clickLoginButtonFromHomepage() {
        elementMethods.clickElement(loginButtonFromHomepage);
    }

    public void fillEmailElement(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillPasswordElement(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void clickSubmitButton() {
        elementMethods.clickElement(submitButton);
    }
}