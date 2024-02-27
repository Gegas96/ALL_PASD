import java.util.Scanner;

public class Tugas111 {
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);
        int no = -1;
        String plat = "";

        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' '}
        };

        System.out.print("Masukkan kode plat: ");
        plat = gs.nextLine().toUpperCase();

        for(int i = 0; i < kode.length; i++){
            if (kode[i] == plat.charAt(0)) {
                no = i;
                break;
            }
        }

        if (no != -1) {
            System.out.println("Kota: " +new String(kota[no]));
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
        gs.close();
    }
}
