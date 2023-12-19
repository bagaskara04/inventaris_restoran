import java.util.Scanner;
public class BismillahFinish {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int rusak1 = 0, rusak2 = 0, rusak3 = 0, snackNo = 0, susuNo = 0, sodaNo = 0, restok1 = 0, restok2 = 0, restok3 = 0, harga1 = 0, harga2 = 0, harga3 = 0;
        int snack = 0, susu = 0, soda = 0, menu, jual1 = 0, jual2 = 0, jual3 = 0, exp1 = 0, exp2 = 0, exp3 = 0, now, cek1 = 0, cek2 = 0, cek3 = 0, snackExp = 0, susuExp = 0, sodaExp = 0;
        int rugi1 = 0, rugi2 = 0, rugi3 = 0, sisa1 = 0, sisa2 = 0, sisa3 = 0, gudang = 0;

        while (true) {
            System.out.println("Menu 1: Input Data Barang Masuk & Keluar");
            System.out.println("Menu 2: Input Barang Rusak");
            System.out.println("Menu 3: Restok Barang");
            System.out.println("Menu 4: Pelaporan Barang Masuk, Keluar, Rusak");
            System.out.println("Menu 5: Pelaporan Barang Yang Paling Banyak Keluar & Habis");
            System.out.println("Menu 6: Update Stok Barang");
            System.out.println("Menu 7: Exit");
            System.out.print("Pilih Menu (1/2/3/4/5/6/7): ");
            menu = sc.nextInt();

            switch (menu) {
                    case 1:
                    System.out.println("INPUT DATA MAKANAN RINGAN");
                    System.out.print("Masukkan stok awal snack: ");
                    snack = sc.nextInt();
                    System.out.print("Masukkan bulan kadaluarsa (1-12): ");
                    exp1 = sc.nextInt();
                    System.out.print("Masukkan stok yang terjual: ");
                    jual1 = sc.nextInt();
                    
                    System.out.println();

                    System.out.println("INPUT DATA MINUMAN KALENG");
                    System.out.print("Masukkan stok awal susu: ");
                    susu = sc.nextInt();
                    System.out.print("Masukkan bulan kadaluarsa (1-12): ");
                    exp2 = sc.nextInt();
                    System.out.print("Masukkan stok yang terjual: ");
                    jual2 = sc.nextInt();
                    System.out.print("Masukkan stok awal soda: ");
                    soda = sc.nextInt();
                    System.out.print("Masukkan bulan kadaluarsa (1-12): ");
                    exp3 = sc.nextInt();
                    System.out.print("Masukkan stok yang terjual: ");
                    jual3 = sc.nextInt();
                    break;
                
                case 2:
                System.out.print("Masukkan bulan sekarang (1-12): ");
                now = sc.nextInt();
                
                System.out.println();
                
                System.out.println("MAKANAN RINGAN");
                System.out.print("Masukkan jumlah snack yang rusak: ");
                rusak1 = sc.nextInt();
                cek1 = snack - jual1- rusak1;
                if (now < exp1) {
                    System.out.println("Total snack tidak kadaluarsa: " + cek1 + " buah");
                    snackNo = cek1;
                } else
                System.out.println("Total snack kadaluarsa: " + cek1 + " buah");
                snackExp = cek1;

                System.out.println();

                System.out.println("MINUMAN KALENG");
                System.out.print("Masukkan jumlah susu yang rusak: ");
                rusak2 = sc.nextInt();
                cek2 = susu - jual2 - rusak2;
                if (now < exp2) {
                    System.out.println("Total susu tidak kadaluarsa: " + cek2 + " buah");
                    susuNo = cek2;
                } else
                System.out.println("Total susu kadaluarsa: " + cek2 + " buah");
                susuExp = cek2;
                
                System.out.print("Masukkan jumlah soda yang rusak: ");
                rusak3 = sc.nextInt();
                cek3 = soda - jual3 - rusak3;
                if (now < exp3) {
                    System.out.println("Total soda tidak kadaluarsa: " + cek3 + " buah");
                    sodaNo = cek3;
                } else
                System.out.println("Total soda kadaluarsa: " + cek3 + " buah");
                sodaExp = cek3;

                System.out.println();

                //Perhitungan Total Kerugian
                System.out.println("PERHITUNGAN TOTAL KERUGIAN");
                System.out.print("Masukkan harga snack: ");
                harga1 = sc.nextInt();
                int banding1 = Math.max(snackExp, snackNo);
                if (banding1 == snackNo) {
                    rugi1 = rusak1 * harga1;
                    System.out.println("Kerugian snack sebesar Rp. " + rugi1);
                } else if (banding1 == snackExp) {
                    rugi1 = (snackExp + rusak1) * harga1;
                    System.out.println("Kerugian snack sebesar Rp. " + rugi1);
                }
                
                System.out.print("Masukkan harga susu: ");
                harga2 = sc.nextInt();
                int banding2 = Math.max(susuExp, susuNo);
                if (banding2 == susuNo) {
                    rugi2 = rusak2 * harga2;
                    System.out.println("Kerugian susu sebesar Rp. " + rugi2);
                } else if (banding2 == susuExp) {
                    rugi2 = (susuExp + rusak2) * harga2;
                    System.out.println("Kerugian susu sebesar Rp. " + rugi2);
                }
                
                System.out.print("Masukkan harga soda: ");
                harga3 = sc.nextInt();
                int banding3 = Math.max(sodaExp, sodaNo);
                if (banding3 == sodaNo) {
                    rugi3 = rusak3 * harga3;
                    System.out.println("Kerugian soda sebesar Rp. " + rugi3);
                    break;
                } else if (banding3 == sodaExp) {
                    rugi3 = (sodaExp + rusak3) * harga3;
                    System.out.println("Kerugian soda sebesar Rp. " + rugi3);
                }
            
                int kerugian = rugi1 + rugi2 + rugi3;
                System.out.println("TOTAL KERUGIAN = Rp. " + kerugian);

                System.out.println();
                break;

                case 3:
                System.out.println("RESTOK BARANG");
                System.out.print("Masukkan jumlah barang yang harus tersedia digudang: ");
                gudang = sc.nextInt();

                //Pengecekan Stok Barang
                sisa1 = snack - snackExp - rusak1;
                sisa2 = susu - susuExp - rusak2;
                sisa3 = soda - sodaExp - rusak3;

                System.out.println();

                System.out.println("CEK STATUS BARANG");
                if (sisa1 >= gudang) {
                    System.out.println("Status Makanan Ringan: tidak perlu restok");
                } else
                System.out.println("Status Makanan Ringan: segera restok");
                restok1 = gudang - sisa1;
                System.out.println("Jumlah snack yang direstok sebanyak: " + restok1 + " buah");

                if ((sisa2 < gudang) && (sisa3 < gudang)) {
                    if ((sisa2 == 10) && (sisa3 == 10))
                    System.out.println("Status Minuman Kaleng: stok aman");
                    else if ((sisa2 < 10) || (sisa3 < 10))
                    System.out.println("Status Minuman Kaleng: segera restok");
                    restok2 = gudang - sisa2;
                    restok3 = gudang - sisa3;
                    System.out.println("Jumlah susu yang direstok sebanyak: " + restok2 + " buah");
                    System.out.println("Jumlah soda yang direstok sebanyak: " + restok3 + " buah");
                } else
                System.out.println("Status Minuman Kaleng: tidak perlu restok");

                System.out.println();
                
                // Perhitungan Modal
                int beli1 = restok1 * harga1;
                int beli2 = restok2 * harga2;
                int beli3 = restok3 * harga3;
                int modal = beli1 + beli2 + beli3;
                System.out.println("PERHITUNGAN MODAL");
                System.out.println("Modal beli snack: Rp. " + beli1);
                System.out.println("Modal beli susu: Rp. " + beli2);
                System.out.println("Modal beli soda: Rp. " + beli3);
                System.out.println("Total Modal yang diperlukan sebesar Rp. " + modal);
                break;

                case 4:
                System.out.println("TAMPILAN DATA SNACK");
                
                String[] jenis = {"Stok Awal", "Terjual", "Kadaluarsa", "Rusak"};
                System.out.printf("\t %s\t %s \t %s \t %s\n", jenis[0], jenis[1], jenis[2], jenis[3]);

                int[][] input = new int[][] {
                    {snack, jual1, cek1, rusak1},
                    {susu, jual2, cek2, rusak2},
                    {soda, jual3, cek3, rusak3}
                };
                System.out.printf("SNACK: " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[0][0], input[0][1], input[0][2], input[0][3]);
                System.out.printf("SUSU : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[1][0], input[1][1], input[1][2], input[1][3]);
                System.out.printf("SODA : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[2][0], input[2][1], input[2][2], input[2][3]);
                break;

                case 5:
                int terlaris = Math.max(jual1, Math.max(jual2, jual3));
                if (terlaris == jual1) {
                    System.out.println("Produk terlaris: Snack, terjual sebanyak " + jual1);
                } else if (terlaris == jual2) {
                    System.out.println("Produk terlaris: Susu, terjual sebanyak " + jual2);
                } else if (terlaris == jual3) {
                    System.out.println("Produk terlaris: Soda, terjual sebanyak " + jual3);
                }

                int out1 = rusak1 + snackExp;
                int out2 = rusak2 + susuExp;
                int out3 = rusak3 + sodaExp;
                int metu = Math.max(out1, Math.max(out2, out3));
                if (metu == out1) {
                    System.out.println("Produk terbanyak keluar: Snack, sebanyak " + out1);
                } else if (metu == out2) {
                    System.out.println("Produk terbanyak keluar: Susu, sebanyak " + out2);
                } else if (metu == out3) {
                    System.out.println("Produk terbanyak keluar: Soda, sebanyak " + out3);
                }
                break;

                case 6:
                System.out.println("UPDATE STOK BARANG");
                System.out.print("Jenis Barang   : ");
                String[] barang = {"Snack", "Susu", "Soda"};
                System.out.printf("%s \t %s \t %s \n", barang[0], barang[1], barang[2]);

                int[][] input2 = new int[][] {
                    {sisa1, sisa2, sisa3},
                    {gudang, gudang, gudang}
                };
                System.out.print("Sebelum        : ");
                System.out.printf("%s \t %s \t %s \n", input2[0][0], input2[0][1], input2[0][2]);
                System.out.print("Sesudah        : ");
                System.out.printf("%s \t %s \t %s \n", input2[1][0], input2[1][1], input2[1][2]);
                break;

                case 7:
                System.out.println("Terima kasih");
                System.exit(0);
                break;

                default:
                System.out.println("Pilihan tidak valid. Silakan pilih menu 1/2/3/4/5/6/7.");
            }

            


        }
    }
}