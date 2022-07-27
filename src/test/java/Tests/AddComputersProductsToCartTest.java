package Tests;

import BaseTest.BaseTest;
import Pages.AddComputersProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddComputersProductsToCartTest extends BaseTest {

    @Test
    public void addComputersProductsToCartTest() throws InterruptedException {
        AddComputersProductsToCartOrWishlistPage addComputersProductsToCart = new AddComputersProductsToCartOrWishlistPage(Driver);
        addComputersProductsToCart.addDesktop1ToCart("2.5 GHz Intel" +
                " Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]");
        addComputersProductsToCart.addDesktop2ToCart();
        addComputersProductsToCart.addDesktop3ToCart();
        addComputersProductsToCart.addNotebook1ToCart();
        addComputersProductsToCart.addNotebook2ToCart();
        addComputersProductsToCart.addNotebook3ToCart();
        addComputersProductsToCart.addNotebook4ToCart();
        addComputersProductsToCart.addNotebook5ToCart();
        addComputersProductsToCart.addNotebook6ToCart();
        addComputersProductsToCart.addSoftware1ToCart();
        addComputersProductsToCart.addSoftware2ToCart();
    }
}
