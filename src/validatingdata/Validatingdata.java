/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validatingdata;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author tyatk9075
 */
public class Validatingdata {

    /**
     * @param args the command line arguments
     */
    public static Scanner keyedinput = new Scanner(System.in);
        
    

   public static void main(String[] args) {
        // TODO code application logic here
    
       Scanner keyedinput  = new Scanner(System.in);
        case1();
        case2();
        case3();
        case4();
        case5();
        case6();
    }

    public static String getInput() {
        String input = keyedinput.nextLine();
        return input;
    }

    public static void case1() {
        System.out.println("Enter a word 6 letters or Longer than 6 Letters:");
        String input = getInput();
        boolean valid = false;
        while (!valid) {
            if (input.length() > 6) {
                valid = true;
            } else {
                valid = false;
                System.out.println("That input is not under 6 letters . Please enter a string greater than 6 characters");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you moved onto the next stage!");
    }
    
    public static void case2() {
        System.out.println("Enter a string that contains a lower case ''d'':");
        String input = getInput();
        boolean valid = false;
        while (!valid) {
            if (input.contains("d")) {
                valid = true;
            } else {
                valid = false;
                System.out.println("That input is not valid. Please enter a string that contains a lower case ''d''");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you passed this stage!");
    }

    public static void case3() {
        System.out.println("Enter a string between 5 and 15 letter long, and does not contain a 'e':");
        String input = getInput();
        boolean valid = false;
        while (!valid) {
            if (!input.contains("e") && input.length() >= 5 && input.length() <= 15) {
                valid = true;
            } else {
                valid = false;
                System.out.println("That input is invalid. try  Entering a string between 5 and 15 characters long, and does not contain a \'z\'");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you moved onto the third  stage!");
    }

    public static void case4() {
        System.out.println("Enter an number between 5 and 500:");
        String input = getInput();
        boolean valid = false;
        int num;

        while (!valid) {
            try {
                num = Integer.parseInt(input);
                if (num >= 5 && num <= 500) {
                    valid = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException nfe) {
                valid = false;
                System.out.println("That number is not between 5 and 500. Please try a number between 5 and 500.");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you passed the 3rd stage!");
    }
    
    public static void case5() {
        System.out.println("Enter a negative integer:");
        String input = getInput();
        boolean valid = false;
        int num;

        while (!valid) {
            try {
                num = Integer.parseInt(input);
                if (num < 0) {
                    valid = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException nfe) {
                valid = false;
                System.out.println("That input is not valid. Please enter a negative integer.");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you passed the 4th stage!");
    }
    
    public static void case6() {
        System.out.println("Enter a positive, odd integer:");
        String input = getInput();
        boolean valid = false;
        int num;

        while (!valid) {
            try {
                num = Integer.parseInt(input);
                if (num > 0 && num%2 != 0) {
                    valid = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException nfe) {
                valid = false;
                System.out.println("That input is not postive and odd. Please enter a positive, odd number.");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you completed the test!");
    }
}
