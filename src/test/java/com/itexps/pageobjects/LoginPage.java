/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pageobjects;
import com.seltest.seltest.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;
/**
 *
 * @author Owner
 */
public class LoginPage extends CommonPage{
    @FindBy(name="userName")
    private WebElement username;
    @FindBy(name="password")
    private WebElement password;
    @FindBy(name="login")
    private WebElement button;
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        driver.get("http://newtours.demoaut.com");
        PageFactory.initElements(this.driver, this);
    }
    
    public void performLogin(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        button.click();
    }
}
