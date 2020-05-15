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
public class Trader {
    
    private int id;
    private String name;
    private String nationality;
    private Date dateOfBirth;   
    private char gender;    
    private int phone; 
    private String address;
    private Date regDate;

    public Trader(int id, String name, String nationality, Date dateOfBirth, char gender, int phone, String address) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    
    

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    @Override
    public String toString() {
        return "Trader{" + "Id=" + id + ", name=" + name + ", nationality=" + nationality + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", phone=" + phone + ", address=" + address + ", regDate=" + regDate + '}';
    }
    
    

    
}
