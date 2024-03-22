public class Main11 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi11 list = new DaftarMahasiswaBerprestasi11();
        Mahasiswa11 m1 = new Mahasiswa11("Nusa", 2017, 25, 3);
        Mahasiswa11 m2 = new Mahasiswa11("Rara", 2012, 19, 4);
        Mahasiswa11 m3 = new Mahasiswa11("Dompu", 2018, 19, 3.5);
        Mahasiswa11 m4 = new Mahasiswa11("Abdul", 2017, 23, 2);
        Mahasiswa11 m5 = new Mahasiswa11("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }    
}
