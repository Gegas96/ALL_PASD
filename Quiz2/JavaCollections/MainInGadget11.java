import java.util.Scanner;

public class MainInGadget11 {
    public static void main(String[] args) {
        ListInGadget11 list = new ListInGadget11();

        list.add(new InGadgetColle11("PRD01", "Sumsang S71", 7000000));
        list.add(new InGadgetColle11("PRD02", "Ooixa 257", 9000000));
        list.add(new InGadgetColle11("PRD03", "Qooi 12", 4200000));
        list.add(new InGadgetColle11("PRD04", "Nolevo i7", 8000000));
        list.add(new InGadgetColle11("PRD05", "Oddo 5A", 2000000));

        Scanner gs = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("                   Menu  [InGadget]        ");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Tambah List");
            System.out.println("2. Hapus List");
            System.out.println("3. Cari List");
            System.out.println("4. Tampilkan Semua List ");
            System.out.println("5. Tampilkan Harga dari termurah");
            System.out.println("6. Keluar");
            System.out.println("----------------------------------------------------");

            System.out.print("Pilih Menu : ");
            pilihan = gs.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Produk   : ");
                    String id = gs.next();
                    System.out.print("Nama Produk : ");
                    String item = gs.next();
                    System.out.print("Harga Produk        : ");
                    double harga = gs.nextDouble();
                    gs.nextLine();
                    list.add(new InGadgetColle11(id, item, harga));
                    break;
                case 2:
                    System.out.print("ID Produk   : ");
                    id = gs.next();
                    list.delete(id);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("ID Produk   : ");
                    id = gs.next();
                    InGadgetColle11 produk = list.get(id);
                    if (produk != null) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println(produk);
                        System.out.println("-------------------------------------------------------");
                    } else {
                        System.out.println("Produk tidak ditemukan!");
                    }
                    break;
                case 4:
                    list.printAll();
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    list.sortAsc();
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 6);

        gs.close();
    }
}