import java.util.Scanner;

public class inven2 {
    static Scanner input = new Scanner(System.in);
    static int menu, stok_makanan_ringan_awal, stok_minuman_kaleng_awal, stok_makanan_ringan_yang_kadaluarsa = 0,
            stok_minuman_kaleng_yang_kadaluarsa = 0, stok_makanan_ringan_layak_konsumsi,
            stok_minuman_kaleng_layak_konsumsi;
    static double totalSnack, totalMnmKaleng, harga, kerugian;
    public static void main(String[] args) {
        

        while (true) {
            System.out.println("============== Inventaris Restoran ==============");
            System.out.println("=================================================");
            System.out.println("== 1. Stok Makanan dan Minuman Layak Konsumsi  ==");
            System.out.println("== 2. Perhitungan Kerugian Makanan dan Minuman ==");
            System.out.println("== 3. Penyortiran Makanan dan Minuman          ==");
            System.out.println("== 4. Pengecekan Stok Barang                   ==");
            System.out.println("== 5. Restok Barang                            ==");
            System.out.println("== 6. Exit                                     ==");
            System.out.println("=================================================");
            System.out.print("Pilih menu (1-6): ");
            menu = input.nextInt();
            input.nextLine(); // consume the newline character

            switch (menu) {
                case 1:
                    System.out.print("Masukkan stok makanan ringan awal anda: ");
                    stok_makanan_ringan_awal = input.nextInt();
                    System.out.print("Masukkan stok minuman kaleng awal anda: ");
                    stok_minuman_kaleng_awal = input.nextInt();
                    System.out.print("Masukkan stok makanan ringan yang kadaluarsa: ");
                    stok_makanan_ringan_yang_kadaluarsa = input.nextInt();
                    System.out.print("Masukkan stok minuman kaleng yang kadaluarsa: ");
                    stok_minuman_kaleng_yang_kadaluarsa = input.nextInt();

                    stok_makanan_ringan_layak_konsumsi = stok_makanan_ringan_awal - stok_makanan_ringan_yang_kadaluarsa;
                    stok_minuman_kaleng_layak_konsumsi = stok_minuman_kaleng_awal - stok_minuman_kaleng_yang_kadaluarsa;

                    System.out.println("Stok makanan ringan layak konsumsi restoran anda adalah "
                            + stok_makanan_ringan_layak_konsumsi);
                    System.out.println("Stok minuman kaleng layak konsumsi restoran anda adalah "
                            + stok_minuman_kaleng_layak_konsumsi);

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Jumlah Snack yang kadaluarsa : " + stok_makanan_ringan_yang_kadaluarsa);
                    System.out.print("Masukkan harga snack : ");
                    harga = input.nextDouble();
                    totalSnack = (double) (stok_makanan_ringan_yang_kadaluarsa * harga);
                    System.out.println("Total kerugian snack kadaluarsa adalah " + totalSnack);

                    System.out.println("Jumlah minuman yang kadaluarsa : " + stok_minuman_kaleng_yang_kadaluarsa);
                    System.out.print("Masukkan harga Minuman Kaleng : ");
                    harga = input.nextDouble();
                    totalMnmKaleng = (double) (stok_minuman_kaleng_yang_kadaluarsa * harga);
                    System.out.println("Total kerugian minuman kaleng kadaluarsa adalah " + totalMnmKaleng);

                    kerugian = (double) (totalSnack + totalMnmKaleng);
                    System.out.println("Kerugian sebesar Rp. " + kerugian);

                    System.out.println();
                    break;

                case 3:
                    System.out.print("Masukkan masa kadaluarsa snack : ");
                    int snack = input.nextInt();
                    if (snack > 3) {
                        System.out.println("Tdk layak konsumsi");
                    } else
                        System.out.println("Layak konsumsi");

                    System.out.print("Masukkan masa kadaluarsa minuman kaleng : ");
                    int mnmKaleng = input.nextInt();
                    if (mnmKaleng > 3) {
                        System.out.println("Tdk layak konsumsi");
                    } else
                        System.out.println("Layak konsumsi");

                    System.out.println();

                    // Fitur Pengolahan Makanan Ringan & Minuman Kaleng Kadaluarsa Berdasarkan Ciri
                    // Fisik
                    System.out.println("Kondisi Minuman Kaleng");
                    System.out.print("susu (berubah/tidakberubah): ");
                    String susu = input.next();
                    if (susu.equalsIgnoreCase("berubah")) {
                        System.out.println("Buang");
                    } else if (susu.equalsIgnoreCase("tidakberubah")) {
                        System.out.println("Kasihkan Peliharaan");
                    } else {
                        System.out.println("Inputan Salah");
                    }
                    System.out.println();

                    System.out.print("soda (tidakSparkling/sparkling) = ");
                    String soda = input.next();
                    if (soda.equalsIgnoreCase("tidaksparkling")) {
                        System.out.println("Gunakan untuk membersihkan toilet");
                    } else if (soda.equalsIgnoreCase("sparkling")) {
                        System.out.println("Membersihkan panggangan");
                    } else {
                        System.out.println("Inputan Salah");
                    }
                    System.out.println();

                    System.out.println("Kondisi Makanan Ringan");
                    System.out.print("snack (tidakKrispi/krispi) = ");
                    String ciki = input.next();
                    if (ciki.equalsIgnoreCase("tidakkrispi")) {
                        System.out.println("Untuk pupuk");
                    } else if (ciki.equalsIgnoreCase("krispi")) {
                        System.out.println("Untuk pakan ternak");
                    } else {
                        System.out.println("Inputan Salah");
                    }
                    System.out.println();

                    break;

                case 4:
                    // Fitur Pengecekan Stok Barang Bahan
                    int barang1, barang2, barang3;

                    System.out.print("Masukkan stok barang bahan 1 :");
                    barang1 = input.nextInt();
                    System.out.print("Masukkan stok barang bahan 2 :");
                    barang2 = input.nextInt();
                    System.out.print("Masukkan stok barang bahan 3 : ");
                    barang3 = input.nextInt();

                    int total = barang1 + barang2 + barang3;

                    if ((total >= 60)) {
                        if ((barang1 == 20) && (barang2 == 20) && (barang3 == 20))
                            System.out.println("Stok barang aman");
                        else if ((barang1 + barang2 + barang3 >= 60))
                            System.out.println("Tidak perlu restok");
                    } else
                        System.out.println("Segera restok barang");

                    System.out.println();
                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Terima kasih");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-6.");
            }

        }
    }
}
