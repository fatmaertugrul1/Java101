import java.util.Scanner;

public class hipotenus {

    /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz:");
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int ucgenin_cevresi= (a+b+c);
        int u = ucgenin_cevresi/2;
        int ucgenin_alani = u *(u -a)*(u- b)*(u-c);
        System.out.println("Üçgenin alanı:"+ucgenin_alani);

        System.out.println("Üçgenin dik kenarlarını giriniz:");
        int x,z;
        x = input.nextInt();
        z = input.nextInt();
        double hipotenus =Math.sqrt((x*x)+(z*z));
        System.out.println("Üçgenin hipotenüsü:"+hipotenus);


}
}