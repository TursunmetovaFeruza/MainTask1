package kz.epam.pizza.prices;
import kz.epam.pizza.contr.Ingredient;
import kz.epam.pizza.contr.Pizza;

public class PriceCounter {
    
    public double Prices(Pizza pizza){
        double orderPrice=0;
        boolean z=pizza.getType();
        if (z) {
            orderPrice=1.0;
        }else{
            orderPrice=1.5;
        }
        for (Ingredient ingredient:pizza.getIngredirnts()) {
        if(ingredient!=null){
            orderPrice+=ingredient.getPrice();
            }    
        }
        return orderPrice;
    }

    
}
