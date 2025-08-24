package SystemDesign.LowLevelDesign.LibraryMangement;

import java.time.LocalDateTime;

public class Book {
    String bookId;
    String bookName;
    LocalDateTime borrowDate;
    LocalDateTime returnDate;

    Book(String bookId,String bookName){
        this.bookId=bookId;
        this.bookName=bookName;
    }

    public void setBorrowDate(LocalDateTime borrowDate){
        this.borrowDate=borrowDate;
    }
    public LocalDateTime getBorrowDate(){
        return this.borrowDate;
    }

    public void setReturnDate(LocalDateTime returnDate){
        this.returnDate=returnDate;
    }
    public LocalDateTime getReturnDate(){
        return this.returnDate;
    }
}
