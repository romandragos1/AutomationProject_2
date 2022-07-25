package Tests;

import BaseTest.BaseTest;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(Driver);
        login.login_nopCommerce("roman.dragos@yahoo.com", "password12345");
    }
}