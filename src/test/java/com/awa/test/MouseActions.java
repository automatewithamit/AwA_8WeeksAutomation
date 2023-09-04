package com.awa.test;

import com.awa.selenium.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    static OrangeHRM orangeHRM = new OrangeHRM();

    public static void main(String[] args) throws Exception {

        //Mouse Actions
        //1. click()
//        orangeHRM.login();
//        WebElement pimMenuItem = DriverManager.driver.findElement(By.xpath("//a[contains(@href, 'viewPimModule')]"));
//        Actions actions = new Actions(DriverManager.driver);
//        Thread.sleep(3000);
//        actions.click(pimMenuItem).build().perform();
//        // 2. right click
//        Thread.sleep(5000);
//        WebElement addEmployeeMenu = DriverManager.driver.findElement(By.xpath("//a[normalize-space()='Add Employee']"));
//
//        actions.contextClick().build().perform();
//        actions.contextClick(addEmployeeMenu).build().perform();
//
//
//        actions.doubleClick().build().perform();
        //pimMenuItem.click();

//3. double click
//        Test Scenario
//
//        Go to https://unixpapa.com/js/testmouse.html
//        Double click on “click here to test”
//        Search for “dblclick” in the text area
//        Assert if the Double click operation is not successful
        DriverManager.driver = new ChromeDriver();

        DriverManager.driver.navigate().to("https://unixpapa.com/js/testmouse.html");
        DriverManager.driver.manage().window().maximize();
        Thread.sleep(3000);


        /* create an object for the Actions class and pass the driver argument */
        Actions action = new Actions(DriverManager.driver);

        WebElement elem_clear = DriverManager.driver.findElement(By.xpath("//a[.='click here to clear']"));
        Thread.sleep(2000);
        elem_clear.click();

        WebElement elem_test_btn = DriverManager.driver.findElement(By.xpath("//a[.='click here to test']"));
        Thread.sleep(2000);
        action.doubleClick(elem_test_btn).build().perform();


        /* Verify whether the double click operation was successful or not */
        WebElement text_area = DriverManager.driver.findElement(By.cssSelector("textarea"));
        String textattr = text_area.getAttribute("value");
        System.out.println(textattr);

//        String bodyText = DriverManager.driver.findElement(By.tagName("textarea")).getText();
//        Assert.assertFalse(bodyText.contains(str_dblclick), "Text found!");
//        System.out.println("Double Click test case successful\n");
//        Thread.sleep(3000);


    }

}
