import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PelaporanBarang {
    public static class Barang {
        String nama;
        int stok;

        Barang(String nama, int stok) {
            this.nama = nama;
            this.stok = stok;
        }
    }

    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    static int total = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Manajemen Inventaris Restoran ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Laporan Barang Masuk");
            System.out.println("3. Laporan Barang Keluar");
            System.out.println("4. Laporan Barang Rusak");
            System.out.println("5. Laporan Barang Stok Paling Banyak Keluar");
            System.out.println("6. Laporan Barang Stok Habis");
            System.out.println("7. Input sisa makanan ringan");
            System.out.println("8. Input sisa minuman kaleng");
            System.out.println("9. Tampilkan sisa barang");
            System.out.println("10. Tampilkan jumlah barang yang direstok");
            System.out.println("11. Keluar");
            System.out.print("Pilih menu (1-11): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    laporanBarangMasuk();
                    break;
                case 3:
                    laporanBarangKeluar();
                    break;
                case 4:
                    laporanBarangRusak();
                    break;
                case 5:
                    laporanBarangStokBanyakKeluar();
                    break;
                case 6:
                    laporanBarangStokHabis();
                    break;
                case 7:
                    inputSisaBarang("Makanan Ringan");
                    break;
                case 8:
                    inputSisaBarang("Minuman Kaleng");
                    break;
                case 9:
                    tampilkanSisaBarang();
                    break;
                case 10:
                    tampilkanJumlahBarangDirestok();
                    break;
                case 11:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    static void tambahBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan stok barang: ");
        int stokBarang = scanner.nextInt();

        daftarBarang.add(new Barang(namaBarang, stokBarang));
        System.out.println("Barang berhasil ditambahkan.");
    }

    static void laporanBarangMasuk() {
        System.out.println("\n=== Laporan Barang Masuk ===");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama Barang: " + barang.nama + ", Stok Masuk: " + barang.stok);
        }
    }

    static void laporanBarangKeluar() {
        System.out.println("\n=== Laporan Barang Keluar ===");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama Barang: " + barang.nama + ", Stok Keluar: " + barang.stok);
        }
    }

    static void laporanBarangRusak() {
        System.out.println("\n=== Laporan Barang Rusak ===");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama Barang: " + barang.nama + ", Stok Rusak: " + barang.stok);
        }
    }

    static void laporanBarangStokBanyakKeluar() {
        System.out.println("\n=== Laporan Barang Stok Paling Banyak Keluar ===");
        Collections.sort(daftarBarang, Comparator.comparingInt(barang -> -barang.stok));
        System.out.println("Nama Barang: " + daftarBarang.get(0).nama + ", Stok Keluar Terbanyak: " + daftarBarang.get(0).stok);
    }

    static void laporanBarangStokHabis() {
        System.out.println("\n=== Laporan Barang Stok Habis ===");
        for (Barang barang : daftarBarang) {
            if (barang.stok == 0) {
                System.out.println("Nama Barang: " + barang.nama + ", Stok Habis");
            }
        }
    }

    static void inputSisaBarang(String kategori) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan sisa " + kategori + ": ");
            int sisa = scanner.nextInt();
            daftarBarang.add(new Barang(kategori, sisa));

            System.out.print("Input sisa " + kategori + " lainnya? (y/n): ");
            scanner.nextLine();
            String next = scanner.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    static void tampilkanSisaBarang() {
        System.out.println("Tampilkan sisa barang: ");
        for (Barang barang : daftarBarang) {
            System.out.println("Kategori: " + barang.nama + ", Sisa: " + barang.stok);
        }
    }

    static void tampilkanJumlahBarangDirestok() {
        System.out.println("Tampilkan jumlah barang yang direstok: ");
        for (Barang barang : daftarBarang) {
            int beli = total - barang.stok;
            if (beli > 0) {
                System.out.println("Kategori: " + barang.nama + ", Jumlah yang direstok: " + beli);
            }
        }
    }
}
