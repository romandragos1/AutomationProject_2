package Tests;

import BaseTest.BaseTest;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() {
        RegisterPage register = new RegisterPage(Driver);
        register.register_nopCommerce("Dragos", "Roman", "roman.dragos@yahoo.com", "29",
                "April", "1987", "SC DRAGOS ROMAN SRL",
                "password12345", "password12345");
    }
}
