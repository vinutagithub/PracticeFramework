package org.wbl.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.wbl.Util.ConfigUtil;
import org.wbl.Util.Constants;
import org.wbl.Util.WebDriverUtil;

public class BaseTest {

   protected WebDriver driver;
   String browser,url;

   @BeforeSuite
    public void initialize(){
       ConfigUtil configUtil = new ConfigUtil(Constants.RESOURCES_PATH +"/config.properties");
       browser=configUtil.getProperty("browser");
       url=configUtil.getProperty("BaseUrl");
   }

   @BeforeMethod
    public void setup(){
      driver=WebDriverUtil.getDriver(browser);
      driver.get(url);
      driver.manage().window().maximize();

   }

   @AfterMethod
    public void teardown(){
      // driver.close();
       driver.quit();
   }
}
