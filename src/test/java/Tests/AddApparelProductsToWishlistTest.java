package Tests;

import BaseTest.BaseTest;
import Pages.AddApparelProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddApparelProductsToWishlistTest extends BaseTest {

    @Test
    public void addApparelToWishlistTest() {
        AddApparelProductsToCartOrWishlistPage addApparelToWishlist = new AddApparelProductsToCartOrWishlistPage(Driver);
        addApparelToWishlist.addShoes1ToWishlist("10");
        addApparelToWishlist.addShoes2ToWishlist("10", "White/Black");
        addApparelToWishlist.addShoes3ToWishlist();
        addApparelToWishlist.addClothing1ToWishlist("Acest text va fi imprimat pe tricou");
        addApparelToWishlist.addClothing2ToWishlist();
        addApparelToWishlist.addClothing3ToWishlist("4X");
        addApparelToWishlist.addClothing4ToWishlist();
        addApparelToWishlist.addAccessory1ToWishlist("Medium");
        addApparelToWishlist.addAccessory2ToWishlist();
    }
}
