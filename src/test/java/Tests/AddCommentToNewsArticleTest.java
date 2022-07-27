package Tests;

import BaseTest.BaseTest;
import Pages.AddCommentToNewsArticlePage;
import org.junit.Test;

public class AddCommentToNewsArticleTest extends BaseTest {

    @Test
    public void addCommentToNewsArticleTest() {
        AddCommentToNewsArticlePage addCommentToNewsArticle = new AddCommentToNewsArticlePage(Driver);
        addCommentToNewsArticle.addCommentToNewsArticle("Acesta este titlul comentariului",
                "Un articol foarte interesant");
    }
}
