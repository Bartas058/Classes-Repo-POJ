import java.util.*;

class Hamster {
    private int hamsterNumber;
    private String name;

    Hamster(int i, String name) {
        hamsterNumber = i;
        this.name = name;
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public String getName() {
        return name;
    }
}

class Printer {
    static void printAll(List<Hamster> hl) {
        for (Hamster hamster : hl) {
            System.out.println(hamster.hamsterNumber());
        }
    }
}

class HamsterMaze {
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<Hamster>();
        Map<String, Hamster> hamsterMap = new HashMap<>();

        String[] testNames = {"Porsche", "Macan", "GTS"};
        int[] testIdentifiers = {195, 10, 232};

        try {
            for (int i = 0; i < 3; i++) {
                String name = testNames[i];
                int identifier = testIdentifiers[i];

                if (identifier < 0 || name.isEmpty()) {
                    System.out.println("Invalid data. Please try again.");
                    continue;
                }

                Hamster hamster = new Hamster(identifier, name);
                v.add(hamster);
                hamsterMap.put(name, hamster);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid identifier. Please enter a valid number.");
        }

        Printer.printAll(v);

        for (String name : hamsterMap.keySet()) {
            Hamster hamster = hamsterMap.get(name);
            System.out.println("Name: " + hamster.getName() + ", Identifier: " + hamster.hamsterNumber());
        }
    }
}