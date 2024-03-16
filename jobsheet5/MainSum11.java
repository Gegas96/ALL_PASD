import java.util.Scanner;

public class MainSum11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        Sum11[] perusa = new Sum11[elm];

        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int month = sc.nextInt();
            perusa[i] = new Sum11(month);

            System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1));
            for (int j = 0; j < perusa[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                perusa[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("==============================================================");
        for (int i = 0; i < elm; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusa[i].elemen + " bulan adalah = " + String.format("%.2f",perusa[i].totalBF(perusa[i].keuntungan)));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusa[i].elemen + " bulan adalah = " + String.format("%.2f",perusa[i].totalDC(perusa[i].keuntungan, 0, phs[i].elemen - 1)));
            System.out.println("==============================================================");
        }
    }
}
