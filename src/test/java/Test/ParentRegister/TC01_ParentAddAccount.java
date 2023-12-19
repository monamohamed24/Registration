package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.CheckIDPage;
import Pages.ParentRegister.CheckPhonePage;
import Test.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC01_ParentAddAccount extends TestBase {
    CheckIDPage  checkId;
    CheckPhonePage checkphone;
    @Test(priority = 1)
    public void checkID(){
        checkId=new CheckIDPage(driver);
        checkId.ParentID(Data.nationalID);
        checkId.clickbutton();
        int Actual=Data.nationalID.length();
        int Expect= 10;
        Assert.assertEquals(Actual,Expect);

    }
    @Test(priority = 2)
    public void CheckPhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        checkphone=new CheckPhonePage(driver);
        checkphone.CheckPhone(Data.phoneNumber);
        checkId.clickbutton();
    }

    @Test(priority = 3)
    public void CheckVerifyPhoneNumber() throws InterruptedException{

        Thread.sleep(2000);
        checkphone.checkVerifyCode(driver);
        Thread.sleep(2000);
        checkId.clickbutton();

    }
}
