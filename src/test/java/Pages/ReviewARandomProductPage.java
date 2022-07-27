package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewARandomProductPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public ReviewARandomProductPage(WebDriver driver) {
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

    @FindBy(xpath = "//a[text()='Add your review']")
    private WebElement reviewProductButton;

    @FindBy(id = "AddProductReview_Title")
    private WebElement reviewTitle;

    @FindBy(id = "AddProductReview_ReviewText")
    private WebElement reviewText;

    @FindBy(id = "addproductrating_1")
    private WebElement addRating1Star;

    @FindBy(id = "addproductrating_2")
    private WebElement addRating2Star;

    @FindBy(id = "addproductrating_3")
    private WebElement addRating3Star;

    @FindBy(id = "addproductrating_4")
    private WebElement addRating4Star;

    @FindBy(id = "addproductrating_5")
    private WebElement addRating5Star;

    @FindBy(name = "add-review")
    private WebElement submitReviewButton;

    public void addReview1Star() {
        review1Title();
        review1Text();
        add1Star();
        submitReviewButton();
    }

    public void addReview2Star() {
        accessProductForAnotherReview();
        review2Title();
        review2Text();
        add2Star();
        submitReviewButton();
    }

    public void addReview3Star() {
        accessProductForAnotherReview();
        review3Title();
        review3Text();
        add3Star();
        submitReviewButton();
    }

    public void addReview4Star() {
        accessProductForAnotherReview();
        review4Title();
        review4Text();
        add4Star();
        submitReviewButton();
    }

    public void addReview5Star() {
        accessProductForAnotherReview();
        review5Title();
        review5Text();
        add5Star();
        submitReviewButton();
    }

    public void accessProductForReview() {
        loginSite();
        pathToNotebooks();
        accesNotebook3();
        addReviewButton();
    }

    public void accessProductForAnotherReview() {
        driver.get("https://demo.nopcommerce.com/");
        pathToNotebooks();
        accesNotebook3();
        addReviewButton();
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

    public void review1Title() {
        elementMethods.fillElement(reviewTitle, "Foarte dezamagit");
    }

    public void review2Title() {
        elementMethods.fillElement(reviewTitle, "Dezamagit");
    }

    public void review3Title() {
        elementMethods.fillElement(reviewTitle, "Multumit");
    }

    public void review4Title() {
        elementMethods.fillElement(reviewTitle, "Foarte multumit");
    }

    public void review5Title() {
        elementMethods.fillElement(reviewTitle, "Excelent");
    }

    public void review1Text() {
        elementMethods.fillElement(reviewText, "Un produs de foarte proasta calitate");
    }

    public void review2Text() {
        elementMethods.fillElement(reviewText, "Un produs dezamagitor");
    }

    public void review3Text() {
        elementMethods.fillElement(reviewText, "Un produs multumitor");
    }

    public void review4Text() {
        elementMethods.fillElement(reviewText, "Un produs foarte multumitor");
    }

    public void review5Text() {
        elementMethods.fillElement(reviewText, "Un produs excelent");
    }

    public void addReviewButton() {
        elementMethods.clickElement(reviewProductButton);
    }

    public void add1Star() {
        elementMethods.clickElement(addRating1Star);
    }

    public void add2Star() {
        elementMethods.clickElement(addRating2Star);
    }

    public void add3Star() {
        elementMethods.clickElement(addRating3Star);
    }

    public void add4Star() {
        elementMethods.clickElement(addRating4Star);
    }

    public void add5Star() {
        elementMethods.clickElement(addRating5Star);
    }

    public void submitReviewButton() {
        elementMethods.clickElement(submitReviewButton);
    }
}