package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Part2 {

    public static void main(String[] args) throws Exception{

        //1. Open the Browser
        WebDriver driver = new ChromeDriver();
        //2. navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        //3. enter username Admin in username text box
        WebElement userNameTextBox = driver.findElement(By.name("username"));
        userNameTextBox.sendKeys("Admin");
        //4. enter password admin123 in password field
        WebElement passwordTextBox = driver.findElement(By.name("password"));
        passwordTextBox.sendKeys("admin123");
        //5. click on login buttonv
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));
        loginButton.click();

        //6. check whether Login button is not displayed
        boolean isLoginButtonDisplayed = loginButton.isDisplayed();
        System.out.println("is Login Button displayed ? " +isLoginButtonDisplayed);


    }


}
