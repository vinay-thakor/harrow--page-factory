package uk.gov.harrow.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;
// create a constructor
    public BasePage(){
        //setting properties for lo4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/uk/gov/harrow/resources/properties/Log4J.properties");
        //setting properties for page factory
        PageFactory.initElements(driver,this);
    }

}
