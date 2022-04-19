package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        String expected = "Forgot your password?";

        WebElement actualMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("forgot password link failed", expected, actualMessage);
    }
    @After
public void tearDOwn(){
    closeBrowser();
    }
}

