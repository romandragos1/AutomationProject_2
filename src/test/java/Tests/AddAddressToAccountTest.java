package Tests;

import BaseTest.BaseTest;
import Pages.AddAddressToAccountPage;
import org.junit.Test;

public class AddAddressToAccountTest extends BaseTest {

    @Test
    public void addAddressTest() {
        AddAddressToAccountPage addAddress = new AddAddressToAccountPage(Driver);
        addAddress.addAddress_nopCommerce("Dragos", "Roman", "roman.dragos@yahoo.com",
                "SC DRAGOS ROMAN SRL", "Romania", "Cluj-Napoca", "Str. Eugen Ionesco, Nr. 67",
                "Nu este cazul", "400496", "0748880148", "Nu este cazul");
    }
}
