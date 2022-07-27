package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressToAccountPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddAddressToAccountPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-account']")
    private WebElement myAccountButtonFromHomepage;

    @FindBy(xpath = "//a[@href='/customer/addresses']")
    private WebElement addressesElement;

    @FindBy(xpath = "//button[@class='button-1 add-address-button']")
    private WebElement addNewAddressElement;

    @FindBy(id = "Address_FirstName")
    private WebElement firstnameAddressElement;

    @FindBy(id = "Address_LastName")
    private WebElement lastnameAddressElement;

    @FindBy(id = "Address_Email")
    private WebElement emailAddressElement;

    @FindBy(id = "Address_Company")
    private WebElement companyAddressElement;

    @FindBy(id = "Address_CountryId")
    private WebElement countryAddressElement;

    @FindBy(id = "Address_City")
    private WebElement cityAddressElement;

    @FindBy(id = "Address_Address1")
    private WebElement address1AddressElement;

    @FindBy(id = "Address_Address2")
    private WebElement address2AddressElement;

    @FindBy(id = "Address_ZipPostalCode")
    private WebElement zipPostalCodeAddressElement;

    @FindBy(id = "Address_PhoneNumber")
    private WebElement phoneNumberAddressElement;

    @FindBy(id = "Address_FaxNumber")
    private WebElement faxNumberAddressElement;

    @FindBy(xpath = "//button[@class='button-1 save-address-button']")
    private WebElement saveAddressElement;

    public void addAddress_nopCommerce(String firstname, String lastname, String email, String company, String country,
                                       String city, String address1, String address2, String zipPostalCode,
                                       String phoneNumber, String faxNumber) {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
        clickMyAccountButtonFromHomepage();
        clickAddresses();
        clickAddNewAddress();
        fillFirstnameAddressElement(firstname);
        fillLastnameAddressElement(lastname);
        fillEmailElement(email);
        fillCompanyElement(company);
        selectCountryElement(country);
        fillCityElement(city);
        fillAddress1Element(address1);
        fillAddress2Element(address2);
        fillZippPostalCodeElement(zipPostalCode);
        fillPhoneNumberElement(phoneNumber);
        fillFaxNumberElement(faxNumber);
        clickSaveAddressElement();
    }

    public void clickMyAccountButtonFromHomepage() {
        elementMethods.clickElement(myAccountButtonFromHomepage);
    }

    public void clickAddresses() {
        elementMethods.clickElement(addressesElement);
    }

    public void clickAddNewAddress() {
        elementMethods.clickElement(addNewAddressElement);
    }

    public void fillFirstnameAddressElement(String value) {
        elementMethods.fillElement(firstnameAddressElement, value);
    }

    public void fillLastnameAddressElement(String value) {
        elementMethods.fillElement(lastnameAddressElement, value);
    }

    public void fillEmailElement(String value) {
        elementMethods.fillElement(emailAddressElement, value);
    }

    public void fillCompanyElement(String value) {
        elementMethods.fillElement(companyAddressElement, value);
    }

    public void selectCountryElement(String value) {
        elementMethods.selectTextElement(countryAddressElement, value);
    }

    public void fillCityElement(String value) {
        elementMethods.fillElement(cityAddressElement, value);
    }

    public void fillAddress1Element(String value) {
        elementMethods.fillElement(address1AddressElement, value);
    }

    public void fillAddress2Element(String value) {
        elementMethods.fillElement(address2AddressElement, value);
    }

    public void fillZippPostalCodeElement(String value) {
        elementMethods.fillElement(zipPostalCodeAddressElement, value);
    }

    public void fillPhoneNumberElement(String value) {
        elementMethods.fillElement(phoneNumberAddressElement, value);
    }

    public void fillFaxNumberElement(String value) {
        elementMethods.fillElement(faxNumberAddressElement, value);
    }

    public void clickSaveAddressElement() {
        elementMethods.clickElement(saveAddressElement);
    }
}