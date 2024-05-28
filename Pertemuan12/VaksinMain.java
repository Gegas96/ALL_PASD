import java.util.Scanner;

public class VaksinMain {
    public static void menu() {
        System.out.println("-------------------------------");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data pengantri vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        System.out.println("-------------------------------");

    }

    public static void main(String[] args) throws Exception {
        Scanner gs = new Scanner(System.in);
        DllVaksin dll = new DllVaksin();

        int pilih;
        do {
            menu();
            pilih = gs.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int antri = gs.nextInt();
                    System.out.print("Nama Penerima: ");
                    String nama = gs.next();
                    Vaksin nb = new Vaksin(antri, nama);
                    dll.addLast(nb);
                    System.out.println();
                    break;
                case 2:
                    Vaksin penerima = dll.getFirst();
                    System.out.println(penerima.nama + " telah selesai divaksin");
                    dll.removeFirst();
                    dll.print();
                    break;
                case 3:
                    System.out.println("========================");
                    System.out.println("Daftar pengantri vaksin");
                    System.out.println("========================");
                    dll.print();
                    System.out.println("Sisa Antrian: " + dll.size());
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        gs.close();
    }
}
