public class Pembelian11 {
    
    TransaksiBarang11 transaksiBarang11 = new TransaksiBarang11();

    public void pembelian(TransaksiBarang11[] pembelian, Barang11[] data)
    {
        System.out.println();
        System.out.println("====================");
        System.out.println("Daftar Pembelian");
        System.out.println("====================");
        System.out.println("Kode\t\tNama\t\tHarga\t\tStok");

        for(int i=0; i<pembelian.length; i++){
            for(int j=0; j<data.length; j++){
                if(pembelian[i] != null){
                    if(pembelian[i].kode.equalsIgnoreCase(data[j].kode)){
                        System.out.println(data[j].kode+"\t\t"+data[j].nama+"\t\t"+data[j].harga+"\t\t"+data[j].stok);
                    }
                }
            }
        }


    }
}