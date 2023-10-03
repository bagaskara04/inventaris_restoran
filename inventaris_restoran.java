import java.util.Scanner;

public class inventaris_restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stok_makanan_ringan_awal, stok_minuman_kaleng_awal, stok_makanan_ringan_yang_kadaluarsa, stok_minuman_kaleng_yang_kadaluarsa, stok_makanan_ringan_layak_konsumsi, stok_minuman_kaleng_layak_konsumsi;

        System.out.println("Masukkan stok makanan ringan awal anda: ");
        stok_makanan_ringan_awal = input.nextInt();
        System.out.println("Masukkan stok minuman kaleng awal anda: ");
        stok_minuman_kaleng_awal = input.nextInt();
        System.out.println("Masukkan stok makanan ringan yang kadaluarsa: ");
        stok_makanan_ringan_yang_kadaluarsa = input.nextInt();
        System.out.println("Masukkan stok minuman kaleng yang kadaluarsa: ");
        stok_minuman_kaleng_yang_kadaluarsa = input.nextInt();

        stok_makanan_ringan_layak_konsumsi = (int) (stok_makanan_ringan_awal - stok_makanan_ringan_yang_kadaluarsa);
        stok_minuman_kaleng_layak_konsumsi = (int) (stok_minuman_kaleng_awal - stok_minuman_kaleng_yang_kadaluarsa);

        System.out.println("Stok makanan ringan layak konsumsi restoran anda adalah " + stok_makanan_ringan_layak_konsumsi);
        System.out.println("Stok minuman kaleng layak konsumsi restoran anda adalah " + stok_minuman_kaleng_layak_konsumsi);
    }
}