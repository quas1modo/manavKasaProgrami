import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int a, e, d, m, p;
        System.out.print("Armut Kaç Kilo? ");
        a = input.nextInt();
        System.out.print("Elma Kaç Kilo? ");
        e = input.nextInt();
        System.out.print("Domates Kaç Kilo? ");
        d = input.nextInt();
        System.out.print("Muz Kaç Kilo? ");
        m = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo? ");
        p = input.nextInt();
        tutar = (armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlican * p);
        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
