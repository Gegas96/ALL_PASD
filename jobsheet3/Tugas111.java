public class Tugas111 {
    public double ipk, hitungIpk;
    public String nama, jk, nim;

    public Tugas111(String nama, String nim, String jk, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
        this.ipk = ipk;
    }
    
    public Tugas111()
    {
    }

    public void cetakInfo(Tugas111[] mahasiswa)
    {
        int i =1;
        for (Tugas111 mhs : mahasiswa) {
            hitungIpk += mhs.ipk;
        
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("Nama: " + mhs.nama);
            System.out.println("Nim: " + mhs.nim);
            System.out.println("Jenis kelamin: " + mhs.jk);
            System.out.println("IPK: " + mhs.ipk);
            System.out.println();
            i++;
        }
        System.out.println("Rata-rata IPK : "+ rerataIpk(hitungIpk, mahasiswa.length));
    }

    public double rerataIpk(double ipk, int mhs)
    {
        double rerata;
        rerata = ipk/Double.valueOf(mhs);
        return rerata;
    }

}