import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        System.out.println("Mail adresinizi giriniz : ");
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int e = s.indexOf("@");
        int nokta = s.indexOf(".");
        String kullanici = s.substring(0,e);
        String sunucu = s.substring (e+1 , nokta) ;
        System.out.println("Kullanıcı adı :" + kullanici);
        System.out.println("Sunucu : " +sunucu);

    }
}
