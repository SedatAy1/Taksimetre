import java.util.Scanner;
public class TaksimetreProgramı {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startprice = 10;

        Scanner imput = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = imput.nextInt();

        total = (km * perKm);
        total += startprice;
        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar : " + total);

    }
}
