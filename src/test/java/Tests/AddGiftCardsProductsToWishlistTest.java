package Tests;

import BaseTest.BaseTest;
import Pages.AddGiftCardsProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddGiftCardsProductsToWishlistTest extends BaseTest {

    @Test
    public void addGiftCardsToWishlistTest() {
        AddGiftCardsProductsToCartOrWishlistPage addGiftCardsToWishlist = new AddGiftCardsProductsToCartOrWishlistPage(Driver);
        addGiftCardsToWishlist.addGiftCard1ToWishlist("Florina", "florina.roman@gmail.com");
        addGiftCardsToWishlist.addGiftCard2ToWishlist("Florina");
        addGiftCardsToWishlist.addGiftCard3ToWishlist("Florina");
    }
}
