package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static gov.uk.check.visa.browserfactory.ManageBrowser.driver;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath =  "//a[normalize-space()='Start now']")
    WebElement start;


    public void clickStartNow(){
        log.info("Click on start now: " + start.toString());
        clickOnElement(start);

    }
}
