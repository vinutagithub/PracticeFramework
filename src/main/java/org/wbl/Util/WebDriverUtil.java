package org.wbl.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverUtil {

    private static Logger log = LogManager.getLogger(WebDriverUtil.class);


    public static WebDriver getDriver(String browserName){

        WebDriver driver=null;

        switch(browserName){
            case "chrome":
                log.info("Chrome Driver used");
                System.setProperty("webdriver.chrome.driver",Constants.RESOURCES_PATH+ "Drivers/chromedriver.exe");
                driver=new ChromeDriver();
                break;
            case "firefox":
                log.info("firefox driver used");
                //driver=new FirefoxDriver();
                break;

            default:
                log.info("chrome driver");
                System.setProperty("webdriver.chrome.driver",Constants.RESOURCES_PATH+ "Drivers/chromedriver.exe");
                driver=new ChromeDriver();
                break;

        }
        return driver;
    }

}
