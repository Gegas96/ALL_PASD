import java.util.Scanner;

public class TugasDemo211 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Tugas211[] pembayaran = new Tugas211[2]; 
    int jumlahHari, hargaKamar;
    String tipePembayaran, tipeKamar, tanggalPembayaran;

    for (int i = 0; i < pembayaran.length; i++) {
        System.out.print("Masukkan tipe pembayaran: ");
        tipePembayaran = sc.next();
        System.out.print("Masukkan tanggal pembayaran: ");
        tanggalPembayaran = sc.next();
        System.out.print("Masukkan tipe kamar: ");
        tipeKamar = sc.next();
        System.out.print("Masukkan harga kamar: ");
        hargaKamar = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();

        pembayaran[i] = new Tugas211(tipePembayaran, tanggalPembayaran, tipeKamar, jumlahHari, hargaKamar);
        System.out.println();
    }
        Tugas211 tugas211 = new Tugas211();
        tugas211.cetakInfo(pembayaran);
        sc.close();
  }  
}
