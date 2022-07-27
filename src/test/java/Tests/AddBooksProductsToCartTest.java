package Tests;

import BaseTest.BaseTest;
import Pages.AddBooksProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddBooksProductsToCartTest extends BaseTest {

    @Test
    public void addBooksProductsToCartTest() {
        AddBooksProductsToCartOrWishlistPage addBooksProductsToCart = new AddBooksProductsToCartOrWishlistPage(Driver);
        addBooksProductsToCart.addBook1ToCart();
        addBooksProductsToCart.addBook2ToCart();
        addBooksProductsToCart.addBook3ToCart();
    }
}
