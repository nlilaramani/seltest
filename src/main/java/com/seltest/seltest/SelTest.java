/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seltest.seltest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Owner
 */
public class SelTest {
    
    static WebDriver driver=SeleniumUtils.getChromeDriver();
    public static void main(String[] args){
        driver=SeleniumUtils.getChromeDriver();
        driver.get("http://www.itexps.net");
        checkConfig();
        /*checkGoogle();
        checkNavigation();
        checkInput();
        checkFacebook();*/
        checkFacebookSignup();
        
    }
    
    public static void checkNavigation(){
        Navigation n=driver.navigate();
        n.to("http://www.google.com");
        n.to("http://www.firefox.com");
        n.to("http://www.selenium.dev");
        n.back();
        n.forward();
        n.refresh();
        
        
    }
    
    public static void checkConfig(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
    }
    
    public static void checkGoogle(){
        driver.get("http://www.google.com");    
        driver.findElement(By.name("q")).sendKeys("Seleenium Jobs");
        driver.findElement(By.name("btnK")).submit();
        driver.getTitle().contains("Seleenium Jobs");
    }
    
    public static void checkInput(){
        driver.get("http://www.google.com");
        WebElement e=driver.findElement(By.name("q"));
        e.sendKeys("Selenium Jobs");
        System.out.println(e.getText());
        e.clear();
        e.sendKeys("Java Jobs");
    }
    
    public static void checkFacebook(){
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("nlpappu@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("vaan@221298");
        driver.findElement(By.id("u_0_2")).click();
    }
    
    public static void checkFacebookSignup(){
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("ajdksjdk");
        driver.findElement(By.name("lastname")).sendKeys("djksadj");
        driver.findElement(By.id("u_0_k")).sendKeys("392893132");
        driver.findElement(By.name("reg_passwd__")).sendKeys("adasdd");
        driver.findElement(By.id("u_0_a")).click();
        driver.findElement(By.id("month")).sendKeys("Mar");
        driver.findElement(By.id("day")).sendKeys("12s");
        
    }
}
