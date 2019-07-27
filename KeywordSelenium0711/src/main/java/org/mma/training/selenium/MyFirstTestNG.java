package org.mma.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 
public class MyFirstTestNG {
    private WebDriver driver;
 
    @BeforeSuite
    public void initDriver() throws Exception {
       // System.out.println("You are testing in chrome");
        System.setProperty("webdriver.chrome.driver","./webdriver/chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        
    }
 
    @Test
    public void searchTestNGInGoogle() {
       /* final String searchKey = "TestNG";
        System.out.println("Search " + searchKey + " in google");
        driver.navigate().to("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        System.out.println("Enter " + searchKey);
        element.sendKeys(searchKey);
        System.out.println("submit");
        element.submit(); */
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase()
//                        .startsWith(searchKey.toLowerCase());
//            }
//        });
       // System.out.println("Got " + searchKey + " results");
    }
 
    @AfterSuite
    public void quitDriver() throws Exception {
       // driver.quit();
    	driver.get("https://github.com");
    	  //System.out.println(driver.getTitle()); 
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
        driver.findElement(By.id("login_field")).sendKeys("malrayyan");
    	driver.findElement(By.id("password")).sendKeys("!Ready2go83$");
    	driver.findElement(By.name("commit")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/summary/span")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/details-menu/a[1]")).click();
    	Thread.sleep(700);

    	driver.close();
    	//driver.quit();
    	//minimum
    }
}

