package Tests;

import org.example.RegisterPage;
import org.testng.annotations.Test;

@Test
public class RegisterTest extends TestBase {
    RegisterPage registerPage;

    public void register() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.clickRegPageBtn();
        registerPage.SendEmailReg("kero79060@gmail.com");
        registerPage.SendUsrName("Kirollos Medhat");
        registerPage.SendPasswordReg("kero79060**@@");
        Thread.sleep(15000);
        registerPage.clickRegBtn();

    }
}
