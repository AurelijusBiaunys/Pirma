package day.third;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxVal = menu(scanner);
       // int r = randomizer(scanner, maxVal);
        System.out.println("Spejimu skaicius " + veiksmas(scanner, randomizer( maxVal)));
        //veiksmas(int sc, int  rnd);
    }
    //-----------------metodai
    // menu metodas     1
    private static int menu(Scanner sc) {
        int temp = 0;
        boolean runUntil = true;
        while (runUntil) {
            System.out.println(" Pasirinkite sunkumo lygi\n 1. nuo 1 iki 10\n 2. nuo 1 iki 100\n 3. nuo 1 iki 1000\n");
            try {
                int selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        temp = 10;
                        runUntil = false;
                        break;
                    case 2:
                        temp = 100;
                        runUntil = false;
                        break;
                    case 3:
                        temp = 1000;
                        runUntil = false;
                        break;
                    default:
                        System.out.println("Nera tokio pasirinkimo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Blogas ivedimo formatas\n pabandykite dar karta: ");
                sc.nextLine();
            }
        }
        return temp;
    }

    //------------------------------------------------------------------------
    //spejimu skaiciaus  metodas
    private static int randomizer( int rnd) {

        Random random = new Random();
        return  random.nextInt(rnd);
        //return rnd;
    }

    //------------------------------------------------------------------------
// veiksmu metodas - skaiciaus spejimas
    private static int veiksmas(Scanner sc, int randomGeneratedNumber) {
        int guess = 1;
        while (true) {
            System.out.println("Spekite skaiciu: ");
            int sk = sc.nextInt();
            if (sk == randomGeneratedNumber) {
                System.out.println("Atspejai");
                break;
            } else {
                hiLow(sk, randomGeneratedNumber);
                guess++;
            }
        }
        return guess;

    }
    private static void hiLow(int sk, int randomGeneratedNumber)
    {
        if (sk > randomGeneratedNumber)
            System.out.println("per did");
        if (sk < randomGeneratedNumber)
            System.out.println("per maz");
    }
        /*  System.out.println("Spekite skaiciu: ");
        int sk = sc.nextInt();
        if (sk > rnd)
            System.out.println("jusu spejimas yra per aukstas ");
        else if (sk < rnd)
            System.out.println("jusu spejimas yra per zemas");
        else if (sk == rnd)
            System.out.println("Jus atspejote skaiciu!");

        return rnd;     */


//------------------------------------------------------------------------
}
