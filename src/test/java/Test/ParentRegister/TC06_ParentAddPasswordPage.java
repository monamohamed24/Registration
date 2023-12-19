package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.Step4_ParentAddPasswordPage;
import Test.TestBase;
import org.testng.annotations.Test;

public class TC06_ParentAddPasswordPage extends TestBase {
    Step4_ParentAddPasswordPage checkPass;
@Test
    public void ParentAddPass(){
        checkPass=new Step4_ParentAddPasswordPage(driver);
        checkPass.ParentAddPass(driver, Data.Password);
    }
}
