package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.name("username");
    private By passwordField = By.name("pwd");
    private By loginButton = By.id("loginButton");

    // Locators for task creation (POM style)
    private By tasksMenu = By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/img");
    private By createTaskButton = By.id("createTaskButton");
    private By taskNameField = By.name("taskName");
    private By saveTaskButton = By.id("saveTaskButton"); 

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
    
    public void createTask (String taskName) {
        driver.findElement(tasksMenu).click();
        setImplicitWait(driver, 20); // Wait for the tasks page to load
        driver.findElement(createTaskButton).click();
        setImplicitWait(driver, 20); // Wait for the create task form to appear
        driver.findElement(taskNameField).sendKeys(taskName);
        setImplicitWait(driver, 20); // Wait for the task name to be entered
        driver.findElement(saveTaskButton).click();
    }

	private void setImplicitWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		
	}
}