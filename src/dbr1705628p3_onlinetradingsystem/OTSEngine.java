/*
 * Name: Raghad Zohair. ID: 1705628
 * Section Number: DBR
 * Program3_OnlineTradingSystem.
 */
package dbr1705628p3_onlinetradingsystem;

/**
 *
 * @author Raghad
 */
import java.util.Date;

public class OTSEngine {

    private Item[] items;
    private Buyer[] buyers;
    private Seller[] sellers;
    private LogisticPartner[] logisticPartners;
    private int itemCounter;
    private int buyersCounter;
    private int sellersCounter;
    private int logisticPartnersCounter;

    public OTSEngine(int numberOfItems, int numberOfBuyers, int numberOfSellers, int numberOflogisticPartner) {
        this.items = new Item[numberOfItems];
        this.buyers = new Buyer[numberOfBuyers];
        this.sellers = new Seller[numberOfSellers];
        this.logisticPartners = new LogisticPartner[numberOflogisticPartner];
    }

    public StringBuilder addItem(int itemId, String itemName, double price, int inStock, int sellerId) {
        StringBuilder message = new StringBuilder();
        // check if number of items < 30 
        Seller owner =null;
        if(itemCounter<items.length){
            for(int i=0; i<sellersCounter;i++){
                if(sellers[i].getId()==sellerId){
                    owner = sellers[i];
                    break;
                }
            }
            for (int j = 0; j < items.length; j++) {
                // check if array is null and add ID if null                
                if (items[j] == null) {                    
                    items[itemCounter] = new Item(itemId, itemName,price,owner,inStock);
                    message = new StringBuilder("The item : " + itemId + " has been added to the System\r\n");
                    itemCounter++;
                    break;
                }
                // check if ID of buyer is exsisting 
                if(items[j] != null && items[j].getItemId()==itemId){
                    message = new StringBuilder("The item : " + itemId + "  already exists\r\n");
                    break;
                }
            }               
        }
        return message;
    }

    public StringBuilder addSeller(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, int licenseNo, String company, int regNumber,boolean operational, int phone, String address) {
        StringBuilder message = new StringBuilder();
        // check if number of seller < 30 
        if(sellersCounter<sellers.length){            
            for (int i = 0; i < sellers.length; i++) {
                // check if array is null and add ID if null                
                if (sellers[i] == null) {
                    sellers[sellersCounter] = new Seller(licenseNo, company, regNumber, operational, id, name, nationality, dateOfBirth, gender, phone, address);
                    message = new StringBuilder("The seller with id : " + id + " has been added to the System\r\n");
                    sellersCounter++;
                    break;
                }
                // check if ID of seller is exsisting 
                if(sellers[i] != null && sellers[i].getId()==id){
                    message = new StringBuilder("The seller with id : " + id + "  already exists\r\n");
                    break;
                }
            }               
        }
        return message;
    }

    public StringBuilder addBuyer(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, int phone, String address) {
       StringBuilder message = new StringBuilder();
        // check if number of buyer < 30 
        if(buyersCounter<buyers.length){            
            for (int i = 0; i < buyers.length; i++) {
                // check if array is null and add ID if null                
                if (buyers[i] == null) {
                    buyers[buyersCounter] = new Buyer(id, name, nationality,dateOfBirth,gender, phone, address);
                    message = new StringBuilder("The buyer with id : " + id + " has been added to the System\r\n");
                    buyersCounter++;
                    break;
                }
                // check if ID of buyer is exsisting 
                if(buyers[i] != null && buyers[i].getId()==id){
                    message = new StringBuilder("The buyer with id : " + id + "  already exists\r\n");
                    break;
                }
            }               
        }
        return message;
    }

    public StringBuilder addLogisticPartner(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, String company, int regNumber, boolean operational, double ratePerKG, int phone, String address) {
        StringBuilder message = new StringBuilder();
        // check if number of logistic < 30 
        if(logisticPartnersCounter<logisticPartners.length){            
            for (int i = 0; i < logisticPartners.length; i++) {
                // check if array is null and add ID if null                
                if (logisticPartners[i] == null) {
                    logisticPartners[logisticPartnersCounter] = new LogisticPartner(ratePerKG, company, regNumber, operational, id, name, nationality, dateOfBirth, gender, phone, address);
                    message = new StringBuilder("The LogisticPartner with id : " + id + " has been added to the System\r\n");
                    logisticPartnersCounter++;
                    break;
                }
                // check if ID of logistic is exsisting 
                if(logisticPartners[i] != null && logisticPartners[i].getId()==id){
                    message = new StringBuilder("The Logistic Partner with id : " + id + "  already exists\r\n");
                    break;
                }
            }               
        }
        return message;
    }

