import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer km;
        Double perkm = 2.20, total = 20.0, startPrice = 10.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km olarak giriniz! : ");
        km = input.nextInt();
        total = (km*perkm);
        total += startPrice;
        total = (total<20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);
    }
}