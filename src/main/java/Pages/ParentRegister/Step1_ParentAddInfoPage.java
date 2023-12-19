package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Step1_ParentAddInfoPage extends PageBase {
    public Step1_ParentAddInfoPage(WebDriver drive) {
        super(drive);
    }


    @FindBy(css = "div[class*=\"position-relative\"]")
    WebElement formbody;


    WebElement ParentFirstName= formbody.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(0);

    WebElement ParentSecondName=formbody.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(1);

    WebElement ParentThirdName=formbody.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(2);
    @FindBy(css = "div[class*=\"col-md-6\"] [class*=\"align-items-center\"]")
    WebElement body;
    WebElement gender = body.findElements(By.cssSelector("div[class*=\"custom-radio\"] [class=\"custom-control-label\"]")).get(0);
    WebElement next= formbody.findElements(By.cssSelector("button[class*=\"form-button\"]")).get(0);




    public void ParentBasicInfo(String FirstName, String SecondName, String ThirdName){
        setTextElement(ParentFirstName, FirstName);
        setTextElement(ParentSecondName,SecondName);
        setTextElement(ParentThirdName,ThirdName);
        clickButton(gender);

    }

    public void ClickNext(){
        clickButton(next);
    }


}
