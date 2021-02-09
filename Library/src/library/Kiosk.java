/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Kiosk {
    Scanner sc = new Scanner(System.in);
    String[] userCommand;
    String[] validCommands = new String[4];
    Library library = new Library();
    int curSerial = 10000;
    public Kiosk (){    
        
    }
    // NOT SURE WHAT TO KEEP IN RUN AND WHAT TO SEPERATE OUT
    public void run(){
        System.out.println("Library Kiosk running");
        Date Today = new Date();
        
        //ADD TRY CATCH BLOCK
        while(true) {
	        String userInput = sc.nextLine();
	        userCommand = userInput.split(",");
	
	        String curCommand = userCommand[0];
	        switch (curCommand){
	        case "A":
	            String title = userCommand[1];
	            Date date = new Date (userCommand[2]);
	            curSerial++;
	            if(date.isValid()){
	                Book book = new Book(title, false, date, curSerial);
	                System.out.println(title + " added to library"); 
	            }
	            else
	                System.out.println("Invalid Date");
	            break;
	        case "Q":
	            System.out.println("Kiosk session ended");
	            System.exit(0);
	            break;
	        case "R" :
	            break;
	        case "O" :
	            break;
	        case "PA":
	            break;
	        case "PD":
	            break;
	        case "PN":
	            break;
        }
    }

        
    }
}
