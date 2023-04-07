import java.util.Scanner;

public class vucut_kitle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double kilo,boy;
        System.out.println("lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = inp.nextDouble();
        System.out.println("boy:"+boy);

        System.out.println("lütfen kilonuzu giriniz:");
        kilo = inp.nextDouble();
        System.out.println("kilo:"+kilo);


        double indeks = (kilo)/ (boy *boy),;
        System.out.println("vucüt kitle indeksiniz:"+ indeks);
    }
}
