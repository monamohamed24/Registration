package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.Step2_ParentCommunicationInfoPage;
import Test.TestBase;
import org.testng.annotations.Test;

public class TC04_ParentCommunicationInfo extends TestBase {

    Step2_ParentCommunicationInfoPage checkinfo;


    @Test
    public void CheckCommInfo() throws InterruptedException {
        checkinfo=new Step2_ParentCommunicationInfoPage(driver);
        checkinfo.communicationData(driver, Data.Address);
        Thread.sleep(2000);

    }
}
