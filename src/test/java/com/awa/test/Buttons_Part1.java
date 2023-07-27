package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Part1 {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

//1. navigate to https://www.orangehrm.com/
        driver.navigate().to("https://www.orangehrm.com/");
        //2. clicking on contact sales
        WebElement contactSalesButton = driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-free-demo'])[2]"));
        //3. get the text of button
        String buttonName = contactSalesButton.getText();
        System.out.println("Button Name is : "+buttonName);
//4. check whether button is enabled or not
        boolean isButtonEnabled = contactSalesButton.isEnabled();
        System.out.println("is Contact Sales Button Enabled ? " +isButtonEnabled);
        //5. check whether button is displayed or not
        boolean isButtonDisplayed = contactSalesButton.isDisplayed();
        System.out.println("is Contact Sales Button Displayed ? " +isButtonDisplayed);

        contactSalesButton.click();






    }


}
