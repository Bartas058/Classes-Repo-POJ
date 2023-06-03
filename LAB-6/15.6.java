import java.util.HashMap;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }
}

class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public void displayBooks() {
        for (String isbn : books.keySet()) {
            Book book = books.get(isbn);
            System.out.println("ISBN: " + isbn + ", " + book);
        }
    }

    public boolean isBookInLibrary(String isbn) {
        return books.containsKey(isbn);
    }
}