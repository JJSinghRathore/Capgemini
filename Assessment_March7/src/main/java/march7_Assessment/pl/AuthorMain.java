package march7_Assessment.pl;

import march7_Assessment.bean.Author;
import march7_Assessment.bean.Book;
import march7_Assessment.dao.LibraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorMain {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManagement lm = new LibraryManagement();
        List<Book> book = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Create Author");
            System.out.println("2. Read Author");
            System.out.println("3. Update Author");
            System.out.println("4. Delete Author");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Author ID: ");
                    int empid = sc.nextInt();
                    System.out.println("Enter Author name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter email: ");
                    String email = sc.nextLine();
                    Author author = new Author(empid, name, email);

                    System.out.println("Books: ");
//                    Book book=new Book();
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter Book ID: ");
                        int bookid = sc.nextInt();
                        System.out.println("Enter Book name: ");
                        String bookname = sc.nextLine();
                        System.out.println("Enter Book price: ");
                        int bookprice = sc.nextInt();
                        book.add(new Book(bookid, bookname, bookprice));

                    }
//                    author.setBook(book);
                    lm.createAuthor(author, book);
                    break;
                case 2:
                    System.out.println("Enter author id: ");
                    int aId = sc.nextInt();
                    if (aId != 0) {
                        System.out.println(lm.readAuthor(aId));
                    } else {
                        System.out.println("author id is not valid");
                    }
                    break;
                case 3:
                    Book b = new Book();
                    System.out.println("Enter book id: ");
                    int bookId = sc.nextInt();
                    if (bookId != 0) {
                        System.out.println("Enter new Book price: ");
                        b.setPrice(sc.nextInt());
                    } else {
                        System.out.println("Invalid ");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Id of the Author: ");
                    int delA = sc.nextInt();
                    if (delA != 0) {
                        System.out.println(lm.deleteAuthor(delA));
                    } else {
                        System.out.println("Invalid ");
                    }
                    break;
                case 5:
                    System.out.println("Enter the Id of the Book: ");
                    int delId = sc.nextInt();
                    if (delId != 0) {
                        System.out.println(lm.deleteBook(delId));
                    } else {
                        System.out.println("Invalid ");
                    }
                    break;
                case 6:
                    System.out.println("Thank you!!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}
