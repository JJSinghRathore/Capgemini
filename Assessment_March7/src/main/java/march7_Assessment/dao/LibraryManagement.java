package march7_Assessment.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import march7_Assessment.bean.Author;
import march7_Assessment.bean.Book;

import java.util.List;

public class LibraryManagement implements ILibraryManagement{
    private static EntityManager em;
    static{
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        em=emf.createEntityManager();
    }
    @Override
    public String createAuthor(Author a, List<Book> li) {
        em.getTransaction().begin();
        for(Book b : li){
            b.setAuthor(a);
        }
        a.setBook(li);
        em.persist(a);
        em.getTransaction().commit();
        return "author added...";
    }

    @Override
    public String readAuthor(int id) {

        Author a = em.find(Author.class, id);
        if(a!=null){
            System.out.println("Author id: "+ a.getAuthor_id());
            System.out.println("Author name: "+ a.getAuthor_name());

            for(Book b: a.getBook()){
                System.out.println(b.getTitle()+" - "+ b.getPrice());
            }

            return "Author found";
        }else{

            return "Author not found";
        }
    }

    @Override
    public String updateAuthor(Book book) {
        em.getTransaction().begin();
        Book b= em.find(Book.class,book.getBook_id());
        if(b!=null){
            b.setPrice(book.getPrice());
            em.getTransaction().commit();
            return "Price updated...";
        }else{
            em.getTransaction().commit();
            return "Not updated";
        }
    }

    @Override
    public String deleteAuthor(int id) {
        Author a = em.find(Author.class, id);

        if(a!=null){
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
            return "Author Deleted...";
        }
        else{
            return "not deleted";
        }
    }

    @Override
    public String deleteBook(int id) {
        Book b = em.find(Book.class, id);

        if(b!=null){
            em.getTransaction().begin();
            em.remove(b);
            em.getTransaction().commit();
            return "Book Deleted...";
        }
        else{
            return "not deleted";
        }
    }
}
