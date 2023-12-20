package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.Step4_ParentAddPasswordPage;
import Test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_ParentAddPasswordPage extends TestBase {
    Step4_ParentAddPasswordPage checkPass;
@Test
    public void ParentAddPass(){
        checkPass=new Step4_ParentAddPasswordPage(driver);
        checkPass.ParentAddPass(driver, Data.Password);
        String Actual=driver.getCurrentUrl();
        String Expected="https://frontend.oetest2.tech/registration/ar";
        Assert.assertEquals(Actual,Expected);
    }
}
