import java.util.Scanner;
public class KelJobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int restok = 60;
        double disc = 0.1, modal = 0, harga = 5000;

        //Restok Barang
        System.out.print("Masukkan jenis barang (Makanan Ringan/Minuman Kaleng) : ");
        String kategori = sc.nextLine();
        System.out.print("Masukkan jumlah barang : ");
        int barang = sc.nextInt();
        
        int[] sisaBarang = new int[barang];
        for (int i = 0; i < sisaBarang.length; i++) {
            System.out.print("Masukkan sisa barang ke-" + (i + 1) + " : ");
            sisaBarang[i] = sc.nextInt();
            int beli = (int) restok - sisaBarang[i];
            System.out.println("Jumlah barang yang dibeli : " + beli);
            if((beli > 0)) { //Perhitungan Modal
                if (beli >= 30) {
                modal = (double) beli * (harga - harga * disc); 
                System.out.println("Modal yang diperlukan : Rp." + modal);
                } else if (beli < 30)
                modal = (double) beli * harga;
                System.out.println("Modal yang diperlukan : Rp." + modal);
            } else
            System.out.println("Modal yang diperlukan Rp.0");
        }
    }
}