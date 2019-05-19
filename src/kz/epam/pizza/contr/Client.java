package kz.epam.pizza.contr;

public class Client {
     int clientId;
     String clientName;
    public Client (int clientId,String clientName){
        this.clientId=clientId;
        this.clientName=clientName;
    }

    public int getClientId(){
        return clientId;
    }
    public String getClientName(){
        return clientName;
    }
}
