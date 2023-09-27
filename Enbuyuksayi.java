import java.util.Scanner;

public class Enbuyuksayi {
    public static void main(String[] args){
        System.out.println("3 Sayı Giriniz : ");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = sc3.nextInt();

        if ( a>b && a>c){
            System.out.println("En Büyük Sayı : " +a);
        }
        else if (b>a && b>c){
            System.out.println("En Büyük Sayı : " +b);
        }
        else {
            System.out.println("En Büyük Sayı : " +c);
        }

    }
}
