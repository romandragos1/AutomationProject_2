package Tests;

import BaseTest.BaseTest;
import Pages.Compare2ProductsPage;
import org.junit.Test;

public class Compare2ProductsTest extends BaseTest {

    @Test
    public void compare2ProductsTest() throws InterruptedException {
        Compare2ProductsPage compare2Products = new Compare2ProductsPage(Driver);
        compare2Products.compareProducts();

        // In acest test sunt comparate 2 telefoane mobile;
        // Pentru a compara alte produse schimbam locatorii produselor si metodele de accesare;
    }
}
