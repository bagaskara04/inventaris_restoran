import java.util.Scanner;

public class CodingJobsheet5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penyortiran Makanan Ringan & Minuman Kaleng Berdasarkan Masa Kadaluarsa");
        System.out.println("Masukkan kondisi makanan dan minuman:");
        System.out.print("susu = ");
        String susu = scanner.nextLine();
        if (susu.equals("tidakBerubahWarna")) {
            System.out.println("Kasihkan peliharaan");
        }
        else {
            System.out.println("Buang");
        }

        System.out.print("soda = ");
        String soda = scanner.nextLine();
        if (soda.equals("tidakSparkling")) {
            System.out.println("Membersihkan toilet");
        }
        else {
            System.out.println("Membersihkan panggangan");
        }

        System.out.print("snack= ");
        String snack = scanner.nextLine();
        if (snack.equals("tidaKrispi")) {
            System.out.println("Untuk pupuk");
        }
        else {
            System.out.println("Untuk pakan ternak");
        }

        scanner.close();
    }
}