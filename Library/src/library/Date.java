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
public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(String date) { 
        this.year = Integer.parseInt(date.substring(6));
        this.day = Integer.parseInt(date.substring(3,4));
        this.month = Integer.parseInt(date.substring(0,1));
    }
    public Date() { } //create an object with today's date (see Calendar class)
    
    public boolean isValid() { //NEEDS REAL SOLUTION
        if ( this.year < 1900 )
            return false;
        else
            return true;
    }
        
}
