package Tests;

import org.example.LoginPage;
import org.testng.annotations.Test;

@Test
public class LoginTest extends TestBase {
    LoginPage loginPage;

    public void Login() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.ClickLogin();
        loginPage.SendEmail("kero79060@gmail.com");
        loginPage.SendPassword("kero79060**@@");
        loginPage.ClickLoginBtn();
        Thread.sleep(3000);
    }
}
