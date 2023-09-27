import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fiyat Giriniz : ");
        double F = sc.nextDouble();
        double KDVHesap = (F*18)/100;
        double kdvlifiyat = F+KDVHesap;
        System.out.println("Toplam Fiyat : " +kdvlifiyat);



    }
}