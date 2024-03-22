public class MainHotel11 {
     public static void main(String[] args) {
        HotelService11 list = new HotelService11();
        Hotel11 m1 = new Hotel11("RedDors", "Malang", 250000, (byte)5);
        Hotel11 m5 = new Hotel11("Fifa-in", "Batu", 260000, (byte)3);
        Hotel11 m2 = new Hotel11("OYO", "Surabaya", 190000, (byte)4);
        Hotel11 m3 = new Hotel11("Fifa-out", "Kediri", 200000, (byte)1);
        Hotel11 m4 = new Hotel11("Shangrila", "Malang", 220000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}
