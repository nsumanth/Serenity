package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://google.com")
public class loginPage extends PageObject {

    @FindBy(name = "q")
   WebElementFacade searchBox;
    @FindBy(xpath = "//*[@aria-label='Google Search']")
    WebElementFacade searchButton;

    public void searchGoogle(String Search) {
        searchBox.sendKeys(Search);
        searchButton.shouldBeEnabled();
        searchButton.click();
    }

    public String getTitleAfterSearch(){
        return getTitle();
    }
}
