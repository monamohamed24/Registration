package Pages.ParentRegister;

import Pages.PageBase;
import org.openqa.selenium.*;


public class Step3_ParentJobInfoPage extends PageBase {


    public Step3_ParentJobInfoPage(WebDriver drive) {
        super(drive);
    }

    public void ParentJobInfo(WebDriver drive){

//            WebElement ParentJob= drive.findElements(By.cssSelector("input[class=\"vs__search\"]")).get(1);
        WebElement ParentJob= drive.findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input"));

            System.out.println(ParentJob);
            clickButton(ParentJob);
            setTextElement(ParentJob,"سعودى");
            ParentJob.sendKeys(Keys.ENTER);

        WebElement next= drive.findElements(By.cssSelector("button[class*=\"form-button\"]")).get(2);
        clickButton(next);



    }
}
