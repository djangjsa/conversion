import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversion {
    // 1 cm = 0.393701 inch
    public static double convertCentimeterToInch(int centimeter) {
        return centimeter * 0.393701;
    }

    // 1 meter = 0.001 kilometer
    public static double convertMeterToKilometer(int km) {
        return (double) km * 0.001d;
    }

    // 1 foot = (1/1000) yard
    public static double convertFootToYard(int foot) {
        return (foot * (0.33333333));
    }

    // 1 inch = 0.08333333 foot
    public static double convertInchToFoot(int inch) {
        return (inch * (0.08333333));
    }

    // 1 cm = 0.0328084 foot
    public static double convertCentimeterToFoot(int foot) {
        return (double) (foot * (0.0328084));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;

        do {
            try {
                System.out.println("Welcome to my conversion program...");
                System.out.println("[0] Centimeter to Inch");
                System.out.println("[1] Meter to Kilometer");
                System.out.println("[2] Foot to Yard");
                System.out.println("[3] Inch to Foot");
                System.out.println("[4] Centimeter to Foot");
                System.out.print("Enter number: ");
                int userInput = scanner.nextInt();
                System.out.println();

                if (userInput >= 0 && userInput <= 4) {
                    switch (userInput) {
                        case 0: {
                            System.out.println("Enter centimeter: ");
                            int centimeterInput = scanner.nextInt();
                            System.out.println("Conversion result " + centimeterInput + " cm converted to inch is equal to " + convertInchToFoot(centimeterInput));
                            break;
                        }
                        case 1: {
                            System.out.println("Enter meter: ");
                            int centimeterInput = scanner.nextInt();
                            System.out.println("Conversion result " + centimeterInput + " meter converted to kilometer is equal to " + convertMeterToKilometer(centimeterInput));
                            break;
                        }
                        case 2: {
                            System.out.println("Enter foot: ");
                            int centimeterInput = scanner.nextInt();
                            System.out.println("Conversion result " + centimeterInput + " foot converted to yard is equal to " + convertFootToYard(centimeterInput));
                            break;
                        }
                        case 3: {
                            System.out.println("Enter inch: ");
                            int centimeterInput = scanner.nextInt();
                            System.out.println("Conversion result " + centimeterInput + " inch converted to foot is equal to " + convertInchToFoot(centimeterInput));
                            break;
                        }
                        case 4: {
                            System.out.println("Enter centimeter: ");
                            int centimeterInput = scanner.nextInt();
                            System.out.println("Conversion result " + centimeterInput + " centimeter converted to foot is equal to " + convertCentimeterToFoot(centimeterInput));
                            break;
                        }
                    }
                } else {
                    System.out.println("Please enter number between 0 and 4...");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid mismatch....");
            }
        }
        while (isProgramRunning);
    }
}
