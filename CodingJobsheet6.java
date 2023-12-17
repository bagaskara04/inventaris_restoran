import java.util.Scanner;
public class CodingJobsheet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String kategori;
        int jenis1, jenis2, jenis3;

        System.out.print("Masukkan Kategori (Makanan Ringan/Minuman Kaleng): ");
        kategori = input.nextLine();
        System.out.print("Masukkan sisa stok jenis1 : ");
        jenis1 = input.nextInt();
        System.out.print("Masukkan sisa stok jenis2 : ");
        jenis2 = input.nextInt();
        System.out.print("Masukkan sisa stok jenis3 : ");
        jenis3 = input.nextInt();

        int total = (int) (jenis1 + jenis2 + jenis3);

        if ((total >= 60)) {
            if((jenis1 == 20) && (jenis2 == 20) && (jenis3 == 20))
            System.out.println("Stok barang aman");
            else if ((jenis1 + jenis2 + jenis3 >= 60))
            System.out.println("Tidak perlu restok");
        } else
        System.out.println("Segera restok barang");

    }
}
