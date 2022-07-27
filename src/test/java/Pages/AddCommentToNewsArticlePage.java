package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCommentToNewsArticlePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddCommentToNewsArticlePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/news']")
    private WebElement newsMenu;

    @FindBy(xpath = "//a[@href='/new-online-store-is-open']")
    private WebElement newsArticle1;

    @FindBy(id = "AddNewComment_CommentTitle")
    private WebElement addNewCommentTitleArticle1;

    @FindBy(id = "AddNewComment_CommentText")
    private WebElement addNewCommentBoxArticle1;

    @FindBy(xpath = "//button[@class='button-1 news-item-add-comment-button']")
    private WebElement addCommentArticle1Button;

    public void addCommentToNewsArticle(String newTitleComment, String newCommentArticle1) {
        loginSite();
        accesNewsMenu();
        addNewCommentTitleArticle1(newTitleComment);
        addNewCommentArticle1(newCommentArticle1);
        accesCommentArticle1Button();
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesNewsMenu() {
        elementMethods.clickElement(newsMenu);
        elementMethods.clickElement(newsArticle1);
    }

    public void addNewCommentTitleArticle1(String value) {
        elementMethods.fillElement(addNewCommentTitleArticle1, value);
    }

    public void addNewCommentArticle1(String value) {
        elementMethods.fillElement(addNewCommentBoxArticle1, value);
    }

    public void accesCommentArticle1Button() {
        elementMethods.clickElement(addCommentArticle1Button);
    }
}
