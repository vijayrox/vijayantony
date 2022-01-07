package com.page.testclass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.util.Assert;
import com.page.base.Baseclass2;
public class DataDrivenTest1 extends Baseclass2 {
@Test(dataProvider = "Credentials1")
public void loginTest(String username,String password) {

 driver.findElement(By.id("txtUsername")).sendKeys(username);
 driver.findElement(By.id("txtPassword")).sendKeys(password);
 driver.findElement(By.id("btnLogin")).click();
 String actualURL=driver.getCurrentUrl();
 String expectedURL="https://opensourcedemo.orangehrmlive.com/index.php/dashboard";
 AssertJUnit.assertEquals(actualURL, expectedURL);
}
}