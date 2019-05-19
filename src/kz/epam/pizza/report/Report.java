package kz.epam.pizza.report;

import kz.epam.pizza.contr.Client;
import kz.epam.pizza.contr.Ingredient;
import kz.epam.pizza.contr.Order;
import kz.epam.pizza.contr.Pizza;
import kz.epam.pizza.prices.PriceCounter;


public class Report {
private double typePrice;
private String type;


    public void Check(int orderId,int clientId,double price,Pizza[] pizzas){
        String format = "%-28s%s%n";
        int i=0;double summ=0;
        String x="********************************";
        String y="--------------------------------";
        System.out.println(x);
        System.out.println("Order: 1000"+orderId);
        System.out.println("Client: "+clientId);
        while (i!=2) {
        boolean z=pizzas[i].getType();
        if (z) {
         type="Pizza Base (Calzone)";
         typePrice=1.5;
        }else{
         type="Pizza Base";
         typePrice=1.0;
        }
        System.out.println("Pizza name: "+pizzas[i].getName());
        System.out.println(y);
        System.out.printf(format,type,typePrice);
        for (Ingredient ingredient:pizzas[i].getIngredirnts()) {
            if(ingredient!=null){
                System.out.printf(format, ingredient, ingredient.getPrice());
            }
        }
        System.out.println(y);
        System.out.printf(format,"Total price:",price);
        System.out.printf(format,"Count:",pizzas[i].getCount());
        System.out.println(y);
        summ +=price*pizzas[i].getCount();
        i++;
    }
        System.out.printf(format,"Sum total",summ);
        System.out.println(x);
    }
    
}
