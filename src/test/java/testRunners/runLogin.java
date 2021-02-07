package testRunners;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testSteps.loginSteps;

@RunWith(SerenityRunner.class)
public class runLogin {
    @Steps
    loginSteps loginSteps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void loginToGoogle(){
        loginSteps.login_open();
        loginSteps.search();
        loginSteps.verify();
    }
}
