package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String expectedMessage = "Welcome Jacqueline";
        //sending emailfields
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("Admin");
        //sending password fields
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");
        //clicking the login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //verify the welcome text element and get text

        WebElement actualMessageElement = driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualMessage = actualMessageElement.getText();
        //validate actual and expected message
        Assert.assertEquals("Not similar welcome message", expectedMessage, actualMessage);
    }
//closing the browser
    @After
    public void tearDown() {
        closeBrowser();
    }

}
