public class Rekening11 {
    String noRekening;
    String nama, namaIbu;
    String phone, email;

    public Rekening11 (String noRekening, String nama, String namaIbu,String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public Rekening11 () {

    }

    Rekening11[] getData(){
        return jumData;
    }

    public void tampilRekening() {

        System.out.println();
        System.out.println("No Rekening\t\tNama\t\tNama Ibu\t\tPhone\t\t\tEmail");
        for (Rekening11 e : jumData) {
            System.out.println(e.noRekening+"\t\t"+e.nama+"\t\t"+e.namaIbu+"\t\t"+e.phone+"\t\t"+e.email);
        }
            
        System.out.println();
    }

    Rekening11 jumData[] = new Rekening11[100];
    int idx;
    public void tambah(Rekening11 e) {
        
        if (idx < jumData.length) {
            jumData[idx] = e;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    Transaksi11[] sortByName(Transaksi11 dataTra[]) {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (jumData[j].nama.compareTo(jumData[minIdx].nama) < 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Rekening11 temp = jumData[i];
                jumData[i] = jumData[minIdx];
                jumData[minIdx] = temp;
               
                Transaksi11 tempTra = dataTra[i];
                dataTra[i] = dataTra[minIdx];
                dataTra[minIdx] = tempTra;
            }
        }
        
        return dataTra;
    }
}