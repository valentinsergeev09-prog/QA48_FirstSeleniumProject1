package HW;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW3 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void Test1(){

    }
}
