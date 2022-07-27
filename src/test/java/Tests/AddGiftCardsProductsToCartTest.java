package Tests;

import BaseTest.BaseTest;
import Pages.AddGiftCardsProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddGiftCardsProductsToCartTest extends BaseTest {

    @Test
    public void addGiftCardsProductsToCartTest() {
        AddGiftCardsProductsToCartOrWishlistPage addGiftCardsProductsToCart = new AddGiftCardsProductsToCartOrWishlistPage(Driver);
        addGiftCardsProductsToCart.addGiftCard1ToCart("Florina Roman",
                "florina.roman@gmail.com",
                "Acesta este un Gift Card de 25$. Multumesc.");
        addGiftCardsProductsToCart.addGiftCard2ToCart("Florina Roman",
                "Acesta este un Gift Card de 50$. Multumesc.");
        addGiftCardsProductsToCart.addGiftCard3ToCart("Florina Roman",
                "Acesta este un Gift Card de 100$. Multumesc.");
    }
}
