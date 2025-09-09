package HW01x03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW   {
    WebDriver driver;

    //before methot - setUp

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    // test
    @Test
    public void  openGoogleTest(){
        System.out.println("Open demowebshop Test");
    }


    // after method - tearDown
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
