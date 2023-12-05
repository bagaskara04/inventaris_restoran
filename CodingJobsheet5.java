import java.util.Scanner;
public class CodingJobsheet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kondisi Minuman Kaleng");
        
        System.out.print("susu (tidakBerubahWarna/berubahWarna): ");
        String susu = input.nextLine();
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
        String soda = input.nextLine();
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

        System.out.println("Kondisi Makanan Ringan");
        System.out.print("snack (tidakKrispi/krispi) = ");
        String ciki = input.nextLine();
        switch (ciki) {
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