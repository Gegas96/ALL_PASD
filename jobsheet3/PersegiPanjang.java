public class PersegiPanjang {
    public int panjang;
    public int lebar;


    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
        
    }

   public PersegiPanjang() {

   }

    void cetakInfo(PersegiPanjang[] arrayOfPersegiPanjang) {
        for (int i = 0; i < arrayOfPersegiPanjang.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang[i].panjang, arrayOfPersegiPanjang[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang[i].panjang, arrayOfPersegiPanjang[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i]. lebar +", luas: "+ luas+ ", keliling: "+keliling );
        }
    }

    int hitungLuas(int p, int l) {
    int luas = p * l;
    return luas;
    }

    int hitungKeliling(int p, int l) {
    int keliling = 2 * (p+l);
    return keliling;
    }
    

}

