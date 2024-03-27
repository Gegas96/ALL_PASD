public class PencarianMhs11 {
    Mahasiswa11 listMhs[];
    int idx;
    public PencarianMhs11(int jumMhs) {
        listMhs = new Mahasiswa11[jumMhs];
    }

    void tambah(Mahasiswa11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa11 m : listMhs) {
            m.tampil();
            System.out.println("-------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right, int count) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = listMhs[mid].nama.compareTo(cari);

            if (comparison < 0) {
                return FindBinarySearch(cari, mid + 1, right, count);
            } else if (comparison > 0) {
                return FindBinarySearch(cari, mid - 1, left, count);
            } else {
                return mid;
            }
            
        }
        return -1;
    }

    public void countSearchName(String cari) {
        int count = 0;
        for(int i=0; i<listMhs.length; i++){
            if(cari.equalsIgnoreCase(listMhs[i].nama)){
                count += 1;
            }
        }

        if (count > 1) {
            System.out.println("Data yang ditemukan lebih dari 1");
            return;
        }
    }

    public void TampilposisiNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilDataNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);

        } else {
            System.out.println("data " + x + "tidak ditemukan");

        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t :" + x);
            System.out.println("Nama\t :" + listMhs[pos].nama);
            System.out.println("Umur\t :" + listMhs[pos].umur);
            System.out.println("IPK\t :" + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    
}
