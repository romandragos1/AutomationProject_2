package Tests;

import BaseTest.BaseTest;
import Pages.AddDigitalDownloadProductsToCartOrWishlistPage;
import org.junit.Test;

public class AddDigitalDownloadProductsToCartTest extends BaseTest {

    @Test
    public void addDigitalDownloadProductsToCartTest() {
        AddDigitalDownloadProductsToCartOrWishlistPage addDigitalDownloadProductsToCart = new AddDigitalDownloadProductsToCartOrWishlistPage(Driver);
        addDigitalDownloadProductsToCart.addDigitalDownload1ToCart();
        addDigitalDownloadProductsToCart.addDigitalDownload2ToCart();
        addDigitalDownloadProductsToCart.addDigitalDownload3ToCart();
    }
}
