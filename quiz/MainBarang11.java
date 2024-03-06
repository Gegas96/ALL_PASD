import java.util.Scanner;

public class MainBarang11 {
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);
        
        Barang11 barang11 = new Barang11();
        TransaksiBarang11 transaksiBarang11 = new TransaksiBarang11();
        Pembelian11 pembelian11 = new Pembelian11();
        int pil = 0;

        Barang11[] data = new Barang11[5];
        TransaksiBarang11[] pembelian = new TransaksiBarang11[100];

        data[0] = new Barang11("K01", "Aqua", 3000, 10);
        data[1] = new Barang11("K02", "Pensil", 1000, 15);
        data[2] = new Barang11("K03", "Bulpen", 2000, 15);
        data[3] = new Barang11("K04", "Sandal", 5000, 5);
        data[4] = new Barang11("K05", "Permen", 2000, 10);

        while (true) {
            System.out.println("====================");
            System.out.println("TOKO MADURA");
            System.out.println("====================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print( "Pilih [1-4] : ");
            pil = gs.nextInt();

            switch (pil) {
                case 1:
                    barang11.tampilInfo(data);
                    break;
                case 2:
                    barang11.tampilInfo(data);
                    pembelian = transaksiBarang11.inputTransaksi(pembelian, data);
                    break;
                case 3:
                    pembelian11.pembelian(pembelian, data);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan Pilih Lagi.");

                    break;
            }
        }
    }
}