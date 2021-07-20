package com.finalProject.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name= "loginData")
    public Object[][] getdata(){
        Object[][] data = new   Object[][]{
                {"Anku", "AnkuJain"},
                {"DJ", "DjJain"},
        };
        return data;
    }









}




