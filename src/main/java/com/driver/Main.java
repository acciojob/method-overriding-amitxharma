package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args)
    {
        B obj =new B();
        String result1 = obj.meth();
        String result2 = ((A)obj).meth();
    }
}