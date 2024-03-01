import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan banyak persegi yang ingin dihitung: ");
        length = sc.nextInt();

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[length];
       int panjang, lebar; 


        for (int i = 0; i < 3; i++) {
            

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
            
        }
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.cetakInfo(arrayOfPersegiPanjang);
        sc.close();
    } 
}
