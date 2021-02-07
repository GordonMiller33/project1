/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.lang.Integer;
/**
 *
 * @author Me
 */
public class Book {
    private String number = "10001"; //a 5-digit serial number unique to the book
    private String name; 
    private boolean checkedOut;
    private Date datePublished;
    
    public Book (String name, boolean checkOut, Date date){ 
        this.number = number;
        this.name = name;
        this.checkedOut = checkOut;
        this.datePublished = date;
        updateNumber();
    }
    
    private void updateNumber(){
        int tempNumber = Integer.parseInt(number + 1);
        number = Integer.toString(tempNumber);
    }
    
    //@Override
    public boolean equals(Object obj) { //NEEDS REAL SOLUTION
        if (this.number == obj)
            return true;
        return false;
    }
    //@Override
    public String toString() { 
        String tempBookDetails;
        String checkOutStatus = "is available.";
        if (checkedOut == false)
            checkOutStatus = "is not available.";
        tempBookDetails = "Book#" + this.number + "::" + this.name + "::" + 
                           checkOutStatus + ".";
        return tempBookDetails;
    }
    public int getNumber(){
        return Integer.parseInt(this.number);
    }
    public Date getDate(){
        return this.datePublished;
    }
}
