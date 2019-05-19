package kz.epam.pizza;

import kz.epam.pizza.contr.Client;
import kz.epam.pizza.contr.Ingredient;
import kz.epam.pizza.contr.Order;
import kz.epam.pizza.contr.Pizza;
import kz.epam.pizza.prices.PriceCounter;
import kz.epam.pizza.report.Report;

public class MainClass {
    
       public static void main(String[] args) {
           //First client
           Client client1=new Client( 7717 ,"Madlen");
           Order order1=new Order(1,client1.getClientId());
           Pizza pizza=new Pizza(client1,"Margarita",true,2,order1);
           Pizza pizza2= new Pizza(client1,"PepperoniOro",false,3,order1);
           //Chose ingredient for first pizza
           pizza.addIngredient(Ingredient.TOMATO_PASTE,0);
           pizza.addIngredient(Ingredient.GARLIC,1);
           pizza.addIngredient(Ingredient.PEPPOTENI,2);
           pizza.addIngredient(Ingredient.BACON,3);
           //Chose ingredient for second pizza
           pizza2.addIngredient(Ingredient.CHEESE,4);
           pizza2.addIngredient(Ingredient.TOMATO_PASTE,0);
           pizza2.addIngredient(Ingredient.OLIVAES,6);
           pizza2.addIngredient(Ingredient.SALAMI,5);
           //Make order
           order1.addPizza(pizza);
           order1.addPizza(pizza2);
           //price
           PriceCounter price=new PriceCounter();
           Report report=new Report();
           report.Check(order1.getOrderId(),client1.getClientId(),price.Prices(pizza),order1.getPizzaArray());
           //Second client
           Client client2=new Client( 4372 ,"Kozetta");
           Order order2=new Order(2,client2.getClientId());
           Pizza pizzaBase=new Pizza(client2,"BasePZZ",false,12,order2);
           //Chose ingredient for first pizza
           pizzaBase.addIngredient(Ingredient.CHEESE,4);
           pizzaBase.addIngredient(Ingredient.TOMATO_PASTE,0);
           pizzaBase.addIngredient(Ingredient.OLIVAES,6);
           pizzaBase.addIngredient(Ingredient.SALAMI,5);
           //Make order
           order2.addPizza(pizzaBase);
           //price
           PriceCounter price2=new PriceCounter();
           Report report2=new Report();
           report2.Check(order2.getOrderId(),client2.getClientId(),price2.Prices(pizza),order2.getPizzaArray());
       }

   
}
