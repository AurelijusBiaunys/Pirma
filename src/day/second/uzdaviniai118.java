package day.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class uzdaviniai118 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite masyvo ilgi skaiciais ");
        int masL = getGoodNumber(scanner);
        int[] mas = new int[masL];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("iveskite " + i + " masyvo skaiciu ");
            mas[i] = getGoodNumber(scanner);

        }
        //int [] masyvas = {1,2,3,4,5};
        //System.out.println(" pradines masyvo reiksmes "+ masyvas);
        //int inverted = 0;
        //System.out.println(apsuktasMasyvas(mas[]));
        System.out.println(teigiamuSk(mas));    //teigiamu skaiciu kiekio metodo isvedimas
        printMas(mas);
        System.out.println();
       // reverse(mas);
    }

    //--------metodai
    private static int[] teigiamuSk(int[] mast) {
        int[] mas = mast;
        int kiekis = mas[0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                int temp = 0;
                if (mas[i] > mas[j]) {
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        return mas ;
    }


    private static void reverse(int[] mas) {          //APSISUKIMAS
        int[] temp = new int[mas.length];
        int j = mas.length - 1;
        for (int i = 0; i < mas.length; i++) {
            temp[i] = mas[j - i];
        }
        printMas(temp);
    }


    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    private static int getGoodNumber(Scanner sc) {
        int i = 0;
        while (true) {
            // System.out.print("iveskite skaiciu");
            try {
                i = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("skaicius prasom");
                sc.nextInt();
            }
        }
        return i;
    }
}
