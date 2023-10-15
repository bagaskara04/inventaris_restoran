import java.util.Scanner;
public class CodingKondisi1 {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penyortiran Makanan Ringan dan Minuman Kaleng berdasarkan Masa Kadaluarsa");
        System.out.println("Masukkan masa kadaluarsa snack :");
        
        System.out.print("snack= ");
        String snack = scanner.nextLine();
        if (snack.equals("lebihTigaBln")) {
            System.out.println("Tdk layak konsumsi");
        }
        else {
            System.out.println("Layak konsumsi");
        }

        System.out.println("Masukkan masa kadaluarsa minuman kaleng :");
        System.out.print("mnmKaleng= ");
        String mnmKaleng = scanner.nextLine();
        if (mnmKaleng.equals("lebihTigaBln")) {
            System.out.println("Tdk layak konsumsi");
        }
        else {
            System.out.println("Layak konsumsi");
        }
            
    }
}