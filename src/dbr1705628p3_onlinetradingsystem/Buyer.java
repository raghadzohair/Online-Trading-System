/*
 * Name: Raghad Zohair. ID: 1705628
 * Section Number: DBR
 * Program3_OnlineTradingSystem.
 */
package dbr1705628p3_onlinetradingsystem;

import java.util.Date;

/**
 *
 * @author Raghad
 */
public class Buyer extends Trader{
    
    private int MAXIMUM_ALLOWED_ORDER=30;
    private int orderCounter;
    Order[] order;

    public Buyer(int id, String name, String nationality, Date dateOfBirth, char gender, int phone, String address) {
        super(id, name, nationality, dateOfBirth, gender, phone, address);
    }

    public Order[] getOrder() {
        return order;
    }
    
    public Order getOrder(int indx){
        return null;  
    }
    
    public StringBuilder inetilisOrder(int buyerId, int totlItem){
        order = new Order[MAXIMUM_ALLOWED_ORDER];
        order [orderCounter] =new Order("inProgress",totlItem);
        int orderId = order[orderCounter].getOrderId();
        orderCounter++;
        return new StringBuilder ("The order of buyer with id : "+buyerId+" has been initialized with number : "+(orderId+orderCounter));
        
    }
    
}
