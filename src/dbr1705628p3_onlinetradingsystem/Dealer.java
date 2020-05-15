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
public class Dealer extends Trader {
    
    private String company;   
    private int regNumber;
    private boolean operational;

    public Dealer(String company, int regNumber, boolean operational, int id, String name, String nationality, Date dateOfBirth, char gender, int phone, String address) {
        super(id, name, nationality, dateOfBirth, gender, phone, address);
        this.company = company;
        this.regNumber = regNumber;
        this.operational = operational;
    }
    

    public boolean isOpreational() {
        return operational;
    }

    public void setOpreational(boolean operational) {
        this.operational = operational;
    }


    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Dealer{" + "company=" + company + ", regNumber=" + regNumber + ", opreational=" + operational + '}';
    }
    
    

    
    
    

    
}
