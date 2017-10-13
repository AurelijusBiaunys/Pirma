package day.second;

import java.util.Scanner;

import static day.second.StaciakampioPlotas.plotas;

public class StaciakampioPlotas {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius atskirtus tarpu");
        String value = scanner.nextLine();
        String[] split = value.split(" ");
        int sk1 = Integer.valueOf(split[0]);
        int sk2 = Integer.valueOf(split[1]);
        //int ats = 0;
        int ats= plotas(sk1,sk2);
        System.out.println(ats);
    }
    public static int plotas (int sk1, int sk2)
    {
        return sk1 * sk2;
    }
}
