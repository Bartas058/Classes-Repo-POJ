class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book (String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = 0;
    }

    public Book (String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorNames() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].getName());
            if (i < authors.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book[name=").append(name)
                .append(",price=").append(price)
                .append(",authors=[");
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].toString());
            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("],qty=").append(qty)
                .append("]");
        return sb.toString();
    }
}