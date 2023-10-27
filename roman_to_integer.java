// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a Roman numeral (or 'E' to exit): ");
            String input = scanner.nextLine().toUpperCase();
            
            if (input.equals("E")) {
                System.out.println("Exiting the program.");
                break;
            }
            
            int result = romanToInteger(input);
            
            if (result == -1) {
                System.out.println("Invalid Roman numeral. Please try again.");
            } else {
                System.out.println("Integer equivalent: " + result);
            }
        }

        scanner.close();
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int numericValue = getNumericValue(currentSymbol);

            if (numericValue == -1) {
                return -1; // Invalid Roman numeral character
            }

            if (numericValue < prevValue) {
                result -= numericValue;
            } else {
                result += numericValue;
            }

            prevValue = numericValue;
        }

        return result;
    }

    public static int getNumericValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1; // for invalid input
        }
    }
}


