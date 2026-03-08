package march7_Assessment.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;
    private String author_name;
    private String author_email;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)

    private List<Book> books;

    public Author() {}

    public Author( int author_id, String author_name, String author_email) {
        this.author_id=author_id;
        this.author_name = author_name;
        this.author_email = author_email;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public List<Book> getBook() {
        return books;
    }

    public void setBook(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                ", author_email='" + author_email + '\'' +
                ", books=" + books +
                '}';
    }
}
