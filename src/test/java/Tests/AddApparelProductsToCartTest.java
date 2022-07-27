package Tests;

import BaseTest.BaseTest;
import Pages.AddApparelProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddApparelProductsToCartTest extends BaseTest {

    @Test
    public void addApparelProductsToCartTest() {
        AddApparelProductsToCartOrWishlistPage addApparelProductsToCart = new AddApparelProductsToCartOrWishlistPage(Driver);
        addApparelProductsToCart.addShoes1ToCart("10");
        addApparelProductsToCart.addShoes2ToCart("10", "White/Black");
        addApparelProductsToCart.addShoes3ToCart();
        addApparelProductsToCart.addClothing1ToCart("Acest text va fi imprimat pe tricou");
        addApparelProductsToCart.addClothing2ToCart();
        addApparelProductsToCart.addClothing3ToCart("4X");
        addApparelProductsToCart.addClothing4ToCart();
        addApparelProductsToCart.addAccessory1ToCart("Medium");
        addApparelProductsToCart.addAccessory2ToCart();
    }
}
