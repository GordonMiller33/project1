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
        this.year = Integer.parseInt(date.substring(6));
        this.day = Integer.parseInt(date.substring(3,4));
        this.month = Integer.parseInt(date.substring(0,1));
    }
    public Date() { //create an object with today's date (see Calendar class)
    	String todayString = Calendar.getInstance().getTime().toString();
    	int todayYear = Integer.parseInt(todayString.substring(24,28));
    	String todayMonthString = todayString.substring(4,7);
    	int todayMonth = -1;
    	switch (todayMonthString){
        case "Jan":
        	todayMonth = 1;
        case "Feb":
        	todayMonth = 2;
        case "Mar":
        	todayMonth = 3;
        case "Apr":
        	todayMonth = 4;
        case "May":
        	todayMonth = 5;
        case "Jun":
        	todayMonth = 6;
        case "Jul":
        	todayMonth = 7;
        case "Aug":
        	todayMonth = 8;
        case "Sep":
        	todayMonth = 9;
        case "Oct":
        	todayMonth = 10;
        case "Nov":
        	todayMonth = 11;
        case "Dec":
        	todayMonth = 12;
    	}
    	int todayDay = Integer.parseInt(todayString.substring(8,10));
    	
    	this.year = todayYear;
    	this.month = todayMonth;
    	this.day = todayDay;
    }
    
    public boolean isValid() { // Check my solution(From Gordon)
        Date today = new Date();
    	if ( this.year < 1900 || this.year > today.year)
            return false;
    	if( this.year == today.year && this.month > today.month )
    		return false;
    	if( this.year == today.year && this.month == today.month && this.day > today.day )
    		return false;
    	else
            return true;
    }
        
}
