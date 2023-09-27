import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Yarıçapı Giriniz : ");
        double r = sc.nextDouble();
        double pi = 3.141;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("Alan : " +alan);
        System.out.println("Çevre : "+cevre);

    }
}
