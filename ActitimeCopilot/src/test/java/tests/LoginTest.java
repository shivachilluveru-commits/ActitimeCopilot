package tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import pages.LoginPage;
import utils.TestUtil;

public class LoginTest extends BasePage {
    private LoginPage loginPage;

    @BeforeMethod
    public void setUpTest() {
        setUp();
        driver.get("http://localhost/login.do");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() throws InterruptedException {
        String username = TestUtil.getProperty("username");
        String password = TestUtil.getProperty("password");
        loginPage.login(username, password);
    Thread.sleep(6000);
        
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}