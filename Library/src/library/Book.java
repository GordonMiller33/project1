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
    private String number; //a 5-digit serial number unique to the book
    private String name; 
    private boolean checkedOut;
    private Date datePublished;
    
    public Book (String name, boolean checkOut, Date date, int number){ 
        this.number = String.valueOf(number);
        this.name = name;
        this.checkedOut = checkOut;
        this.datePublished = date;
        updateNumber();
    }
    
    private void updateNumber(){
        int tempNumber = Integer.parseInt(number);
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
        String checkOutStatus = "is not available";
        if (checkedOut == false)	
            checkOutStatus = "is available";
        tempBookDetails = "Book#" + this.number + "::" + this.name + "::" + this.datePublished.getMonth() + "/" 
        		+ this.datePublished.getDay() + "/" + this.datePublished.getYear() + "::" + checkOutStatus + ".";
        return tempBookDetails;
    }
    public int getNumber(){
        return Integer.parseInt(this.number);
    }
    public Date getDate(){
        return this.datePublished;
    }
    public boolean getCheckedOut() {
    	return this.checkedOut;
    }
    public void setCheckedOut(boolean status) {
    	this.checkedOut = status;
    }
}
