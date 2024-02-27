public class BukuMain11 {
    public static void main(String[] args) {
        Buku11 bk1 = new Buku11();
        bk1.judul = "Today Ends Tomorow Comes";        
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku11 bk2 = new Buku11("Self Reward", "Mahera Ayesi", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku11 bukuGegas = new Buku11("Kenapa Ayam Menyeberang?", "Gegas", 7, 7, 71100);
        bukuGegas.tampilInformasi();
        bukuGegas.terjual(6);
        bukuGegas.hitungHargaTotal(6);
        bukuGegas.hitungDiskon(426600);
        bukuGegas.hitungHargaBayar(426600, 12);
        bukuGegas.gantiHarga(71000);
        bukuGegas.tampilInformasi();
    }
    
}
