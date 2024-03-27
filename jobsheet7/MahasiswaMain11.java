import java.util.Scanner;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumMhs;
        // Scanner sl = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.print("Masukkan data yang ingin ditambahkan: ");
        jumMhs = s.nextInt();

        PencarianMhs11 data = new PencarianMhs11(jumMhs);
        System.out.println("----------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s.next();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa11 m = new Mahasiswa11(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println ("Pencarian Data : ");
        System.out.println ("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print ("Nama : ");
        String cari = s.next();
        System.out.println("=========================================");
        System.out.println("Menggunakan binary search");
        // posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.countSearchName(cari);
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1, 0 );
        data.TampilposisiNama(cari, posisi);
        data.TampilDataNama(cari, posisi);
        // System. out.println ("menggunakan sequential search") ;
        // int posisi = data. FindSeqSearch (cari);

        // data.Tampilposisi(cari, posisi);
        // data.tampilData(cari, posisi);

       
    }
}
