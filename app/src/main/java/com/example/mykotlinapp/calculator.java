package com.example.mykotlinapp;

import junit.framework.TestCase;
public class calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return  a*b;
    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        calculator = new Calculator(); //initzn
    }


    public void testAdd() {
        int expected = 40;
        int actual = calculator.add(10,20);
        assertEquals(expected,actual);
    }

    public  void testMul(){
        int exp = 20;
        int act = calculator.multiply(5,4);
        assertEquals(exp,act);
    }


    //ondestroy

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
}

