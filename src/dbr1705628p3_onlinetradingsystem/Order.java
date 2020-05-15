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
public class Order {
    
    private static int ordeCounter;
    private String orderDesc;
    private String itemCounter;
    private Item[] items;
    private int orderId =100;
    private String weightOfPackageInKG;
    private LogisticPartner logisticPartner;
    private Date orderDate;

    public Order(String orderDesc, int totlItem) {
        this.orderDesc = orderDesc;
    }

    
    public Date getOrderDate() {
        return orderDate;
    }
    

    public LogisticPartner getLogisticPartner() {
        return logisticPartner;
    }

    public void setLogisticPartner(LogisticPartner logisticPartner) {
        this.logisticPartner = logisticPartner;
    }
    

    public String getWeightOfPackageInKG() {
        return weightOfPackageInKG;
    }

    public void setWeightOfPackageInKG(String weightOfPackageInKG) {
        this.weightOfPackageInKG = weightOfPackageInKG;
    }

    public int getOrderId() {
        return orderId;
    }


    public Item[] getItems() {
        return items;
    }
    
    public void addItem(Item item){
        
    }
    

    public String getItemCounter() {
        return itemCounter;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }


    public static int getOrdeCounter() {
        return ordeCounter;
    }

}
