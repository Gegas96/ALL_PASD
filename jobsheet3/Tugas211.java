public class Tugas211 {
    public String tipePembayaran, tanggalPembayaran, tipekamar;
    public int jumlahHari, totalPembayaran, hargaKamar;

    public Tugas211 (String tipePembayaran, String tanggalPembayaran, String tipeKamar, int jumlahHari, int hargaKamar ) {
        this.tipePembayaran = tipePembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
        this.tipekamar = tipeKamar;
        this.jumlahHari = jumlahHari;
        this.hargaKamar = hargaKamar;
    }
    
    public Tugas211() {

    } 
    
    void cetakInfo (Tugas211[] pembayaran) {

        for (Tugas211 pby : pembayaran) {
            System.out.println("Tipe pembayaran: " + pby.tipePembayaran);
            System.out.println("Tanggal pembayaran: " + pby.tanggalPembayaran);
            System.out.println("Tipe kamar: " + pby.tipekamar);
            System.out.println("Harga kamar: " + pby.hargaKamar);
            System.out.println("Jumlah hari: " + pby.jumlahHari);
            System.out.println("Total pembayaran: " + total(pby.jumlahHari, pby.hargaKamar));
            System.out.println();
            
        }
        
    }

    public int total(int jumlahHari, int hargaKamar ) {

        int totalHarga;
        totalHarga = jumlahHari * hargaKamar;
        return totalHarga;
    }


}


