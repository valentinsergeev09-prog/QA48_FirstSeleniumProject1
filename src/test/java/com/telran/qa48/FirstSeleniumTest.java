package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;


    //before method -setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

    //  Maximize browser to window
        driver.manage().window().maximize();

    //  driver.get("https://www.google.com/");//without history
        driver.navigate().to("https://www.tel-ran.com/");//whit history

    //  wait for all elements on the sote to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogle(){
        System.out.println("Open Google");
    }
    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        //driver.quit(); //all tabs and browser
        driver.close();  // only one tab
    }
}
