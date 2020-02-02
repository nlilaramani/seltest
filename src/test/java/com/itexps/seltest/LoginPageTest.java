/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.seltest;

import com.itexps.pageobjects.LoginPage;
import com.seltest.seltest.SeleniumUtils;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Owner
 */
public class LoginPageTest {
    
    private static LoginPage loginPage;
    public LoginPageTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        WebDriver driver=SeleniumUtils.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLoginPageInit(){
        assertTrue(loginPage.getTitle().contains("Mercury Tours"));
    }
    @Test
    public void testLogin(){
        loginPage.performLogin("mercury", "mercury");
        assertTrue(loginPage.getTitle().contains("Find a Flight"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
