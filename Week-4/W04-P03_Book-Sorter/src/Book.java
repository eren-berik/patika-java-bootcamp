/**
 * Book class represents a book with its attributes such as name, author, page number, and publish date.
 * It implements the Comparable interface to allow sorting based on the book name.
 * Each Book object can be compared based on its name for sorting purposes.
 * The class also provides getters and setters for accessing and modifying its attributes.
 */

public class Book implements Comparable<Book> {
    String bookName, authorName;
    int pageNo;
    String publishDate;

    public Book(String bookName, String authorName, int pageNo, String publishDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNo = pageNo;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.bookName.compareTo(other.bookName);
    }

    @Override
    public String toString() {
        return "" +
                "Book Name:" + bookName +
                "\t\t Author Name:" + authorName +
                "\t\t Page Number: " + pageNo +
                "\t\t Publish Date: " + publishDate;
    }

}
