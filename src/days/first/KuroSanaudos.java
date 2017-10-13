package days.first;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KuroSanaudos {
    private static double km;
    private static double ltr;

    public static void main(String[] args) {
        System.out.println(nuskaitymas());
        //  System.out.println(sanaudos(km, ltr));
    }

    /*  pirmas budas
        private static double nuskaitymas() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Iveskite kiek km nuvaziavote: ");
            double km = 0;
            double ltr = 0;


            try {
                km = sc.nextDouble();
                System.out.println("Iveskite kiek kuro litrais uzsipylete: ");
                ltr = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Iveskite skaiciais");
                return 0;
            }
            return sanaudos(km, ltr);
        }*/     //antras budas  ivesti reiksmes
    private static double nuskaitymas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ivesk km");
        double km = getCorrectValue(scanner);
        System.out.print("ivesk litrus");
        double ltr = getCorrectValue(scanner);
        return sanaudos(km, ltr);
    }

    private static double sanaudos(double km, double ltr) {
        return (ltr * 100) / km;
    }

    private static double getCorrectValue(Scanner scanner) {
        double response = 0.0;
        while (true) {
            try {
                response = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ivesta bloga reiksme");
                scanner.nextLine();
            }
        }
        return response;

    }
}
