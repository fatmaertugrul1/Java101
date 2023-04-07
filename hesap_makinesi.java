import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1,n2,select;
        System.out.println("Birinci sayıyı giriniz:");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2 = inp.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.println("yapmak istediğiniz işlemi seçiniz:");
        select = inp.nextInt();

        switch (select)
        {
            case 1:
                System.out.println(n1 + n2);
                break;

            case 2:
               System.out.println(n1 - n2);
               break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("işlem bitti.");
                break;

        }


    }
}
