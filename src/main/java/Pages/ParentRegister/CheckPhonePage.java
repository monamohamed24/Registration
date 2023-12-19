package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CheckPhonePage extends PageBase {
    public CheckPhonePage(WebDriver drive) {
        super(drive);
    }
    @FindBy(css = "input[class=\"vti__input\"]")
    WebElement Phone;

    public void CheckPhone(String PhoneNumber){
        setTextElement(Phone,PhoneNumber);
    }

    public void checkVerifyCode(WebDriver drive) {
        try {

            WebDriverWait exp= new WebDriverWait(drive, Duration.ofSeconds(7000));
            exp.until
                    (ExpectedConditions.visibilityOfElementLocated
                            (By.cssSelector("input[class=\"otp-input\"]")));
            List<WebElement> SearchVerifynNmber=   drive.findElements(By.cssSelector("input[class=\"otp-input\"]"));
            for(int i=0 ; i< SearchVerifynNmber.size(); i++ ) {
                setTextElement(SearchVerifynNmber.get(i), String.valueOf(i+1));

            }
        }

        catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert not shown");
        }
    }
}


