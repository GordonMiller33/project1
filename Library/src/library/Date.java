/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.lang.Integer;
import java.util.Calendar;

/**
 *
 * @author Me
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(String date) { 
    	String[] dateParts = date.split("/");
    	System.out.println(dateParts[1]);
        this.year = Integer.parseInt(dateParts[2]);
    	this.day = Integer.parseInt(dateParts[1]);
        this.month = Integer.parseInt(dateParts[0]);
    }
    public Date() { 
    	String todayString = Calendar.getInstance().getTime().toString();
    	int todayYear = Integer.parseInt(todayString.substring(24,28));
    	String todayMonthString = todayString.substring(4,7);
    	int todayMonth = -1;
    	switch (todayMonthString){
        case "Jan":
        	todayMonth = 1;
        	break;
        case "Feb":
        	todayMonth = 2;
        	break;
        case "Mar":
        	todayMonth = 3;
        	break;
        case "Apr":
        	todayMonth = 4;
        	break;
        case "May":
        	todayMonth = 5;
        	break;
        case "Jun":
        	todayMonth = 6;
        	break;
        case "Jul":
        	todayMonth = 7;
        	break;
        case "Aug":
        	todayMonth = 8;
        	break;
        case "Sep":
        	todayMonth = 9;
        	break;
        case "Oct":
        	todayMonth = 10;
        	break;
        case "Nov":
        	todayMonth = 11;
        	break;
        case "Dec":
        	todayMonth = 12;
        	break;
    	}
    	int todayDay = Integer.parseInt(todayString.substring(8,10));
    	
    	this.year = todayYear;
    	this.month = todayMonth;
    	this.day = todayDay;
    }
    
    public boolean isValid() { 
    	
        Date today = new Date();
    	if ( this.year < 1900 || this.year > today.year)
            return false;
    	else if( this.year == today.year && this.month > today.month ) {
    		return false;
    	}
    	else if( this.year == today.year && this.month == today.month && this.day > today.day )
    		return false;
    	else
            return true;
    }
    
    
    public int getYear() {
    	return this.year;
    }
    
    public int getMonth() {
    	return this.month;
    }
    
    public int getDay() {
    	return this.day;
    }
        
}
