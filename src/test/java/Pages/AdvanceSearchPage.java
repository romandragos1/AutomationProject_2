package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvanceSearchPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AdvanceSearchPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/search']")
    private WebElement searchButton;

    @FindBy(id = "q")
    private WebElement searchKeyword;

    @FindBy(id = "advs")
    private WebElement selectAdvanceSearch;

    @FindBy(id = "cid")
    private WebElement categoryField;

    @FindBy(id = "isc")
    private WebElement selectAutomaticallySearchSubcategories;

    @FindBy(id = "mid")
    private WebElement categoryManufacturer;

    @FindBy(id = "sid")
    private WebElement selectSearchInProductDescriptions;

    @FindBy(xpath = "//button[@class='button-1 search-button']")
    private WebElement selectSearchButton;

    public void advanceSearchOnPage(String searckKeyword, String category, String manufacturer) {
        advanceSearchButton();
        searchKeyword(searckKeyword);
        selectAdvanceSearch();
        selectCategory(category);
        selectAutomaticallySearchSubcategories();
        selectManufacturer(manufacturer);
        selectSearchInProductDescriptions();
        selectSearchButton();
    }

    public void advanceSearchButton() {
        elementMethods.clickElement(searchButton);
    }

    public void searchKeyword(String value) {
        elementMethods.fillElement(searchKeyword, value);
    }

    public void selectAdvanceSearch() {
        elementMethods.clickElement(selectAdvanceSearch);
    }

    public void selectCategory(String value) {
        elementMethods.selectTextElement(categoryField, value);
    }

    public void selectAutomaticallySearchSubcategories() {
        elementMethods.clickElement(selectAutomaticallySearchSubcategories);
    }

    public void selectManufacturer(String value) {
        elementMethods.selectTextElement(categoryManufacturer, value);
    }

    public void selectSearchInProductDescriptions() {
        elementMethods.clickElement(selectSearchInProductDescriptions);
    }

    public void selectSearchButton() {
        elementMethods.clickElement(selectSearchButton);
    }
}
