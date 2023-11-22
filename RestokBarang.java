import java.util.Scanner;

public class RestokBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori;
        int restok = 60, sisa, beli, harga = 5000;
        double disc = 0.05, modal = 0.0;

        System.out.println("---RESTOK BARANG---");
        System.out.print("Masukkan jenis barang (Makanan Ringan/Minuman Kaleng) : ");
        kategori = sc.nextLine();
        System.out.print("Masukkan sisa barang : ");
        sisa = sc.nextInt();
        beli = (int) restok - sisa;
        System.out.println("Jadi jumlah barang yang dibeli sebanyak " + beli + " buah");

        System.out.println("---MODAL YANG DIBUTUHKAN---");
        do {
            if((beli > 0)) {
                if (beli >= 30) {
                modal = (double) beli * harga - harga * disc; 
                System.out.println("Modal yang diperlukan : " + modal);
                 } else{
                modal = (double) beli * harga;
                System.out.println("Modal yang diperlukan : " + modal);
                 }
            } else
            System.out.println("Masukkan salah");
        } while (beli == 0);
    }
 }
