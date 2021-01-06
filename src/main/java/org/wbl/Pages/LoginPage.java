package org.wbl.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.wbl.Base.BasePage;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID,id="username")
    WebElement ele_username;

    @FindBy(how= How.ID,id="password")
    WebElement ele_passwd;

    @FindBy(how = How.ID,id="login")
    WebElement ele_loginbtn;

    @FindBy(how = How.ID,id="logout")
    WebElement ele_logout;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void setinput(String uname,String password){

        ele_username.sendKeys(uname);
        ele_passwd.sendKeys(password);

        ele_loginbtn.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        System.out.println(driver.findElement(By.cssSelector(".heading-title")).getText());
     //   return ele_logout.isDisplayed();


    }
}
