package Test.ParentRegister;

import Pages.Data;
import Pages.ParentRegister.CheckIDPage;
import Test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_CheckID extends TestBase {
    CheckIDPage  checkId;
    @Test()
    public void checkID(){
        checkId=new CheckIDPage(driver);
        checkId.ParentID(Data.nationalID);
        checkId.clickbutton();
        int Actual=Data.nationalID.length();
        int Expect= 10;
        Assert.assertEquals(Actual,Expect);

    }




}
