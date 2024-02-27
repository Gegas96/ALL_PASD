import java.util.Scanner;

public class Array11 {
    static Scanner gs = new Scanner(System.in);
    static String matkul[][] = new String[8][5];
    static double ips, hitNilai, sks;

    public static void main(String[] args) {

        matkul[0][0] = "Pancasila \t\t\t";
        matkul[1][0] = "Critical Thinking and Problem Solving";
        matkul[2][0] = "Konsep teknologi Informasi\t";
        matkul[3][0] = "Bahasa Inggris\t\t\t";
        matkul[4][0] = "Matematika Dasar\t\t";
        matkul[5][0] = "Dasar pemrograman\t\t";
        matkul[6][0] = "Praktikum Dasar Pemrograman\t";
        matkul[7][0] = "Keselamatan dan Kesehatan Kerja\t";

        data();
        tabelKonversi();
        nilaiIp();
        hasilAkhir();
    }

    public static void data() {
        System.out.println("============================");
        System.out.println("Program Hitung IP Semester");
        System.out.println("============================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai MK " + matkul[i][0] + ": ");
            matkul[i][1] = gs.next();
            System.out.print("Masukkan SKS MK " + matkul[i][0] + ": ");
            matkul[i][2] = gs.next();
            System.out.println();
        }
    }

    public static void tabelKonversi() {
        for (int i = 0; i < matkul.length; i++) {
            if (Double.valueOf(matkul[i][1]) > 80) {
                matkul[i][3] = "A";
                matkul[i][4] = "4.00";
            } else if (Double.valueOf(matkul[i][1]) > 73) {
                matkul[i][3] = "B+";
                matkul[i][4] = "3.50";
            } else if (Double.valueOf(matkul[i][1]) > 65) {
                matkul[i][3] = "B";
                matkul[i][4] = "3.00";
            } else if (Double.valueOf(matkul[i][1]) > 60) {
                matkul[i][3] = "C+";
                matkul[i][4] = "2.50";
            } else if (Double.valueOf(matkul[i][1]) > 50) {
                matkul[i][3] = "C";
                matkul[i][4] = "2.00";
            } else if (Double.valueOf(matkul[i][1]) > 39) {
                matkul[i][3] = "D";
                matkul[i][4] = "1.00";
            } else {
                matkul[i][3] = "E";
                matkul[i][4] = "1.00";
            }
        }

    }

    public static void nilaiIp() {
        for (int i = 0; i < matkul.length; i++) {
            hitNilai += (Double.valueOf(matkul[i][4]) * Double.valueOf(matkul[i][2]));
            sks += Double.valueOf(matkul[i][2]);
        }
        ips = hitNilai / sks;
    }

    public static void hasilAkhir() {
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.println("MK \t\t\t\t\t Nilai Angka \t Nilai Huruf \t Bobot NIlai \t\t SKS");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i][0] + "\t\t" + matkul[i][1] + "\t\t" + matkul[i][3] + "\t\t" + matkul[i][4]+ "\t\t" + matkul[i][2]);
        }
        System.out.println("==================");
        System.out.println("IPS: " + ips);
    }
}
