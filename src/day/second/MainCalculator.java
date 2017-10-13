package day.second;

import java.util.InputMismatchException;
import java.util.Scanner;

// 12*12    {"12", "*", "12"}

public class MainCalculator {

    public static void main(String[] argd) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("iveskite du skaicius ir operacija pvz x + y");
        String insertVal = scanner.nextLine();
        String[] split = insertVal.split(" ");
        if (split.length == 3) {
            Calculator calculator = new Calculator();
            try {
                int numb = Integer.valueOf(split[0]);
                int numbSec = Integer.valueOf(split[2]);
                int result = 0;
                switch (split[1]) {
                    case "+":
                        result = calculator.suma(numb, numbSec);
                        break;
                    case "-":
                        result = calculator.skirtumas(numb, numbSec);
                        break;
                    case "*":
                        result = calculator.sandauga(numb, numbSec);
                        break;
                    default:
                        System.out.println("nera tokios operacijos");
                        break;
                }
                System.out.println("Rezultatas >>" + result);
            }catch (NumberFormatException e){
                System.out.println("Paleisk programa is naujo");
            }
        } else {
            System.out.println("Paleisk programa is naujo");
        }
    }
}
