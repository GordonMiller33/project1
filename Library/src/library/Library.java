/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Me
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    private Book[] books = new Book[4];   //array-based implementation of the bag data struct
    private int numBooks = 0;   // the number of books currently in the bag
    private final int BOOK_NOT_FOUND = -1;
    
    public Library() { } // default constructor to create an empty bag
    
    private int find(Book book) {    //helper method to find a book in the bag
    	int index = BOOK_NOT_FOUND;
        for (int i = 0; i < numBooks; i++){
            if (books[i].getNumber() == book.getNumber()){
                index = i;
                break;
            }
        }
        return index;
    } 
    private void grow() {
        Book[] tempBag = new Book[numBooks + 4];
        int length = books.length + 4;
        //System.arraycopy(books, 0, tempBag, 0, length); cant do this
        for(int i = 0; i<books.length; i++){
        	tempBag[i] = books[i];
        }
        books = tempBag;
        
    }
    public void add(Book book) {
        if (books.length == numBooks)
            grow();
        books[numBooks] = book;
        numBooks +=1;
    }
    public boolean remove(Book book) { 
    	int index = find(book);
    	if(index == BOOK_NOT_FOUND) {
    		return false;
    	}
    	else {
    		for(int i = index; i < numBooks-1;i++) {
    			books[i] = books[i+1];
    		}
    		books[numBooks] = null;
    		numBooks--;
    		return true;
    	}
    }
    public boolean checkOut(Book book) { 
    	int index = find(book);
    	if(index == BOOK_NOT_FOUND) {
    		return false;
    	}
    	else if(books[index].getCheckedOut()){
    		return false;
    	}
    	else {
    		books[index].setCheckedOut(true);
    		return true;
    	}
    }
    public boolean returns(Book book) { 
    	int index = find(book);
    	if(index == BOOK_NOT_FOUND) {
    		return false;
    	}
    	else if(!(books[index].getCheckedOut())){
    		return false;
    	}
    	else {
    		books[index].setCheckedOut(false);
    		return true;
    	}
    }
    public void print() { 
    	if(numBooks == 0) 
    		System.out.println("Library catalog is empty!");
    	else
    		for(int i = 0; i < numBooks;i++) 
    			System.out.println(this.books[i]);
    }
    public void printByDate() {
    	if(numBooks == 0) 
    		System.out.println("Library catalog is empty!");
        else {
            for(int i = 0; i < numBooks - 1; i++){
                for(int j = 0; j < numBooks - i - 1; j++){
                    if(compareDates(books[j].getDate(), books[j+1].getDate())){
                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
            this.print();
        }
    }
    
    public void printByNumber() {
    	if(numBooks == 0) 
    		System.out.println("Library catalog is empty!");
    	else {
            for(int i = 0; i < numBooks - 1; i++){
                for(int j = 0; j < numBooks - i - 1; j++){
                    if(books[j].getNumber() > books[j + 1].getNumber()){
                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
            this.print();
        }
    }
    
    private boolean compareDates(Date date1, Date date2) {
    	int date1Value = date1.getYear()*10000 + date1.getMonth()*100 + date1.getDay();
    	int date2Value = date2.getYear()*10000 + date2.getMonth()*100 + date2.getDay();
    	return (date1Value > date2Value);
    }
 	}
    
    //private int dateToInt()
