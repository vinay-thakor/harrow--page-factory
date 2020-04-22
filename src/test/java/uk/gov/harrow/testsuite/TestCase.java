package uk.gov.harrow.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {
    HomePage homePage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp(){
        homePage = new HomePage();

    }


    //object creation
   // LoadProperty loadProperty = new LoadProperty();

    //LoginPage loginPage = new LoginPage();

   // String loginPageText = loadProperty.getProperty("loginPageText");

    //TestCases
    @Test (groups = {"Regression","Smoke"})
    public void verifyClickOnLoginOrRegisterLink() {
        //click on login or register link
        homePage.clickOnLoginOrRegisterLink();
        //verify text on Login Page
      //  loginPage.verifyTextWelcomeGuest(loginPageText);
    }

    @Test (groups = {"Regression"})
    public void verifyClickOnServicesBtn() {
        //click on services button
        homePage.clickOnServicesBtn();
    }

//    @Test (groups = {"Regression"})
//    public void verifyElementsOnHarrowWebsiteHomePageAreDisplayed() {
//        //verify service button is displayed
//        homePage.isDisplayedServicesBtn();
//    }

}
