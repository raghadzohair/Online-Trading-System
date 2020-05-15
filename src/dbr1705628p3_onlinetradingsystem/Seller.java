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
public class Seller extends Dealer{
    
    private int licenseNo;

    public Seller(int licenseNo, String company, int regNumber, boolean operational, int id, String name, String nationality, Date dateOfBirth, char gender, int phone, String address) {
        super(company, regNumber, operational, id, name, nationality, dateOfBirth, gender, phone, address);
        this.licenseNo = licenseNo;
    }
    

    public int getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Seller{" + "licenseNo=" + licenseNo + '}';
    }
    
    

    
}
