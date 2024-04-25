import java.util.Scanner;

public class PembeliMain11 {
    public static void menu() {
        System.out.println();
        System.out.println("Pilih menu:");
        System.out.println("1. Pasien baru");
        System.out.println("2. Pasien keluar");
        System.out.println("3. Cek pasien terdepan");
        System.out.println("4. Cek semua pasien");
        System.out.println("5. Cek pasien terbelakang");
        System.out.println("6. Cek pasien berdasarkan nama: ");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Queue antrian = new Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No Id: ");
                    int noId = sc.nextInt();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jK = sc.next();
                    Pembeli11 nb = new Pembeli11(nama, noId, umur, jK.charAt(0));
                    sc.nextLine();
                    antrian.Enqueue(nb);
                    break;
                case 2:
                    Pembeli11 data = antrian.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noId) && !"".equals(data.umur)
                            && !"".equals(data.jK)) {
                        System.out.println("Pasien yang keluar: " + data.nama + " " + data.noId + " " + data.umur
                                + " " + data.jK);
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
                case 6:
                    System.out.print("Masukkan nama pasien: ");
                    String dptNama = sc.next();
                    antrian.peekPosition(dptNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
