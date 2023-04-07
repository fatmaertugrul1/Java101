

import java.util.Scanner;

public class daire_hesap {
    public static void main(String[] args) {
        double pi = 3.14, r, a;
        int x = 2;

        System.out.print("dairenin yarıçapını giriniz:");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        System.out.print("dairenin taranan açısını giriniz:");
        a = input.nextDouble();

        double daireAlan = pi * r* r;
        double daireCevre = x*r * pi;
        double kismiCevre = pi * (r*r) *a/360;

        System.out.print("dairenin alanı:"+daireAlan +'\n');
        System.out.print("dairenin çevresi: "+daireCevre + '\n');
        System.out.print("dairenin kısmi çevresi: "+kismiCevre);





    }
}
