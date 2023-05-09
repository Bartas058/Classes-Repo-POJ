interface Calculable {
    public void add(double value);
    public double getTotal();
}

class SimpleCalculator implements Calculable {
    private double total = 0;

    @Override
    public void add(double value) {
        total += value;
    }

    @Override
    public double getTotal() {
        return total;
    }
}