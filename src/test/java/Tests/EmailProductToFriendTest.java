package Tests;

import BaseTest.BaseTest;
import Pages.EmailProductToFriendPage;
import org.junit.Test;

public class EmailProductToFriendTest extends BaseTest {

    @Test
    public void emailProductToFriendTest() {
        EmailProductToFriendPage emailProductToFriend = new EmailProductToFriendPage(Driver);
        emailProductToFriend.emailProductToFriend("florina.roman@gmail.com",
                "Verifica acest produs, posibil sa fie ceea ce cauti");
    }
}
