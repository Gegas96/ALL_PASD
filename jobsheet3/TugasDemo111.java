import java.util.Scanner;
public class TugasDemo111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan jumlah mahasiswa yang ingin di data : ");
        jumlah = sc.nextInt();

        Tugas111[] mahasiswa = new Tugas111[jumlah];
        double ipk;
        String nama, nim, jenisKelamin;

       
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            mahasiswa[i] = new Tugas111(nama, nim, jenisKelamin, ipk);
            System.out.println();
        }
        Tugas111 tugas111 = new Tugas111();
        tugas111.cetakInfo(mahasiswa);
        sc.close();
    }
}