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
    	System.out.println("finding");
    	int index = BOOK_NOT_FOUND;
        for (int i = 0; i < numBooks; i++){
        	System.out.println("book serial:" + book.getNumber() + "  checked serial:" + books[i].getNumber());
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
    		System.out.println("Book not found");
    		return false;
    	}
    	else {
    		System.out.println("index " + index);
    		for(int i = index; i < numBooks-1;i++) {
    			books[i] = books[i+1];
    		}
    		books[numBooks] = null;
    		numBooks--;
    		return true;
    	}
    }
    //public boolean checkOut(Book book) { }
    //public boolean returns(Book book) { }
    public void print() { 
    	for(int i = 0; i < numBooks;i++) {
    		System.out.println(this.books[i]);
    	}
    }
    public void printByDate() {
        Book tempBook;
        for(int i = 0; i<books.length; i++){
            for(int j = 1; j<books.length-1; j++){
                if(books[j-1].getNumber() > books[j].getNumber()){
                    tempBook = books[j-1];
                }
            }
        }
    }
    public void printByNumber() { 
        Book tempBook;
        for(int i = 0; i<books.length; i++){
            for(int j = 1; j<books.length-1; j++){
                if(books[j-1].getNumber() > books[j].getNumber()){
                    tempBook = books[j-1];
                }
            }
        }
    }
        
}
