import java.util.Scanner;
public class CodingKondisi1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);

        System.out.println("Penyortiran Makanan Ringan dan Minuman Kaleng berdasarkan Masa Kadaluarsa");
        System.out.println("Masukkan masa kadaluarsa snack :");
        
        System.out.print("snack= ");
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
    }
}