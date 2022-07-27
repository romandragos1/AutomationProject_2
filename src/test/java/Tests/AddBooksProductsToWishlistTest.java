package Tests;

import BaseTest.BaseTest;
import Pages.AddBooksProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddBooksProductsToWishlistTest extends BaseTest {

    @Test
    public void addBooksToWishlistTest() {
        AddBooksProductsToCartOrWishlistPage addBooksToWishlist = new AddBooksProductsToCartOrWishlistPage(Driver);
        addBooksToWishlist.addBook1ToWishlist();
        addBooksToWishlist.addBook2ToWishlist();
        addBooksToWishlist.addBook3ToWishlist();
    }
}
