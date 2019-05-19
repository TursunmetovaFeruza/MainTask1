package kz.epam.pizza.contr;

import java.util.Arrays;
import kz.epam.pizza.valid.NameValid;

public class Pizza {
    private Client client;
    private Order order;
    private String pizzaName;
    private boolean pizzaType;
    private int pizzaCount;
    private NameValid valideName=new NameValid();
    private Ingredient[] ingredients=new Ingredient[7];
    private int x;
    public Pizza(Client client,String pizzaName,boolean pizzaType,int pizzaCount,Order order){
        this.pizzaType= pizzaType;
        this.pizzaCount=pizzaCount;
        if(valideName.valideName(pizzaName)){
            this.pizzaName=pizzaName;
        }else{
            this.pizzaName=client.getClientName()+"_"+order.getPizzaNum();//добавить номер пиццы по заказу
        }

        this.client=client;
    }

    public boolean getType(){
        return pizzaType;
    }
    public int getCount(){
        return pizzaCount;
    }
    public String getName(){
        return pizzaName;
    }
    public int getOrderId(){
        return x;
    }
    
    public void addIngredient(Ingredient ingredient,int n){
        int i=0;boolean z = true;
        while(z){
            if(ingredients[i]!=ingredient&&ingredients[i]==null){
                ingredients[i]=ingredient;
                z=false;  
            }
            i++;
        }  
        
        
    }
     public Ingredient[] getIngredirnts(){
        
        return ingredients;
    }
    
      
}
