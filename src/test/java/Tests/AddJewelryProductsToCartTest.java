package Tests;

import BaseTest.BaseTest;
import Pages.AddJewelryProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddJewelryProductsToCartTest extends BaseTest {

    @Test
    public void addJewelryProductsToCartTest() {
        AddJewelryProductsToCartOrWishlistPage addJewelryProductsToCart = new AddJewelryProductsToCartOrWishlistPage(Driver);
        addJewelryProductsToCart.addJewelry1ToCart("4/2/2023", "4/8/2023");
        addJewelryProductsToCart.addJewelry2ToCart();
        addJewelryProductsToCart.addJewelry3ToCart();
    }
}
