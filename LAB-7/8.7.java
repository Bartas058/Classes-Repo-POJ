import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class DataSummary {
    public static void main(String[] args) {
        String csvFile = "data.csv";
        String line;
        String csvSplitBy = ",";

        Map<String, Integer> currencyCounts = new HashMap<>();
        int comEmailCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                String currency = data[5];
                String email = data[3];

                currencyCounts.put(currency, currencyCounts.getOrDefault(currency, 0) + 1);

                if (email.endsWith(".com")) {
                    comEmailCount++;
                }
            }

            System.out.println("Currency Summary:");
            for (Map.Entry<String, Integer> entry : currencyCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nNumber of people with '.com' email: " + comEmailCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}