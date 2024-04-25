public class Transaksi11 {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type, noRekening;

    public Transaksi11 (double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String noRekening, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.noRekening = noRekening;
        this.type = type;

    }

    public Transaksi11() {

    }

    Transaksi11[] getData(){
        return jumData;
    }

    void updateData(Transaksi11 dataUpdate[])
    {
        jumData = dataUpdate;
    }

    void tampilData(Rekening11 data[]) {
        System.out.println();
        System.out.println("No Rekening\t\tSaldo\t\tSaldo Awal\t\tSaldo Akhir\t\tTanggal Transaksi");
        for (int i = 0; i < data.length; i++) {
            if (jumData[i] != null) {
                System.out.println(data[i].noRekening+"\t\t"+jumData[i].saldo+"\t"+jumData[i].saldoAwal+"\t\t"+jumData[i].saldoAkhir+"\t\t"+jumData[i].tanggalTransaksi);
            }
        }
        System.out.println();
    }

    Transaksi11 jumData[] = new Transaksi11[100];
    int idx;
    public void tambah(Transaksi11 f) {
        if (idx < jumData.length) {
            jumData[idx] = f;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void showDataSaldoLessThan(int threshold, Rekening11 dataCust[] ) {
        int min = threshold;
        System.out.println();
        System.out.println("Data Filter Saldo Kurang Dari" + min);
        System.out.println();
        System.out.println("No Rekening \t Saldo \t Saldo Awal \t Saldo Akhir \t Tanggal Transaksi");
        for (int i = 0; i < idx; i++) {
            if (jumData[i] != null && jumData[i].saldo < threshold) {
                System.out.println(dataCust[i].noRekening+"\t"+jumData[i].saldo+"\t"+jumData[i].saldoAwal+"\t"+jumData[i].saldoAkhir+"\t"+jumData[i].tanggalTransaksi);
            }
        }
    }
}
