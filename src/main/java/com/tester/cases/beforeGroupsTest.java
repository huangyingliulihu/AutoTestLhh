package com.tester.cases;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeGroupsTest {
    @Test(dependsOnMethods = "com.tester.cases.LoginTest.loginTrue")
    public void print(){
        System.out.println("在Test之前运行");
    }
}
