import java.util.Scanner;

public class NasabahMain11 {
    public static void menu() {
        System.out.println();
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian terbelakang");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Nasabah11 antrian = new Nasabah11(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah11 nb = new Nasabah11(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antrian.Enqueue(nb);
                    break;
                case 2:
                    Nasabah11 data = antrian.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && !"".equals(data.umur) && !"".equals(data.saldo)) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
