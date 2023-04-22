import java.util.Scanner;

class insertInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringT = input.nextLine().trim();
        String stringP1 = input.next().trim();
        String stringP2 = input.next().trim();
        String stringK = input.next().trim();
        
        String regex = "\\b(" + stringP1 + "|" + stringP2 + ")\\b";
        String output = stringT.replaceFirst(regex, "$1" + " " + stringK);
        
        System.out.println(output);
    }
}