import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class SampleTestCase {

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
        User remoteUser = userController.getUserByUsername("AntonNzk");

        assertTrue(remoteUser.getHtml_url().contains("https://github.com/AntonNzk"));
    }

    @Test
    public void testFollowers() {
        User[] followers = userController.getFollowersByUser("AntonNzk");
        assertTrue(followers.length == 0);
    }


}
