package SystemDesign.LowLevelDesign.LibraryMangement;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class User {
    String userName;
    String userId;
    private List<Book> borrowBookList;
    
    User(String userName,String userId){
        this.userName=userName;
        this.userId=userId;
        this.borrowBookList=new ArrayList<>();
    }

    public void setBorrowBookList(Book book){
        borrowBookList.add(book);
    }
    public List<Book> getBorrowBookList(){
        return this.borrowBookList;
    }

    public void removeBook(String bookId){
        Random random = new Random();
        for(var result:borrowBookList){
            if(result.bookId==bookId){
                borrowBookList.remove(result);
                result.returnDate=result.borrowDate.plusDays(random.nextInt(10)+1);// This is for making return or borrow date different
                return;
            }
        }
    }

    public void UserBorrowList(){
        for(var book:borrowBookList){
            System.out.println(
                "BOOK ID:"+book.bookId+"\n"+
                "BOOK NAME:"+book.bookName+"\n"+
                "BOOK BORROW DATE:"+book.borrowDate+"\n"+
                "BOOK RETURN DATE:"+book.returnDate==null?"Not Returned":book.returnDate+"\n"
            );
        }
    }
}
