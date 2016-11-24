package com.company;

/**
 * Created by michael on 11/24/16.
 */
public class Category {
    String name;
    double spendingLimit;
    double amountSpent;

    Category(String name, double amount){
        this.name = name;
        this.spendingLimit = amount;
        this.amountSpent = 0;
    }
}
