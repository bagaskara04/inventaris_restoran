import java.util.Scanner;

public class KelJobsheet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 60;

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
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan sisa makanan ringan: ");
                        int sisa = sc.nextInt();
                        System.out.print("Masukkan baris (0): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (0/1/2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine();
                        makananRingan[baris][kolom] = sisa;

                        System.out.print("Input sisa makanan ringan lainnya? (y/n): ");
                        String next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.print("Masukkan sisa minuman kaleng: ");
                        int sisa = sc.nextInt();
                        System.out.print("Masukkan baris (0): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (0/1/2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine();
                        minumanKaleng[baris][kolom] = sisa;

                        System.out.print("Input sisa minuman kaleng lainnya? (y/n): ");
                        String next = sc.nextLine();

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
                                int beli = total - makananRingan[b][k];
                                if (beli > 0) {
                                    System.out.print(" " + beli + " ");
                                }
                            }
                        }
                        System.out.println();

                        System.out.print("Minuman Kaleng: ");
                        for (int b = 0; b < minumanKaleng.length; b++) {
                            for (int k = 0; k < minumanKaleng[b].length; k++) {
                                int beli = total - minumanKaleng[b][k];
                                if (beli > 0) {
                                    System.out.print(" " + beli + " ");
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
