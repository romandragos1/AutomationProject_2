package Tests;

import BaseTest.BaseTest;
import Pages.AddComputersProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddComputersProductsToWishlistTest extends BaseTest {

    @Test
    public void addComputersToWishlistTest() throws InterruptedException {
        AddComputersProductsToCartOrWishlistPage addComputersToWishlist = new AddComputersProductsToCartOrWishlistPage(Driver);
        addComputersToWishlist.addDesktop1ToWishlist("2.5 GHz Intel" +
                " Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]");
        addComputersToWishlist.addDesktop2ToWishlist();
        addComputersToWishlist.addDesktop3ToWishlist();
        addComputersToWishlist.addNotebook1ToWishlist();
        addComputersToWishlist.addNotebook2ToWishlist();
        addComputersToWishlist.addNotebook3ToWishlist();
        addComputersToWishlist.addNotebook4ToWishlist();
        addComputersToWishlist.addNotebook5ToWishlist();
        addComputersToWishlist.addNotebook6ToWishlist();
        addComputersToWishlist.addSoftware1ToWishlist();
        addComputersToWishlist.addSoftware2ToWishlist();
    }
}
