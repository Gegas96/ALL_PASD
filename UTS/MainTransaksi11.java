import java.util.Scanner;

public class MainTransaksi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rekening11 rekening = new Rekening11();
        Transaksi11 transaksi = new Transaksi11();

        rekening.tambah(new Rekening11("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        rekening.tambah(new Rekening11("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        rekening.tambah(new Rekening11("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"));
        rekening.tambah(new Rekening11("16850711 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"));
        rekening.tambah(new Rekening11("16110205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"));

        transaksi.tambah(new Transaksi11(989609, 333823, 802752, null,"2022-02-01 01:13:11", "Active"));
        transaksi.tambah(new Transaksi11(297103, 396116, 779589, null,"2021-07-03 01:09:49", "Active"));
        transaksi.tambah(new Transaksi11(66190,  259150, 619774, null,"2021-09-09 03:57:30", "Active"));
        transaksi.tambah(new Transaksi11(234301, 278309, 547922, null,"2021-11-24 13:18:39", "Active"));
        transaksi.tambah(new Transaksi11(243306, 869468, 50283, null,"2021-03-12 03:40:16", "Active"));


        int pil = 0;
        while (true) {
            System.out.println("---------------------------");
            System.out.println("Sistem Informasi Perbankan ");
            System.out.println("---------------------------");
            System.out.println("1. Tampilkan Data Rekening");
            System.out.println("2. Tampilkan Data Transaksi");
            System.out.println("3. Mencari Saldo > 500000");
            System.out.println("4. Sorting By Name");
            System.out.println("5. Keluar");
            System.out.print( "Pilih (1-5) : ");
            pil = sc.nextInt();

            switch (pil) {
                case 1:
                    rekening.tampilRekening();
                    break;
                case 2:
                    Rekening11 jumData[] = rekening.getData();
                    transaksi.tampilData(jumData);
                    break;
                case 3:
                    Rekening11 jumData1[] = rekening.getData();
                    transaksi.showDataSaldoLessThan(500000, jumData1);
                    break;
                case 4:
                    Transaksi11 dataTra[] = transaksi.getData();
                    transaksi.updateData(rekening.sortByName(dataTra));
                    rekening.tampilRekening();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan Pilih Lagi.");
                    break;
            }
        }
        
    }
    
}
