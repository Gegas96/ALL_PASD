import java.util.Scanner;

public class Pemilihan11 {
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double nilaiAkhir;
        String statusLulus, konversiNilai;

        System.out.println("Program menghitung nilai akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai Tugas: ");
        tugas = gs.nextInt();
        System.out.print("Masukkan nilai Kuis: ");
        kuis = gs.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts = gs.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = gs.nextInt();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid!");
        }

        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            konversiNilai = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            konversiNilai = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            konversiNilai = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            konversiNilai = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            konversiNilai = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            konversiNilai = "D";
        } else {
            konversiNilai = "E";
        }

        if (konversiNilai.equals("A") || konversiNilai.equals("B+") || konversiNilai.equals("B")
            || konversiNilai.equals("C+") || konversiNilai.equals("C")) {

            statusLulus = "LULUS!";
        } else {
            statusLulus = "TIDAK LULUS!";
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + konversiNilai);
        System.out.println("=============");
        System.out.println(statusLulus);

        gs.close();
    }
}