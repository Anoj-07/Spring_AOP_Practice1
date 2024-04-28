package com.Aspect.AOP_Practice;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String Status){

        /* These are aspect =>
        * Logging
        * Authentication and Authorization
        * Sanitization the Data*/

        System.out.println("CheckOut Method from shopping cart called");
    }

    public int quantity(){
        return 2;
    }

}
