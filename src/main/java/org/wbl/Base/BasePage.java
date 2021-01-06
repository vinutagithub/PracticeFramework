package org.wbl.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
}
