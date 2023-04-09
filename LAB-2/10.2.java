class Numbers {
    private int number1, number2, number3;
    
    public Numbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    
    public int sum() {
        return number1 + number2 + number3;
    }
    
    public double average() {
        return (double)(number1 + number2 + number3) / 3;
    }
    
    public int min() {
        return Math.min(number1, Math.min(number2, number3));
    }
    
    public int max() {
        return Math.max(number1, Math.max(number2, number3));
    }
    
    public double geometric() {
        return Math.pow(number1 * number2 * number3, 1.0 / 3);
    }
    
    public static void main(String[] args) {
        Numbers nums = new Numbers(21, 3, 7);
        
        System.out.println("Sum: " + nums.sum());
        System.out.println("Average: " + nums.average());
        System.out.println("Min: " + nums.min());
        System.out.println("Max: " + nums.max());
        System.out.println("Geometric: " + nums.geometric());
    }
}