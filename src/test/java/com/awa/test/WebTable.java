package com.awa.test;

import com.awa.selenium.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable {

    static OrangeHRM orangeHRM = new OrangeHRM();

    public static void main(String[] args) throws Exception {

        orangeHRM.login();


        WebElement pimMenuItem = DriverManager.driver.findElement(By.xpath("//a[contains(@href, 'viewPimModule')]"));

        pimMenuItem.click();

        Thread.sleep(3000);
        //orangeHRM.selectEmployee("Nargesh");
        orangeHRM.deleteEmployee("Dong");

    }


}






