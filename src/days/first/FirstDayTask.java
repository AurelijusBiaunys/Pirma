package days.first;

import java.util.Scanner;

public class FirstDayTask
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite savo svori: ");
        int weight = sc.nextInt();
        System.out.println("iveskite savo ugi: ");
        double height = sc.nextDouble();
      //  double kmi = weight / (height * height);
       // double kmi = kmiMethod(weight, height);       //pirmas metodo panaudojimas
        System.out.println("kmi= " + kmiMethod(weight, height));
    }
    private static double kmiMethod(int weight, double height)
    {
            return weight / (height * height);
    }
}
