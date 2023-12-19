package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Step4_ParentAddPasswordPage extends PageBase {
    public Step4_ParentAddPasswordPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(css = "div[class*=\"terms-inner\"]")
    WebElement confirmTerms;

public void ParentAddPass(WebDriver drive, String Password){
    WebElement ParentPassword = drive.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(6);
    setTextElement(ParentPassword,Password);

    WebElement ParentConfirmPassword = drive.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(7);
        setTextElement(ParentConfirmPassword, Password);

        clickButton(confirmTerms);

    WebElement next= drive.findElements(By.cssSelector("button[class*=\"form-button\"]")).get(3);
    clickButton(next);
}
}
