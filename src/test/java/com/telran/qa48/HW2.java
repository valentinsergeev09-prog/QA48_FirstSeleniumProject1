package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HW2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findEelementBy() {
        List<WebElement> span = driver.findElements(By.tagName("span"));
        for (WebElement e : span) {
            System.out.println(e.getText());
        }

        WebElement cart = driver.findElement(By.className("cart-label"));
        System.out.println(cart.getText());

        WebElement elementId = driver.findElement(By.id("bar-notification"));
        System.out.println(elementId.getAttribute("class"));
    }
}
