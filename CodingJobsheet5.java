import java.util.Scanner;
public class CodingJobsheet5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penyortiran Makanan Ringan & Minuman Kaleng Berdasarkan Masa Kadaluarsa");
        System.out.println("Masukkan kondisi makanan dan minuman:");

        System.out.print("susu (tidakBerubahWarna/berubahWarna) = ");
        String susu = scanner.nextLine();
        switch (susu) {
            case "tidakBerubahWarna":
                System.out.println("Kasihkan peliharaan");
                break;
            case "berubahWarna":
                System.out.println("Buang");
                break;
            default:
                System.out.println("Inputan salah");
        }

        System.out.print("soda (tidakSparkling/sparkling) = ");
        String soda = scanner.nextLine();
        switch (soda) {
            case "tidakSparkling":
                System.out.println("Membersihkan toilet");
                break;
            case "sparkling":
                System.out.println("Membersihkan panggangan");
                break;
            default:
                System.out.println("Inputan salah");
        }

        System.out.print("snack (tidakKrispi/krispi) = ");
        String snack = scanner.nextLine();
        switch (snack) {
            case "tidakKrispi":
                System.out.println("Untuk pupuk");
                break;
            case "krispi":
                System.out.println("Untuk pakan ternak");
                break;
            default:
                System.out.println("Inputan salah");
        }
    }
}
