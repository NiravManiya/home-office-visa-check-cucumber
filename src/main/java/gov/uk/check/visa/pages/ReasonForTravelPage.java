package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static gov.uk.check.visa.browserfactory.ManageBrowser.driver;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getTypeName());
    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickContinue;

    public void selectReasonForVisit(String reason){
        log.info("Select a reason for visit: " + reasonList.toString());
        for (WebElement rsnElement : reasonList) {
            if (rsnElement.getText().contains(reason))
            {clickOnElement(rsnElement);
                break;}
        }

    }
    public void clickContinueButton() {
        log.info("Click on continue: " + clickContinue.toString());
        clickOnElement(clickContinue);

    }
}
