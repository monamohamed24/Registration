package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Step2_ParentCommunicationInfoPage extends PageBase {
    public Step2_ParentCommunicationInfoPage(WebDriver drive) {
        super(drive);
    }

    public void communicationData(WebDriver drive, String Address){

        WebElement ParentNationalAddress = drive.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(4);
        setTextElement(ParentNationalAddress,Address);

        WebElement next= drive.findElements(By.cssSelector("button[class*=\"form-button\"]")).get(1);
        clickButton(next);


    }
}
