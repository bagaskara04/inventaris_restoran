import java.util.Scanner;
public class InventarisRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //JOBSHEET 3 Variabel, Tipe Data, Operator dan Input Output
        //Fitur Perhitungan Stok Makanan Ringan Layak Konsumsi & Stok Minuman Kaleng Layak Konsumsi
        int stok_makanan_ringan_awal, stok_minuman_kaleng_awal, stok_makanan_ringan_yang_kadaluarsa, stok_minuman_kaleng_yang_kadaluarsa, stok_makanan_ringan_layak_konsumsi, stok_minuman_kaleng_layak_konsumsi;
        
        System.out.print("Masukkan stok makanan ringan awal anda: ");
        stok_makanan_ringan_awal = input.nextInt();
        System.out.print("Masukkan stok minuman kaleng awal anda: ");
        stok_minuman_kaleng_awal = input.nextInt();
        System.out.print("Masukkan stok makanan ringan yang kadaluarsa: ");
        stok_makanan_ringan_yang_kadaluarsa = input.nextInt();
        System.out.print("Masukkan stok minuman kaleng yang kadaluarsa: ");
        stok_minuman_kaleng_yang_kadaluarsa = input.nextInt();

        stok_makanan_ringan_layak_konsumsi = (int) (stok_makanan_ringan_awal - stok_makanan_ringan_yang_kadaluarsa);
        stok_minuman_kaleng_layak_konsumsi = (int) (stok_minuman_kaleng_awal - stok_minuman_kaleng_yang_kadaluarsa);

        System.out.println("Stok makanan ringan layak konsumsi restoran anda adalah " + stok_makanan_ringan_layak_konsumsi);
        System.out.println("Stok minuman kaleng layak konsumsi restoran anda adalah " + stok_minuman_kaleng_layak_konsumsi);

        System.out.println();

        //JOBSHEET 4 Pseudocode & Flowchart
        //Fitur Perhitungan Kerugian Makanan Ringan & Minuman Kaleng
        int jmlSnack, jmlMnmKaleng;
        double totalSnack, totalMnmKaleng, harga, kerugian;

        System.out.print("Masukkan jumlah snack yang kadaluarsa: ");
        jmlSnack = input.nextInt();
        System.out.print("Masukkan harga snack: ");
        harga = input.nextDouble();
        totalSnack = (double) (jmlSnack * harga);
        System.out.println("Total kerugian snack kadaluarsa adalah " + totalSnack);

        System.out.print("Masukkan jumlah Minuman Kaleng yang kadaluarsa: ");
        jmlMnmKaleng = input.nextInt();
        System.out.print("Masukkan harga Minuman Kaleng: ");
        harga = input.nextDouble();
        totalMnmKaleng = (double) (jmlMnmKaleng * harga);
        System.out.println("Total kerugian minuman kaleng kadaluarsa adalah " + totalMnmKaleng);

        kerugian = (double) (totalSnack + totalMnmKaleng);
        System.out.println("Kerugian bulan ini sebesar Rp. " + kerugian);

        System.out.println();
        
        //JOBSHEET 5 Pemilihan 1
        //Fitur Penyortiran Makanan Ringan & Minuman Kaleng Berdasarkan Masa Kadaluarsa 
        System.out.println("Masukkan masa kadaluarsa snack : ");
        int snack = input.nextInt();
        if (snack > 3) {
            System.out.println("Tdk layak konsumsi");
        } else
            System.out.println("Layak konsumsi");
        
        System.out.println("Masukkan masa kadaluarsa minuman kaleng : ");
        int mnmKaleng = input.nextInt();
        if (mnmKaleng > 3) {
            System.out.println("Tdk layak konsumsi");
        } else
            System.out.println("Layak konsumsi");
        
        System.out.println();
        
        //Fitur Pengolahan Makanan Ringan & Minuman Kaleng Kadaluarsa Berdasarkan Ciri Fisik
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

        //JOBSHEET 6 Pemilihan 2
        //Fitur Pengecekan Stok Barang
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

        System.out.println();

        //JOBSHEET 7 Perulangan 1
        //Fitur Restok Barang
        String jenis, kategori1;
        int restok = 60, sisa, beli, price = 5000;
        double disc = 0.05, modal = 0.0;

        System.out.println("*****RESTOK BARANG*****");
        System.out.print("Masukkan jenis barang (Makanan Ringan/Minuman Kaleng) : ");
        kategori1 = input.nextLine();
        input.nextLine();
        System.out.print("Masukkan sisa barang : ");
        sisa = input.nextInt();

        beli = (int) restok - sisa;
        System.out.println("Jadi jumlah barang yang dibeli sebanyak " + beli + " buah");

        //Fitur Tambahan Perhitungan Modal
        System.out.println("*****PERHITUNGAN MODAL*****");
        do {
            if ((beli > 0)) {
                if (beli >= 30) {
                    modal = (double) beli * price - price * disc; 
                    System.out.println("Modal yang diperlukan : " + modal);
                } else {
                    modal = (double) beli * price;
                    System.out.println("Modal yang diperlukan : " + modal);
                }     
            } else
            System.out.println("Masukkan salah");
        } while (beli == 0);

        //JOBSHEET 9 Array 1
        //Fitur Restok Barang

        int restook = 60;
        double diskon = 0.1, modaal = 0, hargaa = 5000;

        System.out.print("Masukkan jenis barang (Makanan Ringan/Minuman Kaleng) : ");
        String jns = input.nextLine();
        input.nextLine();
        System.out.print("Masukkan jumlah barang : ");
        int barang = input.nextInt();

        int[] sisaBarang = new int[barang];
        for (int i = 0; i < sisaBarang.length; i++) {
            System.out.print("Masukkan sisa barang ke-" + (i + 1) + " : ");
            sisaBarang[i] = input.nextInt();
            int belii = (int) restook - sisaBarang[i];
            System.out.println("Jumlah barang yang dibeli : " + belii);
            if((belii != 0)) { //Perhitungan Modal
                if (belii >= 30) {
                modaal = (double) belii * (hargaa - hargaa * diskon); 
                System.out.println("Modal yang diperlukan Rp." + modaal);
                } else
                modaal = (double) belii * hargaa;
                System.out.println("Modal yang diperlukan Rp." + modaal);
            } else
            System.out.println("Modal yang diperlukan Rp.0");
        }

        //JOBSHEET 10 Array 2
        //Fitur Restok Barang

        int jml = 60;

        int[][] makananRingan = new int[1][3];
        int[][] minumanKaleng = new int[1][3];

        System.out.println("RESTOK BARANG RESTORAN");

        while (true) {
            System.out.println("Menu 1: Input sisa makanan ringan");
            System.out.println("Menu 2: Input sisa minuman kaleng");
            System.out.println("Menu 3: Tampilkan sisa barang");
            System.out.println("Menu 4: Tampilkan jumlah barang yang direstok");
            System.out.println("Menu 5: Exit");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                while (true) {
                    System.out.print("Masukkan sisa makanan ringan: ");
                    int sisaa = input.nextInt();
                    System.out.print("Masukkan baris (0): ");
                    int baris = input.nextInt();
                    System.out.print("Masukkan kolom (0/1/2): ");
                    int kolom = input.nextInt();
                    input.nextLine();
                    makananRingan[baris][kolom] = sisaa;
                    
                    System.out.print("Input sisa makanan ringan lainnya? (y/n): ");
                    String next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;

                case 2:
                while (true) {
                    System.out.print("Masukkan sisa minuman kaleng: ");
                    int sisaa = input.nextInt();
                    System.out.print("Masukkan baris (0): ");
                    int baris = input.nextInt();
                    System.out.print("Masukkan kolom (0/1/2): ");
                    int kolom = input.nextInt();
                    input.nextLine();
                    minumanKaleng[baris][kolom] = sisaa;
                    
                    System.out.print("Input sisa minuman kaleng lainnya? (y/n): ");
                    String next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }
                break;
                
                case 3:
                    System.out.println("Tampilkan sisa barang");
                    System.out.print("Makanan Ringan: ");
                    for (int b = 0; b < makananRingan.length; b++) {
                        for (int k = 0; k < makananRingan[b].length; k++) {
                            if (makananRingan[b][k] != 0) {
                                System.out.print(makananRingan[b][k] + "\t");
                            } else {
                                System.out.print("***\t");
                            }
                        }
                    }
                    System.out.println();

                    System.out.print("Minuman Kaleng: ");
                    for (int b = 0; b < minumanKaleng.length; b++) {
                        for (int k = 0; k < minumanKaleng[b].length; k++) {
                            if (minumanKaleng[b][k] != 0) {
                                System.out.print(minumanKaleng[b][k] + "\t");
                            } else {
                                System.out.print("***\t");
                            }
                        }
                    }
                    System.out.println();
                    break;
                

                case 4:
                while (true) {
                    System.out.println("Tampilkan jumlah barang yang direstok");
                    System.out.print("Makanan Ringan: ");
                    for (int b = 0; b < makananRingan.length; b++) {
                        for (int k = 0; k < makananRingan[b].length; k++) {
                            int beeli = jml - makananRingan[b][k];
                            if (beeli > 0) {
                                System.out.print(" " + beeli + " ");
                            }
                        }
                    } 
                    System.out.println();
                
                    System.out.print("Minuman Kaleng: ");
                    for (int b = 0; b < minumanKaleng.length; b++) {
                        for (int k = 0; k < minumanKaleng[b].length; k++) {
                            int beeli = total - minumanKaleng[b][k];
                            if (beeli > 0) {
                            System.out.print(" " + beeli + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                }
                break;
                
                case 5:
                    System.out.println("Terima kasih");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1/2/3/4.");
            }
        }
    }
}