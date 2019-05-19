package kz.epam.pizza.contr;

public enum Ingredient {
    TOMATO_PASTE(1.0),CHEESE(1.0),
    SALAMI(1.5),BACON(1.2),
    GARLIC(0.3),CORN(0.7),
    PEPPOTENI(0.6),OLIVAES(0.5);
    private double price;
    Ingredient(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    
}
