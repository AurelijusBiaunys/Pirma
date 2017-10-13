package day.second;

import java.util.Scanner;

public class KunoMasesIndeksas {
    //1.2 is uzdaviniu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String zodis = scanner.nextLine();
        //System.out.println();
        while (!zodis.equals("pabaiga")) {
            System.out.println("iveskite zodi");
            zodis = scanner.nextLine();
            System.out.println(zodis);

    }

    }

}
