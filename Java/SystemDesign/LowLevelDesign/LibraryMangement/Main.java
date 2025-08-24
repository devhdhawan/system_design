package SystemDesign.LowLevelDesign.LibraryMangement;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Himanshu","123");
        User user2 = new User("Tanya","456");
        User user3 = new User("Abhishek","789");

        Book book1 = new Book("123abc","Design Data Intensive Application");
        Book book2 = new Book("456abc","Design Patterns");
        Book book3 = new Book("123def","Data Structure and Algorithms");
        Book book4 = new Book("12abc3","Learn Python the hard way");

        Library obj = new Library();
        obj.addUser(user1);
        obj.addUser(user2);
        obj.addUser(user3);

        obj.addBook(book1);
        obj.addBook(book2);
        obj.addBook(book3);
        obj.addBook(book4);

        obj.searchBook("123abc");

        obj.borrowBook("456abc",user2);
        user2.UserBorrowList();



    }
}
