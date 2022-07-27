package Tests;

import BaseTest.BaseTest;
import Pages.AddJewelryProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddJewelryProductsToWishlistTest extends BaseTest {

    @Test
    public void addJewelryToWishlistTest() {
        AddJewelryProductsToCartOrWishlistPage addJewelryToWishlist = new AddJewelryProductsToCartOrWishlistPage(Driver);
        addJewelryToWishlist.addJewelry1ToWishlist("4/2/2023", "4/8/2023");
        addJewelryToWishlist.addJewelry2ToWishlist();
        addJewelryToWishlist.addJewelry3ToWishlist();
    }
}
