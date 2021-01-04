package test.java;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

    @Test
    public void sampleMethodForEmailEntering(){

        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();


        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageOpenendorNot();
        loginPageEvents.enteremailID();



    }
}
