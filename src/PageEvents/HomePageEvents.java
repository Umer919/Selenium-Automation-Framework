package PageEvents;

import pageObjects.HomePageElements;
import test.java.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {

    public void clickOnSignInButton(){

        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on signin Button");
        elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }
}
