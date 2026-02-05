package ActitimeLoginPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    @Test(priority = 1)
    public void loginToActitime() {
        WebDriver driver = new ChromeDriver();
        String url = ExeclReadData.getProperty("url");
        
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        // Enter username
        driver.findElement(By.name("username")).sendKeys(ExeclReadData.getProperty("username"));
        // Enter password
        driver.findElement(By.name("pwd")).sendKeys(ExeclReadData.getProperty("password"));
        // Click on login button
        driver.findElement(By.id("loginButton")).click();
        // Optionally, add a wait or assertion here to verify login success
    }

    // add two more test methods for invalid login and logout functionality
    @Test(priority = 2)
    public void invalidLoginToActitime() {
        WebDriver driver = new ChromeDriver();
        String url = ExeclReadData.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        // Enter invalid username
        driver.findElement(By.name("username")).sendKeys("invalid");
        // Enter invalid password
        driver.findElement(By.name("pwd")).sendKeys("invalid");
        // Click on login button
        driver.findElement(By.id("loginButton")).click();
    }
}