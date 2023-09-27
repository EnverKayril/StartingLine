import java.util.Scanner;

public class Notsistemi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Notunuzu Giriniz : ");
        int Not = sc.nextInt();
        if (Not>= 85){
            System.out.println("Notunuz : AA");
        }
        else if (Not>=70) {
            System.out.println("Notunuz : BB");
        }
        else if (Not>=55) {
            System.out.println("Notunuz : CC");
        }
        else if (Not>=45) {
            System.out.println("Notunuz : DD");
        }
        else{
            System.out.println("Notunuz : FF");
        }
        }
}
