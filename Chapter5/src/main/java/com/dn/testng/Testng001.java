package com.dn.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng001 {

    //
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void testCase3(){
        System.out.println("这是测试方法执行前执行");
    }

    @AfterMethod
    public void testCase4(){
        System.out.println("AfterMethod这是测试方法之后执行");
    }
}
