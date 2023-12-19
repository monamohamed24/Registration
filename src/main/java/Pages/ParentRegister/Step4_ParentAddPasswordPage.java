package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step4_ParentAddPasswordPage extends PageBase {
    public Step4_ParentAddPasswordPage(WebDriver drive) {
        super(drive);
    }

public void ParentAddPass(WebDriver drive, String Password){
    WebElement ParentPassword = drive.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(6);
    setTextElement(ParentPassword,Password);

    WebElement ParentConfirmPassword = drive.findElements(By.cssSelector("input[class*=\"form-control\"]")).get(7);
        setTextElement(ParentConfirmPassword, Password);
}
}
