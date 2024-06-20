package com.example.mykotlinapp;

public class gst extends IncomeTax{
    //String mobilephoneno;
    @Override
    int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = 1000;
        return  oldTax + newTax;
    }
}

//declaration  -- i will buy a car Student allen;
//instantiation -- nano car        allen = new Student();
//initialization  -- started ignition   allen.name = "allen"{
}
