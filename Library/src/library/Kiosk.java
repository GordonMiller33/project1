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
        Book serial;   //A null book that is used to for its serial number in some command
        
        //ADD TRY CATCH BLOCK
        while(true) {
	        String userInput = sc.nextLine();
	        userCommand = userInput.split(",");
	
	        String curCommand = userCommand[0];
	        switch (curCommand){
	        case "A":
	            String title = userCommand[1];
	            Date date = new Date (userCommand[2]);
	            if(date.isValid()){
	            	curSerial++;
	                Book book = new Book(title, false, date, curSerial);
	                library.add(book);
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
	        	serial = new Book(null, false, null, Integer.parseInt(userCommand[1]));   
	        	if(library.remove(serial))
	        		System.out.println("Book#" + userCommand[1] + " removed.");
	        	else
	        		System.out.println("Unable to remove, the library does not have this book.");
	            break;
	        case "O" :
	        	serial = new Book(null, false, null, Integer.parseInt(userCommand[1]));
	        	if(library.checkOut(serial))
	        		System.out.println("You’ve checked out Book#" + userCommand[1] + ". Enjoy!");
	        	else
	        		System.out.println("Book#" + userCommand[1] +  " is not available.");
	            break;
	        case "I":
	        	serial = new Book(null, false, null, Integer.parseInt(userCommand[1]));
	        	if(library.returns(serial))
	        		System.out.println("Book#" + userCommand[1] +  " return has completed. Thanks!");
	        	else
	        		System.out.println("Unable to return Book#" + userCommand[1]);
	            break;
	        case "PA":
	        	library.print();
	            break;
	        case "PD":
	        	library.printByDate();
	            break;
	        case "PN":
	        	library.printByNumber();
	            break;
        }
        }  
    }
}
