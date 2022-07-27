package Tests;

import BaseTest.BaseTest;
import Pages.AddElectronicsProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddElectronicsProductsToCartTest extends BaseTest {

    @Test
    public void addElectronicsProductsToCartTest() throws InterruptedException {
        AddElectronicsProductsToCartOrWishlistPage addElectronicsProductsToCart = new AddElectronicsProductsToCartOrWishlistPage(Driver);
        addElectronicsProductsToCart.addcameraFoto1ToCart();
        addElectronicsProductsToCart.addcameraFoto2ToCart();
        addElectronicsProductsToCart.addCellPhone1ToCart();
        addElectronicsProductsToCart.addCellPhone2ToCart();
        addElectronicsProductsToCart.addCellPhone3ToCart();
        addElectronicsProductsToCart.addSpeaker1ToCart();
        addElectronicsProductsToCart.addSpeaker2ToCart();
        addElectronicsProductsToCart.addTabletCoverToCart();
    }
}
