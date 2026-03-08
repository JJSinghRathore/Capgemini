package march7_Assessment.dao;

import march7_Assessment.bean.Author;
import march7_Assessment.bean.Book;

import java.util.List;

public interface ILibraryManagement {
    public String createAuthor(Author author, List<Book> li);
    public String readAuthor(int id);
    public String updateAuthor(Book book);
    public String deleteAuthor(int id);
    public String deleteBook(int id);

}
