package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCommentToBlogArticlePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddCommentToBlogArticlePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/blog']")
    private WebElement blogMenu;

    @FindBy(xpath = "//a[@href='/why-your-online-store-needs-a-wish-list']")
    private WebElement blogArticle1;

    @FindBy(id = "AddNewComment_CommentText")
    private WebElement addNewCommentBoxArticle1;

    @FindBy(xpath = "//button[@class='button-1 blog-post-add-comment-button']")
    private WebElement addCommentArticle1Button;

    public void addCommentToBlogArticle(String newComment) {
        loginSite();
        accesBlogMenu();
        addNewCommentArticle1(newComment);
        accesCommentArticle1Button();
    }

    public void loginSite() {
        LoginPage login = new LoginPage(driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }

    public void accesBlogMenu() {
        elementMethods.clickElement(blogMenu);
        elementMethods.clickElement(blogArticle1);
    }

    public void addNewCommentArticle1(String value) {
        elementMethods.fillElement(addNewCommentBoxArticle1, value);
    }

    public void accesCommentArticle1Button() {
        elementMethods.clickElement(addCommentArticle1Button);
    }
}
