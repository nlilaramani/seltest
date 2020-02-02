/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Owner
 */
public class CommonPage {
    private WebDriver driver;
    public CommonPage(WebDriver driver){
        this.driver=driver;
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public String getPageSource(){
        return driver.getPageSource();
    }
    
}
