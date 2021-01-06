package org.wbl.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class logListeners extends TestListenerAdapter {
    Logger log = LogManager.getLogger(WebDriverUtil.class);

    public void onTestSuccess(ITestResult tr){

        log.info(tr.getName() + " is success");
    }





}
