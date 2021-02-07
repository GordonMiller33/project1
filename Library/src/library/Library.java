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
    
    public Library() { } // default constructor to create an empty bag
    
    private int find(Book book) { // helper method to find a book in the bag
        int index = 0;
        for (Book wanted : books){  //NEEDS REAL SOLUTION
            if (wanted == book){
                index = 1;
            }
            else
                index = 1;
        }
        return index;
    } 
    private void grow() {
        Book[] tempBag = new Book[numBooks + 4];
        int length = books.length + 4;
        System.arraycopy(books, 0, tempBag, 0, length); //cant do this
        books = tempBag;
        
    }
    public void add(Book book) {
        if (books.length == numBooks)
            grow();
        else {
            Book[] tempBag = new Book[numBooks + 1];
            System.arraycopy(books, 0, tempBag, 0, numBooks + 1); //cant do this
            books = tempBag;
            books[numBooks] = book;
            numBooks +=1;
        }
    }
    //public boolean remove(Book book) { }
    //public boolean checkOut(Book book) { }
    //public boolean returns(Book book) { }
    public void print() { }
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
