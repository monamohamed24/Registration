package Test.ParentRegister;

import Pages.ParentRegister.Step3_ParentJobInfoPage;
import Test.TestBase;
import org.testng.annotations.Test;

public class TC05_ParentJobInfo extends TestBase {
    Step3_ParentJobInfoPage checkJobInfo;
    @Test
    public void CheckParentJob(){
        checkJobInfo=new Step3_ParentJobInfoPage(driver);
        checkJobInfo.ParentJobInfo(driver);
    }


}
