import java.util.Scanner;

class deleteZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        String output = number.replaceAll("^(-?)0*(\\d+)(\\.\\d*?)?0*$", "$1$2$3");

        System.out.println(output);
    }
}