package SystemDesign.LowLevelDesign.LibraryMangement;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library {
    
    private List<Book> bookList;
    private List<User> userList;
    private List<Book> borrowBookList;
    
    Library(){
        bookList = new ArrayList<>();
        userList = new ArrayList<>();
        borrowBookList = new ArrayList<>();
    }

    //Book Management
    public void addBook(Book book){
        bookList.add(book);
    }
    public void removeBook(Book book){
        bookList.remove(book);
    }
    public Book searchBook(String bookId){

        for(var book:bookList){
            if(book.bookId==bookId){
                System.out.println("BOOK AVAILABLE IN LIBRARY:");
                return book;
            }
        }

        System.out.println("BOOK NOT AVAILABLE IN LIBRARY");
        return null;
    }
    

    //User
    public void removeUser(User user){
        userList.remove(user);
    }
    public void addUser(User user){
        userList.add(user);
    }

    //borrowing
    public void borrowBook(String bookId,User user){
        Book book=searchBook(bookId);
        if(book!=null){
            book.setBorrowDate(LocalDateTime.now());
            user.setBorrowBookList(book);
            borrowBookList.add(book);
            System.out.println("BOOK BORROWED SUCCESSFULLY");
            return ;
        }
        
        System.out.println("BOOK NOT AVAILABLE FOR BORROW");

    }
    public void returnBook(String bookId, User user){
        // List<Book> borrowBookList=user.getBorrowBookList();

        for(var book:borrowBookList){
            if(bookId==book.bookId){
                borrowBookList.remove(book);
                user.removeBook(bookId);
                System.out.println(
                    "BOOK REMOVED SUCCESSFULLY"
                );
                return;
            }
        }

    }


    

}
