class Card {
    public enum Value {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    public enum Color {
        Hearts, Diamonds, Spades, Clubs
    }

    private final Value value;
    private final Color color;

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
}

class Test {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Value.Ace, Card.Color.Hearts);
        Card card2 = new Card(Card.Value.Seven, Card.Color.Clubs);
        Card card3 = new Card(Card.Value.King, Card.Color.Spades);

        System.out.println("1. " + card1.getValue() + " of " + card1.getColor());
        System.out.println("2. " + card2.getValue() + " of " + card2.getColor());
        System.out.println("3. " + card3.getValue() + " of " + card3.getColor());
    }
}