class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductNumber() {
        return product_number;
    }

    public void setProductNumber(String product_number) {
        this.product_number = product_number;
    }

    public String getProductDescription() {
        return product_description;
    }

    public void setProductDescription(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getAmount() {
        if (quantity <= 0 || pricePerItem <= 0) {
            return 0;
        }
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("28956", "Beer", 5, 2.5);
        System.out.println(invoice.getProductNumber());
        System.out.println(invoice.getProductDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPricePerItem());
        System.out.println(invoice.getAmount());

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-1.0);
        System.out.println(invoice.getAmount());
    }
}