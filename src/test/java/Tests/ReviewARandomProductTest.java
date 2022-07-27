package Tests;

import BaseTest.BaseTest;
import Pages.ReviewARandomProductPage;
import org.junit.Test;

public class ReviewARandomProductTest extends BaseTest {

    @Test
    public void reviewProductTest() {
        ReviewARandomProductPage reviewProduct = new ReviewARandomProductPage(Driver);
        reviewProduct.accessProductForReview(); // In acest test este selectat un laptop;
        reviewProduct.addReview1Star();   // Pentru orice alt produs schimbam locatorul produsului si metoda de accesare;
        reviewProduct.addReview2Star();
        reviewProduct.addReview3Star();
        reviewProduct.addReview4Star();
        reviewProduct.addReview5Star();
    }
}
