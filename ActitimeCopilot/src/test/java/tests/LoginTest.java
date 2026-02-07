package tests;



import org.openqa.selenium.WebDriver;
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
        setImplicitWait(driver, 20); // Wait for the home page to load
        loginPage.createTask("Test Task");
    Thread.sleep(6000);
        
    }

    private void setImplicitWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}