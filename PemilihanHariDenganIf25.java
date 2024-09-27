import java.util.Scanner;

public class PemilihanHariDenganIf25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = scanner.nextInt();

        String hari;
        if (angka >= 1 && angka <= 5) {
            hari = "Weekday";
        } else if (angka == 6 || angka == 7) {
            hari = "Weekend";
        } else {
            hari = "Invalid Number";
        }

        System.out.println(hari);
    }
}