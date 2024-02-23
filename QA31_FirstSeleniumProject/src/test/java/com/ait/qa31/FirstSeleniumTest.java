package com.ait.qa31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
    }
    @Test
    public void openGoogletest(){

        System.out.println("Google opened!");

    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.close();  //закрывает только одну вкладку
        //driver.quit();  //закрое все полностью
        System.out.println("Google closed!");
    }
}
