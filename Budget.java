package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by michael on 11/24/16.
 */
public class Budget {
    double balance;
    Map<String, Category> categoryMap;

    Budget(double amount, Category[] spendingCategories){
        this.balance = amount;
        categoryMap = new HashMap<>();
        for(int i = 0; i < spendingCategories.length; i++){
            categoryMap.put(spendingCategories[i].name, spendingCategories[i]);
        }
    }

    public void spendEvent(double purchaseAmount, String category){
        if(categoryMap.containsKey(category)){
            Category cat = categoryMap.get(category);
            if((cat.amountSpent + purchaseAmount) > cat.spendingLimit){
                System.out.println("You spent " + purchaseAmount + " on " + category);
                alert();
                cat.amountSpent += purchaseAmount;
                balance -= purchaseAmount;
            }
            else{
                System.out.println("You spent " + purchaseAmount + " on " + category);
                cat.amountSpent += purchaseAmount;
                balance -= purchaseAmount;
            }
        }
        else{
            System.out.println("Not a valid category!");
        }
    }

    public void alert(){
        System.out.println("You've exceeded the spending limit in this category!");
    }
}
