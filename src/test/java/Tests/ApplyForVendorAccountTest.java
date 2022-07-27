package Tests;

import BaseTest.BaseTest;
import Pages.ApplyForVendorAccountPage;
import org.junit.Test;

public class ApplyForVendorAccountTest extends BaseTest {

    @Test
    public void applyForVendorAccountTest() {
        ApplyForVendorAccountPage applyForVendorAccount = new ApplyForVendorAccountPage(Driver);
        applyForVendorAccount.applyForVendorAccount("SC DRAGOS ROMAN SRL",
                "As dori sa aplic pentru o colaborare vendor",
                "C:\\Users\\roman\\Pictures\\automation_picture.JPG");
    }
}
