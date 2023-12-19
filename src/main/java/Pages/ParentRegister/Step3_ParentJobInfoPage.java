package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step3_ParentJobInfoPage extends PageBase {


    public Step3_ParentJobInfoPage(WebDriver drive) {
        super(drive);
    }

    public void ParentJobInfo(WebDriver drive){
        int ParentJob= drive.findElements(By.cssSelector("div[class=\"vs__selected-options\"]")).size();
        System.out.println(ParentJob);
//        setTextElement(ParentJob,"سعودى");
//        ParentJob.sendKeys(Keys.ENTER);



    }
}
