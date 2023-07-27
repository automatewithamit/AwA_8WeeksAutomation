package com.awa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class NavigationCommands {

    public static void main(String[] args) throws Exception{

//        navigate().to(url)
//        navigate().back()
//        navigate().forward()
//        navigate().refresh()
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
