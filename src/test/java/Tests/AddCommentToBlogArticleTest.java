package Tests;

import BaseTest.BaseTest;
import Pages.AddCommentToBlogArticlePage;
import org.junit.Test;

public class AddCommentToBlogArticleTest extends BaseTest {

    @Test
    public void addCommentToBlogArticleTest() {
        AddCommentToBlogArticlePage addCommentToBlogArticle = new AddCommentToBlogArticlePage(Driver);
        addCommentToBlogArticle.addCommentToBlogArticle("Un articol foarte interesant");
    }
}
