interface Reversible {
    public void reverse();
}

class ReversibleString implements Reversible {
    private String string;
    
    public ReversibleString(String string) {
        this.string = string;
    }
    
    public void reverse() {
        string = new StringBuilder(string).reverse().toString();
    }
    
    public String toString() {
        return string;
    }
}