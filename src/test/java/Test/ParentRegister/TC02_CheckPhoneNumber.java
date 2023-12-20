package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.CheckIDPage;
import Pages.ParentRegister.CheckPhonePage;
import Test.TestBase;
import org.testng.annotations.Test;

public class TC02_CheckPhoneNumber extends TestBase {
    CheckIDPage checkId;
    CheckPhonePage checkphone;
    @Test(priority = 1)
    public void CheckPhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        checkphone=new CheckPhonePage(driver);
        checkphone.CheckPhone(Data.phoneNumber);
        checkId=new CheckIDPage(driver);
        checkId.clickbutton();
    }
    @Test(priority = 2)
    public void CheckVerifyPhoneNumber() throws InterruptedException{

        Thread.sleep(2000);
        checkphone.checkVerifyCode(driver);
        Thread.sleep(2000);
        checkId.clickbutton();

    }
}
