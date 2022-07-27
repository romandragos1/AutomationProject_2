package Tests;

import BaseTest.BaseTest;
import Pages.AddDigitalDownloadProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddDigitalDownloadProductsToWishlistTest extends BaseTest {

    @Test
    public void addDigitalDownloadToWishlistTest() {
        AddDigitalDownloadProductsToCartOrWishlistPage addDigitalDownloadToWishlist = new AddDigitalDownloadProductsToCartOrWishlistPage(Driver);
        addDigitalDownloadToWishlist.addDigitalDownload1ToWishlist();
        addDigitalDownloadToWishlist.addDigitalDownload2ToWishlist();
        addDigitalDownloadToWishlist.addDigitalDownload3ToWishlist();
    }
}
