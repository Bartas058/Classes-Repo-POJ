interface Adder {
    public int add(int a, int b);
}

interface Multiplier {
    public int multiply(int a, int b);
}

interface StringLength {
    public int getLength(String s);
}

class LambdaCalculator {
    public int calculateAddition(Adder adder, int a, int b) {
        return adder.add(a, b);
    }

    public int calculateMultiplication(Multiplier multiplier, int a, int b) {
        return multiplier.multiply(a, b);
    }

    public int calculateStringLength(StringLength stringLength, String s) {
        return stringLength.getLength(s);
    }
}

class Main {
    public static void main(String[] args) {
        LambdaCalculator calculator = new LambdaCalculator();

        Adder adder = (a, b) -> a + b;
        int result = calculator.calculateAddition(adder, 12, 5);
        System.out.println("Addition result: " + result);

        Multiplier multiplier = (a, b) -> a * b;
        result = calculator.calculateMultiplication(multiplier, 13, 3);
        System.out.println("Multiplication result: " + result);

        StringLength stringLength = s -> s.length();
        result = calculator.calculateStringLength(stringLength, "Porsche Macan GTS");
        System.out.println("String length: " + result);
    }
}