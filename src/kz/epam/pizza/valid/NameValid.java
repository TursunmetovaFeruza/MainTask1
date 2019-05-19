package kz.epam.pizza.valid;

public class NameValid {
      private static final int MAX_LENGTH=20,MIN_LENGTH=4;
    public boolean valideName(String name){
        char n[]=name.toCharArray();
        if(n.length>=MIN_LENGTH && n.length<=MAX_LENGTH){
        return true;
        }else{
          return false;
        }
    }
}
