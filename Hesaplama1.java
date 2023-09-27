import java.util.Scanner;

public class Hesaplama1 {
    public static void main (String[] args){
        for(int i = 0 ;true;) {

            System.out.print("Yapmak İstediğiniz İşlemi Yazın : \nToplama için '1' \nÇıkarma için '2' \nÇarpma için  '3' \nBölme için   '4' \nProgramı Sonlandırmak İçin '9' ");

            Scanner sc1 = new Scanner(System.in);

            double hesap1 = sc1.nextDouble();

            if (hesap1 == 1) {
                System.out.println("Sayı Giriniz : ");
                Scanner toplanan1 = new Scanner(System.in);
                Scanner toplanan2 = new Scanner(System.in);
                double a = toplanan1.nextDouble();
                double b = toplanan1.nextDouble();
                System.out.println( a + b);
            }
            else if (hesap1 == 2) {
                System.out.println("Sayı Giriniz : ");
                Scanner toplanan1 = new Scanner(System.in);
                Scanner toplanan2 = new Scanner(System.in);
                double a = toplanan1.nextDouble();
                double b = toplanan1.nextDouble();
                System.out.println( a - b);
            }
            else if (hesap1 == 3) {
                System.out.println("Sayı Giriniz : ");
                Scanner toplanan1 = new Scanner(System.in);
                Scanner toplanan2 = new Scanner(System.in);
                double a = toplanan1.nextDouble();
                double b = toplanan1.nextDouble();
                System.out.println( a * b);
            }
            else if (hesap1 == 4) {
                System.out.println("Sayı Giriniz : ");
                Scanner toplanan1 = new Scanner(System.in);
                Scanner toplanan2 = new Scanner(System.in);
                double a = toplanan1.nextDouble();
                double b = toplanan1.nextDouble();
                System.out.println(a / b);
            } else if (hesap1 == 9) {
                break;

            } else {
                System.out.println("Lütfen Geçerli Bir Sayı Giriniz!");
            }

        }

    }
}
