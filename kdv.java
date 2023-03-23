import java.util.Scanner;

public class kdv {

    /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
    public static void main(String[] args) {
        System.out.println("Fiyatı giriniz:");
         int fiyat;
        Scanner inpt = new Scanner(System.in);
        fiyat = inpt.nextInt();

        int kdv_tutarı =(fiyat *18)/100;
        fiyat+= kdv_tutarı;

        System.out.println("Kdv tutarı:"+kdv_tutarı);
        System.out.println("Fiyatın kdv eklenmiş hali:"+fiyat);





    }
}
