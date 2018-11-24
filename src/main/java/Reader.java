import java.util.Scanner;

public class Reader {

    private final Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();
    String polishLetters = "[A-Z,ĄŻŚŹĘĆŃÓŁ][a-z,ążśźęćńół]+(([\\-][A-Z,ĄŻŚŹĘĆŃÓŁ][a-z,ążśźęćńół])?[a-z,ążśźęćńół]*)";
    Integer number;

    public boolean validateString(String s) {
        boolean result = s.matches(polishLetters);
        return result;
    }

    public String getName() {
        String nameFromUser = scanner.nextLine();
        boolean testString = false;
        while (!testString) {
            if (validateString(nameFromUser)) {
                testString = true;
            } else {
                printer.printLine("Wprowadzono niepoprawne dane. Wprowadź jedno imię.");
                nameFromUser = scanner.nextLine();
            }
        }
        return nameFromUser;
    }

    public Integer numberOfNames() {
        Integer numberFromUser = scanner.nextInt();
        boolean testIntiger = false;
        while (!testIntiger) {
            if (scanner.hasNextInt()) {
                testIntiger = true;
            } else {
                printer.printLine("Wprowadzono niepoprawne dane.Proszę wpisać same cyfty.");
                numberFromUser = scanner.nextInt();
                testIntiger = false;
                }
            }
            return numberFromUser;
        }
    }

