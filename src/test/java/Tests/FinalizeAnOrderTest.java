package Tests;

import BaseTest.BaseTest;
import Pages.FinalizeAnOrderPage;
import org.junit.Test;

public class FinalizeAnOrderTest extends BaseTest {

    @Test
    public void finalizeOrderTest() {
        FinalizeAnOrderPage finalizeOrder = new FinalizeAnOrderPage(Driver);
        finalizeOrder.accessProductForFinalizeOrder();   // In acest test este selectat un laptop;
        finalizeOrder.finalizeOrder();    // Pentru orice alt produs schimbam locatorul produsului si metoda de accesare;
    }
}
