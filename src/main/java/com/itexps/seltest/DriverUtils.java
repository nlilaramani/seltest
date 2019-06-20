/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.seltest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author 212616565
 */
public class DriverUtils {
    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        Proxy proxy = new Proxy();
        //proxy.setNoProxy("noProxy");
        proxy.setProxyType(Proxy.ProxyType.DIRECT);
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        return new ChromeDriver(capabilities);
    }
    public static WebDriver getRemoteChromeDriver() throws MalformedURLException{
        System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        //Proxy proxy = new Proxy();
        //proxy.setNoProxy("noProxy");
        //proxy.setProxyType(Proxy.ProxyType.DIRECT);
        //scapabilities.setCapability(CapabilityType.PROXY, proxy);
        return new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),capabilities);
    }
    public static WebDriver getIEDriver(){
        System.setProperty("webdriver.ie.driver","c:\\qa\\drivers\\iedriverserver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
        return new InternetExplorerDriver(capabilities);
    }
    
    public static WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver","c:\\qa\\drivers\\geckodriver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        //Proxy proxy = new Proxy();
        //proxy.setNoProxy("noProxy");
        //proxy.setProxyType(Proxy.ProxyType.DIRECT);
        //capabilities.setCapability(CapabilityType.PROXY, proxy);
        return new FirefoxDriver(capabilities);
    }
    
    public static WebDriver getEdgeDriver(){
        System.setProperty("webdriver.edge.driver","c:\\qa\\drivers\\MicrosoftWebDriver_New.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.edge();
        return new EdgeDriver(capabilities);
    }
    
    public static void main(String[] args){
        WebDriver wd=getChromeDriver();
        wd.get("http://www.google.com");
        /*WebDriver wd1=getIEDriver();
        wd1.get("http://www.microsoft.com");
        WebDriver wd3=getEdgeDriver();
        wd3.get("http://www.microsoft.com");
        WebDriver wd2=getFirefoxDriver();
        wd2.get("http://www.mozilla.org");*/
    
    }
    
}
