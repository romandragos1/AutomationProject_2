package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailProductToFriendPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public EmailProductToFriendPage(WebDriver driver) {
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

    @FindBy(xpath = "//button[@onclick='setLocation(\"/productemailafriend/5\")']")
    private WebElement emailFriendButton;

    @FindBy(id = "FriendEmail")
    private WebElement friendEmail;

    @FindBy(id = "PersonalMessage")
    private WebElement friendMessage;

    @FindBy(name = "send-email")
    private WebElement sendFriendMessageButton;

    public void emailProductToFriend(String friendEmail, String friendMessage) {
        loginSite();
        pathToNotebooks();
        accesNotebook3();
        addFriendEmail(friendEmail);
        addFriendMessage(friendMessage);
        sendEmail();
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
        pathToNotebooks();
        elementMethods.clickElement(notebook3);
        elementMethods.clickElement(emailFriendButton);
    }

    public void addFriendEmail(String value) {
        elementMethods.fillElement(friendEmail, value);
    }

    public void addFriendMessage(String value) {
        elementMethods.fillElement(friendMessage, value);
    }

    public void sendEmail() {
        elementMethods.clickElement(sendFriendMessageButton);
    }
}
