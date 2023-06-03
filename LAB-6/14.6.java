import java.util.HashSet;

class PeselCollection {
    private HashSet<String> peselNumbers;

    public PeselCollection() {
        peselNumbers = new HashSet<>();
    }

    public boolean addPesel(String pesel) {
        if (isValidPesel(pesel)) {
            peselNumbers.add(pesel);
        } else {
            System.out.println("Invalid PESEL number.");
            return false;
        }
        
        return true;
    }

    public void removePesel(String pesel) {
        peselNumbers.remove(pesel);
    }

    public void displayPesels() {
        for (String pesel : peselNumbers) {
            System.out.println(pesel);
        }
    }

    public boolean isPeselInCollection(String pesel) {
        return peselNumbers.contains(pesel);
    }

    public boolean isValidPesel(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }

        for (char c : pesel.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}