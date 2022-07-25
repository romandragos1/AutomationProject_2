package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    private WebElement registerButtonFromHomepage;

    @FindBy(id = "gender-male")
    private WebElement genderElement;

    @FindBy(id = "FirstName")
    private WebElement firstnameElement;

    @FindBy(id = "LastName")
    private WebElement lastnameElement;

    @FindBy(name = "DateOfBirthDay")
    private WebElement dayOfBirthElement;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement monthOfBirthElement;

    @FindBy(name = "DateOfBirthYear")
    private WebElement yearOfBirthElement;

    @FindBy(id = "Email")
    private WebElement emailElement;

    @FindBy(id = "Company")
    private WebElement companyElement;

    @FindBy(id = "Newsletter")
    private WebElement newsletterElement;

    @FindBy(id = "Password")
    private WebElement passwordElement;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordElement;

    @FindBy(id = "register-button")
    private WebElement submitElement;

    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    private WebElement continueElement;

    public void register_nopCommerce(String firstname, String lastname, String email, String dayOfBirth, String monthOfBirth,
                                     String yearOfBirth, String company, String password, String confirmPassword) {
        clickRegisterButtonFromHomepage();
        clickGenderElement();
        fillFirstNameElement(firstname);
        fillLastNameElement(lastname);
        selectDayOfBirth(dayOfBirth);
        selectMonthOfBirth(monthOfBirth);
        selectYearOfBirth(yearOfBirth);
        fillEmailElement(email);
        fillCompanyElement(company);
        clickNewsletterElement();
        fillPasswordElement(password);
        fillConfirmPasswordElement(password);
        clickSubmitElement();
        clickContinueElement();
    }

    public void clickRegisterButtonFromHomepage() {
        elementMethods.clickElement(registerButtonFromHomepage);
    }

    public void clickGenderElement() {
        elementMethods.clickElement(genderElement);
    }

    public void fillFirstNameElement(String value) {
        elementMethods.fillElement(firstnameElement, value);
    }

    public void fillLastNameElement(String value) {
        elementMethods.fillElement(lastnameElement, value);
    }

    public void selectDayOfBirth(String value) {
        elementMethods.selectTextElement(dayOfBirthElement, value);
    }

    public void selectMonthOfBirth(String value) {
        elementMethods.selectTextElement(monthOfBirthElement, value);
    }

    public void selectYearOfBirth(String value) {
        elementMethods.selectTextElement(yearOfBirthElement, value);
    }

    public void fillEmailElement(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillCompanyElement(String value) {
        elementMethods.fillElement(companyElement, value);
    }

    public void clickNewsletterElement() {
        elementMethods.clickElement(newsletterElement);
    }

    public void fillPasswordElement(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillConfirmPasswordElement(String value) {
        elementMethods.fillElement(confirmPasswordElement, value);
    }

    public void clickSubmitElement() {
        elementMethods.clickElement(submitElement);
    }

    public void clickContinueElement() {
        elementMethods.clickElement(continueElement);
    }
}
