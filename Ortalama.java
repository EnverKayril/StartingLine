import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args){
        System.out.println(" Çift Sayı Ortalaması");

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            float a = sc1.nextFloat();
            float b = sc2.nextFloat();
            float c = ((a+b)/2);

            System.out.println(c);

            for (int i=0;true;) {

                Scanner sc3 = new Scanner(System.in);
                float d = sc3.nextFloat();
                System.out.println((c+d)/2);
                c = ((d+c)/2);

                if (d%2 != 0){
                    break;
                }

            }
    }


}
