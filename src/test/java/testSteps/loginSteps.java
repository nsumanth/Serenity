package testSteps;

import PageObjects.loginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class loginSteps {
    private loginPage page;
    @Step
    public void login_open(){
            page.open();
    }
    @Step
    public void search(){
        page.searchGoogle("test");
    }
    @Step
    public void verify(){
        Assert.assertTrue(page.getTitleAfterSearch().equals("test - Google Search"));
    }

}
