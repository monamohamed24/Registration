package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckIDPage extends PageBase {
    public CheckIDPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "__BVID__25")
    WebElement ParentID;
    @FindBy(id = "__BVID__27")
    WebElement confParentID;

    @FindBy(css = "button[class*=\"btn-primary\"]")
    WebElement ClickNext;
    public void ParentID(String ParentId) {
        setTextElement(ParentID, ParentId);
        setTextElement(confParentID, ParentId);
    }
    public void clickbutton(){
        clickButton(ClickNext);



    }
}
