package org.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wbl.Base.BaseTest;
import org.wbl.Pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage lp;

    @Test
    public void tc_validlogin(){
        lp= new LoginPage(driver);
        lp.setinput("vinuta_ktk@yahoo.co.in","shashank07");
       // Assert.assertTrue(status);
    }
}
