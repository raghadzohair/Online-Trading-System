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
public class LogisticPartner extends Dealer {
    
    private double ratePerKG;

    public LogisticPartner(double ratePerKG, String company, int regNumber, boolean operational, int id, String name, String nationality, Date dateOfBirth, char gender, int phone, String address) {
        super(company, regNumber, operational, id, name, nationality, dateOfBirth, gender, phone, address);
        this.ratePerKG = ratePerKG;
    }
    

    public double getRatePerKG() {
        return ratePerKG;
    }

    public void setRatePerKG(double ratePerKG) {
        this.ratePerKG = ratePerKG;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"LogisticPartner{" + "ratePerKG=" + ratePerKG + '}';
    }
    
    

    
}
