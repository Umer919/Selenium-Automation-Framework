package PageEvents;


import org.testng.Assert;

import pageObjects.LoginPageElements;
import test.java.BaseTest;
import utils.ElementFetch;

public class LoginPageEvents {
    public void verifyLoginPageOpenendorNot(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verify that login page is opened or not");
        String message="";
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.LoginText).size()>0, "login Page did not open");




    }
    public void enteremailID(){

        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the email id");
        elementFetch.getWebElement("ID",LoginPageElements.emailAddress).sendKeys("umersatti919@gmail.com");

}
}
