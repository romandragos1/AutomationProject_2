package Tests;

import BaseTest.BaseTest;
import Pages.ContactUsPage;
import org.junit.Test;

public class ContactUsTest extends BaseTest {

    @Test
    public void contactUsTest() {
        ContactUsPage contactUs = new ContactUsPage(Driver);
        contactUs.contactUsMessage("Acesta este mesajul pe care il trimit");
    }
}
