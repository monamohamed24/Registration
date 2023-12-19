package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.Step1_ParentAddInfoPage;
import Test.TestBase;
import org.testng.annotations.Test;

public class TC03_ParentAddInfo extends TestBase {

    Step1_ParentAddInfoPage AddInfo;
    @Test()
    public void ParentBasicInf() throws InterruptedException {
        Thread.sleep(2000);
        AddInfo= new Step1_ParentAddInfoPage(driver);
        AddInfo.ParentBasicInfo(Data.FirstName,Data.SecondName,Data.ThirdName);
        AddInfo.ClickNext();
        Thread.sleep(2000);
    }
}
