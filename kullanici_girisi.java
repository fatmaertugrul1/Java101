import java.util.Scanner;
public class kullanici_girisi {
    public static void main(String[] args) {
        String username, password, newPassword;
        Scanner inp = new Scanner(System.in);
        boolean sifirla;

        System.out.print("Kullanıcı Adınız:");
        username = inp.nextLine();

        System.out.println("Şifreniz:");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");

        } else {
            System.out.println("Bilgileriniz yanlış");
            System.out.println("Şifre sıfırlansın mı?");
            sifirla = inp.nextBoolean();
            if (sifirla ? true : false) {
                System.out.println("yeni şifrenizi giriniz:");
                newPassword = inp.nextLine();

            }
            newPassword = inp.nextLine();;
            if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }
            else {
                System.out.println("Yeni şifre oluşturuldu");
            }

            }
        }

    }



