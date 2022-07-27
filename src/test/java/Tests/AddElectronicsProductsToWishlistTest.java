package Tests;

import BaseTest.BaseTest;
import Pages.AddElectronicsProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddElectronicsProductsToWishlistTest extends BaseTest {

    @Test
    public void addElectronicsToWishlistTest() throws InterruptedException {
        AddElectronicsProductsToCartOrWishlistPage addElectronicsToWishlist = new AddElectronicsProductsToCartOrWishlistPage(Driver);
        addElectronicsToWishlist.addcameraFoto1ToWishlist();
        addElectronicsToWishlist.addcameraFoto2ToWishlist();
        addElectronicsToWishlist.addCellPhone1ToWishlist();
        addElectronicsToWishlist.addCellPhone2ToWishlist();
        addElectronicsToWishlist.addCellPhone3ToWishlist();
        addElectronicsToWishlist.addSpeaker1ToWishlist();
        addElectronicsToWishlist.addSpeaker2ToWishlist();
        addElectronicsToWishlist.addTabletCoverToWishlist();
    }
}
