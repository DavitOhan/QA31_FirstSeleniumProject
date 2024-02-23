package com.ait.qa31;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {

        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());


        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void findElementBySampleLocator() {

        driver.findElement(By.id("small-searchterms"));
        driver.findElement(By.className("item-box"));
        driver.findElement(By.linkText("Log in"));
        driver.findElement(By.partialLinkText("Register"));
    }

    @Test
    public void findElementByCssSelectorTest() {

        driver.findElement(By.cssSelector("input.search-box-text"));
        driver.findElement(By.cssSelector(".item-box"));
        driver.findElement(By.cssSelector("a.ico-register"));
    }

    @Test
    public void findElementByXpath() {

        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//div[@class='item-box']"));
        driver.findElement(By.xpath("//a[contains(@href,'register')]"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
