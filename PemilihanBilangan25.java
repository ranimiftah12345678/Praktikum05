import java.util.Scanner;
public class PemilihanBilangan25 {
    public static void main (String[] args) {
        java.util.Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan sebuah angka");
        int angka = sc.nextInt();
        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}