    public StringBuilder initializeOrder(int buyerId, int totItem) {
        
        StringBuilder message = new StringBuilder();   
        Buyer id =null;
        int i;
        for( i=0;i< buyersCounter;i++){
            if(buyers[i].getId()==buyerId){
               id = buyers[i];               
               break;
            }
        }
        if(id !=null){
           message = new StringBuilder (buyers[i].inetilisOrder(buyerId, totItem));
        }
        else
            message =new StringBuilder("There is no buyer with id : "+buyerId);
       
       return message ;
    }

    public StringBuilder addItemToOrder(int orderId, int buyerId, int itemId) {
        StringBuilder message = new StringBuilder();    
        Buyer bId=null;
        Item iId =null;
        for(int i=0;i< buyersCounter;i++){
            if(buyers[i].getId()==buyerId){
               bId = buyers[i];
               break;
            }
        }
        for(int j =0; j<itemCounter;j++){
            if(items[j].getItemId()==itemId){
               iId = items[j];               
               break;
            }
        }
        if(bId==null){
            message = new StringBuilder("There is no buyer with id: "+buyerId+"\r\n");
        }
        if(iId==null){
            message =new StringBuilder("The item with id "+itemId+" is not in the system \r\n");
        }
        if(bId!=null && iId !=null ){
            message =new StringBuilder("The item with id : "+itemId+" has been added to the orderId: "+orderId+"\r\n");
            
        }
        
       return message;
    }

    public StringBuilder associateLogisticPartnerToOrder(int orderId, int logisticPartnerId, double weightOfPackageInKG) {
        StringBuilder message = new StringBuilder(); 
        LogisticPartner lgId =null;
        for(int i=0;i<logisticPartnersCounter;i++){
            if(logisticPartners[i].getId()==logisticPartnerId){
                lgId = logisticPartners[i];
                break;
            }
        }
        if(lgId==null){
            message =new StringBuilder("There is no logisticPartner with id "+logisticPartnerId);
        }
        else{
            message =new StringBuilder("The order with id "+orderId+"  has been shipped by the logistic Partner "+logisticPartnerId);
        }

        return message;
    }

    public StringBuilder updateOrderStatus(int orderId, String orderDesc) {
 /*
        boolean chekId =false;
        for(int i =0; i<buyersCounter;i++){
            if(buyers[i].order[i].getOrderId()==orderId){
                chekId =true;
                break;               
            }
        }
        if(chekId){
            return new StringBuilder("The status of the order with id "+orderId+" has been chanaged to "+orderDesc);
        }
        else{
            return new StringBuilder("There is no order with id "+orderId);
        }
*/
 return new StringBuilder("");

    }

    public StringBuilder printOrderOfBuyer(int buyerId, int orderId) {
        StringBuilder results = new StringBuilder();
        int i;
        for( i=0 ;i<buyersCounter;i++){
            if(buyerId==buyers[i].getId()){
                break;
            }
        }
        results =new StringBuilder("\r\nOrderId : "+orderId+"\r\nOrder date : "+buyers[i].getDateOfBirth().toString()+
                "\r\nBuyer Id :\t"+buyers[i].getId()+"\t\tBuyer name :\t"+buyers[i].getName()+"\r\nSeller Id :\t");
        results.append("\r\n------------------------------------------------------------------------------------------------------------");
        
        return results;
    }

    public StringBuilder printSpecificItemsForSeller(int sellerId) {
        StringBuilder results = new StringBuilder();
        for(int i=0;i<sellersCounter;i++){
            if(sellerId==sellers[i].getId()){
                results = new StringBuilder("\r\nSeller Id :\t\t\t" + sellers[i].getId() + "\t\t\tSeller name :\t\t\t" + sellers[i].getName()
                        + "\r\n------------------------------------------------------------------------------------------------------------\r\n"
                        + " ItemIdt\t\t\tItem name\t\t\tIn stock\t\t\tPrice\r\n"
                        + "------------------------------------------------------------------------------------------------------------");
                break;
            }
           
        }
      
        return results.append("\n");
    }

    public StringBuilder printTransactionsOfSeller(int sellerId) {
        StringBuilder results = new StringBuilder();
       
        return results;
    }

    public StringBuilder printTransactionsOfBuyer(int buyerId) {
        StringBuilder results = new StringBuilder();
       
        return results;
    }
}