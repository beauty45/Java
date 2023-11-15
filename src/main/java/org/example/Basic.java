package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic
{

    @DataProvider

    public Object[][] testData()
    {
        return new Object[][]
                {
                        {1,2},
                        {3,4},
                        {5,6},
                };

    }
    @Test(dataProvider = "testData")
    public void Info(int a, int b)
    {

        System.out.println("1st num :" +a+ "2nd num:" +b);

    }
}
