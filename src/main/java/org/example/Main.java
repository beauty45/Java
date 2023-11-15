package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Main{

    @DataProvider(name="login")

    public Object[][] testData()
    {
        return new Object[][]
                {
                        {"standard_user","lopa"},
                        {"beauty","dhaka"},
                        {"standard_user","secret_sauce"},
                        {"standard","secret"},

                        //Thread.sleep(30000);

                };



    }
    @Test(dataProvider="login")
   public void Info(String name, String pass)
   {

       WebDriver driver = new ChromeDriver();

      driver.get("https://www.saucedemo.com/");

       driver.findElement(By.id("user-name")).sendKeys(name);
       driver.findElement(By.id("password")).sendKeys(pass);
       driver.findElement(By.id("login-button")).click();

        String Expected_value ="Sauce Labs Backpack";
       String Actual_value = driver.findElement(By.linkText("Sauce Labs Backpack")).getText();
               Assert.assertEquals(Actual_value,Expected_value);


   }

}




///user name: standard_user
//passward: secret_sauce
// standard_user, lopa
// shaon, bambaria
// beauty, dhaka
