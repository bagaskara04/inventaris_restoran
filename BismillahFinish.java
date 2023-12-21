import java.util.Scanner;

public class BismillahFinish {
    static int rusak1 = 0, rusak2 = 0, rusak3 = 0, snackNo = 0, susuNo = 0, sodaNo = 0, restok1 = 0, restok2 = 0,
            restok3 = 0, harga1 = 0, harga2 = 0, harga3 = 0;
    static int snack = 0, susu = 0, soda = 0, menu, jual1 = 0, jual2 = 0, jual3 = 0, exp1 = 0, exp2 = 0, exp3 = 0,
            now, cek1 = 0, cek1a = 0, cek2 = 0, cek2a = 0, cek3 = 0, cek3a = 0, snackExp = 0, susuExp = 0, sodaExp = 0;
    static int rugi1 = 0, rugi2 = 0, rugi3 = 0, sisa1 = 0, sisa2 = 0, sisa3 = 0, gudang = 0, kerugian, beli1, beli2,
            beli3, modal, terlaris;
    static int banding1, banding2, banding3;
    static int out1, out2, out3, metu;
    static int[][] input = new int[3][];
    static int[][] input2 = new int[2][];
    static String[] barang = { "Snack", "Susu", "Soda" };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bilingual
        while (true) {
            System.out.println("===== INVENTARIS RESTORAN =====");
            System.out.println("===============================");
            System.out.println("== Menu 1 : Bahasa Indonesia ==");
            System.out.println("== Menu 2 : England          ==");
            System.out.println("== Menu 3 : Keluar           ==");
            System.out.println("===============================");
            System.out.print("Pilih Bahasa : ");
            int bahasa = sc.nextInt();
            switch (bahasa) {
                case 1:
                    LoginUserIndo();
                    break;
                case 2:
                    LoginUserEnglish();
                    break;
                case 3:
                    KeluarProgram();
                    break;
                default:
                    System.out.println("Pilihan anda salah");
                    break;
            }
        }
    }

    // Pilih Role Bahasa Indonesia
    static void LoginUserIndo() {
        System.out.println("===== INVENTARIS RESTORAN =====");
        System.out.println("===============================");
        System.out.println("== Menu 1 : Manajer          ==");
        System.out.println("== Menu 2 : Karyawan         ==");
        System.out.println("== Menu 3 : Keluar           ==");
        System.out.println("===============================");
        System.out.print("Pilih Role : ");
        int role = sc.nextInt();
        switch (role) {
            case 1:
                ManajerIndo();
                break;
            case 2:
                KaryawanIndo();
                break;
            default:
                break;
        }
    }

    // Pilih role bahasa inggris
    static void LoginUserEnglish() {
        System.out.println("===== INVENTARIS RESTORAN =====");
        System.out.println("===============================");
        System.out.println("== Menu 1 : Manager          ==");
        System.out.println("== Menu 2 : Staff            ==");
        System.out.println("== Menu 3 : Exit             ==");
        System.out.println("===============================");
        System.out.print("Pilih Role : ");
        int role = sc.nextInt();
        switch (role) {
            case 1:
                ManagerEnglish();
                break;
            case 2:
                StaffEnglish();
                break;
            default:
                break;
        }
    }

    static void ManajerIndo() {

        while (true) {
            System.out.println("===================== INVENTARIS RESTORAN ======================");
            System.out.println("============================ Manajer ===========================");
            System.out.println("== Menu 1: Restok Barang                                      =="); // manajer
            System.out.println("== Menu 2: Pelaporan Barang Masuk, Keluar, Rusak              =="); // manajer/staff
            System.out.println("== Menu 3: Pelaporan Barang Yang Paling Banyak Keluar & Habis =="); // manajer
            System.out.println("== Menu 4: Update Stok Barang                                 =="); // staff/manajer
            System.out.println("== Menu 5: Keluar                                             =="); // staff/manajer
            System.out.println("================================================================");
            System.out.print("Pilih Menu (1/2/3/4/5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    RestokBarang();
                    break;

                case 2:
                    LaporanBarangMKR();
                    break;

                case 3:
                    LaporanBarangKeluarHabis();
                    break;

                case 4:
                    UpdateStok();
                    break;

                case 5:
                    Keluar();
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1/2/3/4/5/6/7.");
            }

        }
    }

    static void KaryawanIndo() {
        while (true) {
            System.out.println("===================== INVENTARIS RESTORAN ======================");
            System.out.println("========================== Karyawan ============================");
            System.out.println("== Menu 1: Input Data Barang Masuk & Keluar                   ==");
            System.out.println("== Menu 2: Input Barang Rusak                                 ==");
            System.out.println("== Menu 3: Pelaporan Barang Masuk, Keluar, Rusak              ==");
            System.out.println("== Menu 4: Update Stok Barang                                 ==");
            System.out.println("== Menu 5: Keluar                                             ==");
            System.out.println("================================================================");
            System.out.print("Pilih Menu (1/2/3/4/5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    databarangMasukKeluar();
                    break;

                case 2:
                    inputBarangRusak();
                    break;

                case 3:
                    LaporanBarangMKR();
                    break;

                case 4:
                    UpdateStok();
                    break;

                case 5:
                    Keluar();
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1/2/3/4/5.");
            }

        }
    }

   static void ManagerEnglish() {

        while (true) {
            System.out.println("===================== INVENTARIS RESTORAN ======================");
            System.out.println("=========================== Manager ============================");
            System.out.println("== Menu 1: Restock Goods                                      =="); // manajer
            System.out.println("== Menu 2: Reporting of Goods In, Out, Damaged                =="); // manajer/staff
            System.out.println("== Menu 3: Reporting of Most Outgoing & Consumable Goods      =="); // manajer
            System.out.println("== Menu 4: Stock Goods Update                                 =="); // staff/manajer
            System.out.println("== Menu 5: Exit                                               =="); // staff/manajer
            System.out.println("================================================================");
            System.out.print("Choose Menu (1/2/3/4/5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    RestockGoods();
                    break;

                case 2:
                    ReportInOutDamagedGoods();
                    break;

                case 3:
                    ReportOutgoingConsumable();
                    break;

                case 4:
                    StockGoodsUpdate();
                    break;

                case 5:
                    Exit();
                    break;

                default:
                    System.out.println("Invalid Selection. Please Select Menu 1/2/3/4/5.");
            }

        }
    }

    static void StaffEnglish() {
        while (true) {
            System.out.println("===================== INVENTARIS RESTORAN ======================");
            System.out.println("============================ Staff =============================");
            System.out.println("== Menu 1: Incoming & Outgoing Goods Data Input               ==");
            System.out.println("== Menu 2: Damaged Goods Data Input                           ==");
            System.out.println("== Menu 3: Reporting of Goods In, Out, Damaged                ==");
            System.out.println("== Menu 4: Stock Goods Update                                 ==");
            System.out.println("== Menu 5: Exit                                             ==");
            System.out.println("================================================================");
            System.out.print("Choose Menu (1/2/3/4/5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    GoodsDataIn();
                    break;

                case 2:
                    DamagedGoodsInput();
                    break;

                case 3:
                    ReportInOutDamagedGoods();
                    break;

                case 4:
                    StockGoodsUpdate();
                    break;

                case 5:
                    Exit();
                    break;

                default:
                    System.out.println("Invalid Selection. Please Select Menu 1/2/3/4/5.");
            }

        }
    }

    static void KeluarProgram() {
        System.out.println("Terima kasih");
        System.exit(0);
    }

    /////////////////////////////////////////// Bahasa Indonesia
    /////////////////////////////////////////// //////////////////////////////////////////////////////////
    static void databarangMasukKeluar() {
        System.out.println("INPUT DATA MAKANAN RINGAN");
        System.out.println("=========================");
        System.out.print("Masukkan stok awal snack: ");
        snack = sc.nextInt();
        System.out.print("Masukkan bulan kadaluarsa (1-12): ");
        exp1 = sc.nextInt();
        System.out.print("Masukkan stok yang terjual: ");
        jual1 = sc.nextInt();

        System.out.println();

        System.out.println("INPUT DATA MINUMAN KALENG");
        System.out.println("=========================");
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
    }

    static void inputBarangRusak() {
        System.out.print("Masukkan bulan sekarang (1-12): ");
        now = sc.nextInt();

        System.out.println();

        System.out.println("MAKANAN RINGAN");
        System.out.println("==============");
        System.out.print("Masukkan jumlah snack yang rusak: ");
        rusak1 = sc.nextInt();
        cek1 = snack - jual1 - rusak1;
        if (now < exp1) {
            System.out.println("Total snack tidak kadaluarsa: " + cek1 + " buah");
            snackNo = cek1;
        } else
            System.out.println("Total snack kadaluarsa: " + cek1 + " buah");
        snackExp = cek1;

        System.out.println();

        System.out.println("MINUMAN KALENG");
        System.out.println("==============");
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

        // Perhitungan Total Kerugian
        System.out.println("PERHITUNGAN TOTAL KERUGIAN");
        System.out.println("==========================");
        System.out.print("Masukkan harga snack: ");
        harga1 = sc.nextInt();
        banding1 = Math.max(snackExp, snackNo);
        if (banding1 == snackNo) {
            rugi1 = rusak1 * harga1;
            System.out.println("Kerugian snack sebesar Rp. " + rugi1);
        } else if (banding1 == snackExp) {
            rugi1 = (snackExp + rusak1) * harga1;
            System.out.println("Kerugian snack sebesar Rp. " + rugi1);
        }

        System.out.print("Masukkan harga susu: ");
        harga2 = sc.nextInt();
        banding2 = Math.max(susuExp, susuNo);
        if (banding2 == susuNo) {
            rugi2 = rusak2 * harga2;
            System.out.println("Kerugian susu sebesar Rp. " + rugi2);
        } else if (banding2 == susuExp) {
            rugi2 = (susuExp + rusak2) * harga2;
            System.out.println("Kerugian susu sebesar Rp. " + rugi2);
        }

        System.out.print("Masukkan harga soda: ");
        harga3 = sc.nextInt();
        banding3 = Math.max(sodaExp, sodaNo);
        if (banding3 == sodaNo) {
            rugi3 = rusak3 * harga3;
            System.out.println("Kerugian soda sebesar Rp. " + rugi3);
        } else if (banding3 == sodaExp) {
            rugi3 = (sodaExp + rusak3) * harga3;
            System.out.println("Kerugian soda sebesar Rp. " + rugi3);
        }

        kerugian = rugi1 + rugi2 + rugi3;
        System.out.println("TOTAL KERUGIAN = Rp. " + kerugian);

        System.out.println();
    }

    static void RestokBarang() {
        System.out.println("RESTOK BARANG");
        System.out.println("=============");
        System.out.print("Masukkan jumlah barang yang harus tersedia digudang: ");
        gudang = sc.nextInt();

        // Pengecekan Stok Barang

        sisa1 = snack - snackExp - rusak1 - jual1;
        sisa2 = susu - susuExp - rusak2 - jual2;
        sisa3 = soda - sodaExp - rusak3 - jual3;

        System.out.println();

        System.out.println("CEK STATUS BARANG");
        System.out.println("=================");
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
        beli1 = restok1 * harga1;
        beli2 = restok2 * harga2;
        beli3 = restok3 * harga3;
        modal = beli1 + beli2 + beli3;
        System.out.println("PERHITUNGAN MODAL");
        System.out.println("=================");
        System.out.println("Modal beli snack: Rp. " + beli1);
        System.out.println("Modal beli susu: Rp. " + beli2);
        System.out.println("Modal beli soda: Rp. " + beli3);
        System.out.println("Total Modal yang diperlukan sebesar Rp. " + modal);
    }

    static void LaporanBarangMKR() {
        System.out.println("TAMPILAN DATA SNACK");
        System.out.println("===================");
        String[] jenis = { "Stok Awal", "Terjual", "Kadaluarsa", "Rusak" };
        System.out.printf("\t %s\t %s \t %s \t %s\n", jenis[0], jenis[1], jenis[2], jenis[3]);

        input = new int[][] {
                { snack, jual1, cek1, rusak1 },
                { susu, jual2, cek2, rusak2 },
                { soda, jual3, cek3, rusak3 }
        };
        System.out.printf("SNACK: " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[0][0], input[0][1],
                input[0][2], input[0][3]);
        System.out.printf("SUSU : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[1][0], input[1][1],
                input[1][2], input[1][3]);
        System.out.printf("SODA : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[2][0], input[2][1],
                input[2][2], input[2][3]);
    }

    static void LaporanBarangKeluarHabis() {
        terlaris = Math.max(jual1, Math.max(jual2, jual3));
        if (terlaris == jual1) {
            System.out.println("Produk terlaris: Snack, terjual sebanyak " + jual1);
        } else if (terlaris == jual2) {
            System.out.println("Produk terlaris: Susu, terjual sebanyak " + jual2);
        } else if (terlaris == jual3) {
            System.out.println("Produk terlaris: Soda, terjual sebanyak " + jual3);
        }

        out1 = rusak1 + snackExp + jual1;
        out2 = rusak2 + susuExp + jual2;
        out3 = rusak3 + sodaExp + jual3;
        metu = Math.max(out1, Math.max(out2, out3));
        if (metu == out1) {
            System.out.println("Produk terbanyak keluar: Snack, sebanyak " + out1);
        } else if (metu == out2) {
            System.out.println("Produk terbanyak keluar: Susu, sebanyak " + out2);
        } else if (metu == out3) {
            System.out.println("Produk terbanyak keluar: Soda, sebanyak " + out3);
        }
    }

    static void UpdateStok() {
        System.out.println("UPDATE STOK BARANG");
        System.out.println("==================");
        System.out.print("Jenis Barang   : ");
        System.out.printf("%s \t %s \t %s \n", barang[0], barang[1], barang[2]);

        input2 = new int[][] {
                { sisa1, sisa2, sisa3 },
                { gudang, gudang, gudang }
        };
        System.out.print("Sebelum        : ");
        System.out.printf("%s \t %s \t %s \n", input2[0][0], input2[0][1], input2[0][2]);
        System.out.print("Sesudah        : ");
        System.out.printf("%s \t %s \t %s \n", input2[1][0], input2[1][1], input2[1][2]);
    }

    static void Keluar() {
        System.out.println("Terima kasih");
        System.exit(0);
    }
    /////////////////////////////////////////////// Bahasa Inggris
    /////////////////////////////////////////////// //////////////////////////////////////////////////////////////////////////////

    static void GoodsDataIn() {
        System.out.println("SNACK DATA INPUT");
        System.out.println("================");
        System.out.print("Input the starting stock of snacks: ");
        snack = sc.nextInt();
        System.out.print("Enter expiration month (1-12): ");
        exp1 = sc.nextInt();
        System.out.print("Enter sold stock: ");
        jual1 = sc.nextInt();

        System.out.println();

        System.out.println("CANNED BEVERAGE DATA INPUT");
        System.out.println("==========================");
        System.out.print("Input the starting stock of milks: ");
        susu = sc.nextInt();
        System.out.print("Enter expiration month (1-12): ");
        exp2 = sc.nextInt();
        System.out.print("Enter sold stock: ");
        jual2 = sc.nextInt();
        System.out.print("Input the starting stock of sodas: ");
        soda = sc.nextInt();
        System.out.print("Enter expiration month (1-12): ");
        exp3 = sc.nextInt();
        System.out.print("Enter sold stock: ");
        jual3 = sc.nextInt();
    }

    static void DamagedGoodsInput() {
        System.out.print("Input the Current Month (1-12): ");
        now = sc.nextInt();

        System.out.println();

        System.out.println("SNACK");
        System.out.print("Masukkan jumlah snack yang rusak: ");
        rusak1 = sc.nextInt();
        cek1 = snack - jual1 - rusak1;
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

        // Perhitungan Total Kerugian
        System.out.println("PERHITUNGAN TOTAL KERUGIAN");
        System.out.print("Masukkan harga snack: ");
        harga1 = sc.nextInt();
        banding1 = Math.max(snackExp, snackNo);
        if (banding1 == snackNo) {
            rugi1 = rusak1 * harga1;
            System.out.println("Kerugian snack sebesar Rp. " + rugi1);
        } else if (banding1 == snackExp) {
            rugi1 = (snackExp + rusak1) * harga1;
            System.out.println("Kerugian snack sebesar Rp. " + rugi1);
        }

        System.out.print("Masukkan harga susu: ");
        harga2 = sc.nextInt();
        banding2 = Math.max(susuExp, susuNo);
        if (banding2 == susuNo) {
            rugi2 = rusak2 * harga2;
            System.out.println("Kerugian susu sebesar Rp. " + rugi2);
        } else if (banding2 == susuExp) {
            rugi2 = (susuExp + rusak2) * harga2;
            System.out.println("Kerugian susu sebesar Rp. " + rugi2);
        }

        System.out.print("Masukkan harga soda: ");
        harga3 = sc.nextInt();
        banding3 = Math.max(sodaExp, sodaNo);
        if (banding3 == sodaNo) {
            rugi3 = rusak3 * harga3;
            System.out.println("Kerugian soda sebesar Rp. " + rugi3);
        } else if (banding3 == sodaExp) {
            rugi3 = (sodaExp + rusak3) * harga3;
            System.out.println("Kerugian soda sebesar Rp. " + rugi3);
        }

        kerugian = rugi1 + rugi2 + rugi3;
        System.out.println("TOTAL KERUGIAN = Rp. " + kerugian);

        System.out.println();
    }

    static void RestockGoods() {
        System.out.println("RESTOCK GOODS");
        System.out.println("=============");
        System.out.print("Input the number of items that must be available in the warehouse: ");
        gudang = sc.nextInt();

        // Pengecekan Stok Barang

        sisa1 = snack - snackExp - rusak1 - jual1;
        sisa2 = susu - susuExp - rusak2 - jual2;
        sisa3 = soda - sodaExp - rusak3 - jual3;

        System.out.println();

        System.out.println("CHECK GOODS STATUS");
        System.out.println("==================");
        if (sisa1 >= gudang) {
            System.out.println("Snack Status: no restocking required");
        } else
            System.out.println("Snack Status: restock immediately");
        restok1 = gudang - sisa1;
        System.out.println("The amount of snack restocked is " + restok1 + " pieces");

        if ((sisa2 < gudang) && (sisa3 < gudang)) {
            if ((sisa2 == 10) && (sisa3 == 10))
                System.out.println("Status of canned beverages: safe stock");
            else if ((sisa2 < 10) || (sisa3 < 10))
                System.out.println("Canned Beverage Status: restock immediately");
            restok2 = gudang - sisa2;
            restok3 = gudang - sisa3;
            System.out.println("The amount of milk restocked is " + restok2 + " bottle");
            System.out.println("The amount of soda restocked is " + restok3 + " bottle");
        } else
            System.out.println("Status of canned beverages: no restocking required");

        System.out.println();

        // Perhitungan Modal
        beli1 = restok1 * harga1;
        beli2 = restok2 * harga2;
        beli3 = restok3 * harga3;
        modal = beli1 + beli2 + beli3;
        System.out.println("CAPITAL CALCULATION");
        System.out.println("===================");
        System.out.println("Capital to buy snacks   : Rp. " + beli1);
        System.out.println("Capital to buy milk     : Rp. " + beli2);
        System.out.println("Capital to buy soda     : Rp. " + beli3);
        System.out.println("Total capital required is : Rp. " + modal);
    }

    static void ReportInOutDamagedGoods() {
        System.out.println("SNACK DATA VIEW");
        System.out.println("===============");
        String[] jenis = { "Beginning Stock", "Sold", "Expired", "Damaged" };
        System.out.printf("\t %s %s \t\t %s \t %s\n", jenis[0], jenis[1], jenis[2], jenis[3]);

        input = new int[][] {
                { snack, jual1, cek1, rusak1 },
                { susu, jual2, cek2, rusak2 },
                { soda, jual3, cek3, rusak3 }
        };
        System.out.printf("SNACK: " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[0][0], input[0][1],
                input[0][2], input[0][3]);
        System.out.printf("MILK : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[1][0], input[1][1],
                input[1][2], input[1][3]);
        System.out.printf("SODA : " + "\t %s \t\t %s \t\t %s \t\t %s \n", input[2][0], input[2][1],
                input[2][2], input[2][3]);
    }

    static void ReportOutgoingConsumable() {
        terlaris = Math.max(jual1, Math.max(jual2, jual3));
        if (terlaris == jual1) {
            System.out.println("Best-selling products: Snack, sold as much as " + jual1);
        } else if (terlaris == jual2) {
            System.out.println("Best-selling products: Milk, sold as much as " + jual2);
        } else if (terlaris == jual3) {
            System.out.println("Best-selling products: Soda, sold as much as " + jual3);
        }

        out1 = rusak1 + snackExp + jual1;
        out2 = rusak2 + susuExp + jual2;
        out3 = rusak3 + sodaExp + jual3;
        metu = Math.max(out1, Math.max(out2, out3));
        if (metu == out1) {
            System.out.println("Most products out : Snack, as much as " + out1);
        } else if (metu == out2) {
            System.out.println("Most products out : Milk, as much as " + out2);
        } else if (metu == out3) {
            System.out.println("Most products out : Soda, as much as " + out3);
        }
    }

    static void StockGoodsUpdate() {
        System.out.println("UPDATE STOCK GOODS");
        System.out.println("==================");
        System.out.print("Type of Goods  : ");
        System.out.printf("%s \t %s \t %s \n", barang[0], barang[1], barang[2]);

        input2 = new int[][] {
                { sisa1, sisa2, sisa3 },
                { gudang, gudang, gudang }
        };
        System.out.print("Before         : ");
        System.out.printf("%s \t %s \t %s \n", input2[0][0], input2[0][1], input2[0][2]);
        System.out.print("After          : ");
        System.out.printf("%s \t %s \t %s \n", input2[1][0], input2[1][1], input2[1][2]);
    }

    static void Exit() {
        System.out.println("Thank You");
        System.exit(0);
    }
}