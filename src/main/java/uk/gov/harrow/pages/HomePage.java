package uk.gov.harrow.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.Utility.Utility;

public class HomePage extends Utility {



    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
   // By loginOrRegisterLink = By.xpath("//span[@class='icon-fallback']");
    //By servicesBtn = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");
    @FindBy(xpath = "//span[@class='icon-fallback']" )
    WebElement _loginOrRegisterLink;
    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _serviceBtn;

    //methods performing actions on elements
    public void clickOnLoginOrRegisterLink() {
        waitUntilElementToBeClickable(By.xpath("//span[@class='icon-fallback']"),3000);
        Reporter.log("Clicking on Login or Register :" + _loginOrRegisterLink.toString() + "<br>");
        clickOnElement(_loginOrRegisterLink);
        log.info("Clicking on Login or Register :" + _loginOrRegisterLink.toString());
    }


    public void clickOnServicesBtn() {
        waitUntilElementToBeClickable(By.xpath("//span[@class='button__text'][contains(text(),'Services')]"),3000);
        Reporter.log("Clicking on the service button : " + _serviceBtn.toString() + "<br>");
        clickOnElement(_serviceBtn);
        log.info("Clicking on the service button : " + _serviceBtn.toString());
    }


  //  public boolean isDisplayedServicesBtn() {
    //    return elementIsDisplayed(servicesBtn);
   // }



}
