import java.util.Comparator;
import java.util.TreeSet;

/**
 * Main class demonstrates the usage of the Book class to create sets of books
 * and order them based on different criteria using TreeSet.
 * It creates a TreeSet of Book objects ordered by book name (A-Z) by default,
 * and another TreeSet ordered by page number in ascending order using a custom comparator.
 * The class prints out the books ordered by name and page number accordingly.
 */

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("KitapA", "YazarA", 200, "2022-01-01"));
        bookSetByName.add(new Book("KitapB", "YazarB", 150, "2022-01-02"));
        bookSetByName.add(new Book("KitapC", "YazarC", 300, "2022-01-03"));
        bookSetByName.add(new Book("KitapD", "YazarD", 250, "2022-01-04"));
        bookSetByName.add(new Book("KitapE", "YazarE", 180, "2022-01-05"));

        System.out.println("Books Ordered By Name (A-Z): ");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        TreeSet<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getPageNo(), b2.getPageNo());
            }
        });

        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nBooks Ordered By Page Number (Asc.):");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}