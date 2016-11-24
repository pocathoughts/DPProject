package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        //Make new spending categories
        Category cat1 = new Category("Food", 20.00);
        Category cat2 = new Category("Entertainment", 20.00);
        //Make category array for budget
        Category[] catArray = {cat1, cat2};
        //Create Budget
        Budget budget = new Budget(200, catArray);

        //Now we have a budget, let's go shopping
        double apples = 2.00;
        double steak = 10.00;
        double bagOfRice = 10.00;
        double beans = 5.00;
        double movieTicket = 12.00;
        double bumperCarts = 10.00;

        //Let's buy 3 apples
        for(int i = 0; i < 3; i++){
            budget.spendEvent(apples, "Food");
        }

        //Let's Buy a steak
        budget.spendEvent(steak, "Food");

      /*Let's buy another steak (Should trigger an alert this time because
        we are about to spend over our 20.00 food limit)
      */
        budget.spendEvent(steak, "Food");

        //Let's buy 2 movie tickets. One for us and one for our hot date
        for(int i = 0; i < 2; i++){
            budget.spendEvent(movieTicket, "Entertainment");
        }
    }
}
