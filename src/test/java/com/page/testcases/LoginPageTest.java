package com.page.testcases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.page.classes.LoginPage;
public class LoginPageTest {
@Test
public void verifyLogo() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
LoginPage loginpage = new LoginPage(driver);
driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

boolean flag=loginpage.validateLogo();
Assert.assertTrue(flag);

}

@Test
public void verifyLogin() {
System.setProperty("webdriver.chrome.driver",

"C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
LoginPage loginpage = new LoginPage(driver);
driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

loginpage.login();
String actualURL= driver.getCurrentUrl();

String expectedURL= "https://opensourcedemo.orangehrmlive.com/index.php/dashboard";

Assert.assertEquals(actualURL, expectedURL);
}
// @AfterMethod
// public void tearDown() {
// driver.close();
}