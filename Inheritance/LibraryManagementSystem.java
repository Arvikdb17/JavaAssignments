package LibraryManagementSystem;

import java.util.List;

public class LibraryManagementSystem {
    String userType;
    String userName;
    String password;
    void login(){}
    void register(){}
    void logout(){}
}
class User extends LibraryManagementSystem{
 String user;
 int id;
 Account account;
 List<Book> bookList;
 void verify(){}
 void checkAccount(){}
 void get_book_info(){}

}
class Account extends User{
    int no_of_borrowedBooks;
    int no_of_reservedBooks;
    int no_of_returnedBooks;
    int no_of_LostBooks;
    double fineAmount;
    double calculateFine(){
        return 0;
    }
}
class Staff extends User{
  String dept;
}
class Student extends User{
    String className;
}
class Book extends LibraryManagementSystem{
   String title;
   String author;
   String isbn;
   String publication;
   Librarian librarian;
   List<User> userList;
   void show_dueDT(){}
   void reservationStatus(){}
   void feedback(){}
   void bookRequest(){}
   void renewInfo(){}
}

class Librarian extends LibraryManagementSystem{
  String name;
  int id;
  String password;
  String searchString;
  List<Book> bookList;
  LibraryDatabase libraryDatabase;
  void verifyLibrarian(){}
  void search(){}

}
class LibraryDatabase{
    List<Book> bookList;
    Librarian librarian;
    void add(){}
    void delete(){}
    void update(){}
    void display(){}
    void search(){}

}
