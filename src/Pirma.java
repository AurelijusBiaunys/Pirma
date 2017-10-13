public class Pirma {
    private int value;
    private int secondValue;
    public static void main(String[] args) {
        Pirma pirma = new Pirma();
        pirma.value = 12;
        pirma.secondValue = 30;
        System.out.println(pirma.suma());   //isvedimas y console
        pirma.testPrivate();
    }
    public int suma()
    {
        test();
        testPrivate();
        return value + secondValue;
    }
    public static int test()
    {
        //suma();
        return 0;
    }
    private void
    testPrivate(){
        System.out.println("isvedamas tekstas");
    }
//-------------------------
}
