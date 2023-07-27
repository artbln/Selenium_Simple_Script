/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author art
 */
public class ExampleSeleniumTest {

    public ExampleSeleniumTest() {
    }
    
// @BeforeClass is better used when there are common pre-conditions for all @Test annotations.
// An example would be a set of cases where a logged in user is needed. 
// @Before is better when something needs to be done before every instance of @Test
    
/*
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
*/
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void searchforapackageandviewpackageinformation() {
        // Test name: Search for a package and view package information
        // Step # | name | target | value
        // 1 | open | https://yum-info.contradodigital.com/ | 
        driver.get("https://yum-info.contradodigital.com/");
        // 2 | setWindowSize | 1920x1048 |
        driver.manage().window().setSize(new Dimension(1920, 1048));
        // 3 | click | id=YumSearch | 
        driver.findElement(By.id("YumSearch")).click();
        // 4 | type | id=YumSearch | SFTP
        driver.findElement(By.id("YumSearch")).sendKeys("SFTP");
        // 5 | click | css=.btn | 
        driver.findElement(By.cssSelector(".btn")).click();
        // 6 | click | linkText=perl-Net-SFTP-Foreign | 
        driver.findElement(By.linkText("perl-Net-SFTP-Foreign")).click();
    }

}
