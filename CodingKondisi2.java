import java.util.Scanner;

public class CodingKondisi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlSnack, jmlMnmKaleng;
        double totalSnack, totalMnmKaleng, harga, kerugian;

        System.out.println("Masukkan jumlah snack yang kadaluarsa");
        jmlSnack = input.nextInt();
        System.out.println("Masukkan harga snack");
        harga = input.nextDouble();
        totalSnack = (double) (jmlSnack * harga);
        System.out.println("Total kerugian snack kadaluarsa adalah " + totalSnack);

        System.out.println("Masukkan jumlah mnmKaleng yang kadaluarsa");
        jmlMnmKaleng = input.nextInt();
        System.out.println("Masukkan harga snack");
        harga = input.nextDouble();
        totalMnmKaleng = (double) (jmlSnack * harga);
        System.out.println("Total kerugian minuman kaleng kadaluarsa adalah " + totalMnmKaleng);

        kerugian = (double) (totalSnack + totalMnmKaleng);
        System.out.println("Kerugian Bulan Oktober sebesar Rp. " + kerugian);

    }
}