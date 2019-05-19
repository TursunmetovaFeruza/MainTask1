package kz.epam.pizza.contr;

import javax.swing.JOptionPane;
import java.awt.Component;
public class Order {
  private static final int PIZZA_COUNT=10;
  private int orderId;
  private int clientId;
  private Pizza[] pizzas=new Pizza[PIZZA_COUNT];
  public Order(int orderId,int clientId){
      this.clientId=clientId;
      this.orderId=orderId;
  }

   public String getPizzaNum(){
      int index=0;
      if(pizzas==null){
        index=pizzas.length-10+1;   
       }else{
        index=pizzas.length-10+2;
      }
       return String.valueOf(index);
   }
  public Pizza[] getPizzaArray(){
      return pizzas;
  }
  
  public int getOrderId(){
      return orderId;
  }

  public void addPizza(Pizza p){
      boolean c=true;int i=0;
      while(c){
          if(pizzas[i]==null){
              pizzas[i]=p; 
              c=false;
          }
          if(pizzas[i].getCount()>10){
              Component frame = null;
              JOptionPane.showMessageDialog(frame, "The maximum amount of pizza to order is 10");
              System.exit(0);
          }
          i++;
          
      }
  }
  public void deletePizza(int n){
      boolean c=true;int i=0;
      while(c){
          if(i==n){
              pizzas[i]=null; 
              c=false;
          }
          i++;
      }
  }
  
  
}
