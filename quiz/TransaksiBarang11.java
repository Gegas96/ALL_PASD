import java.util.Scanner;

public class TransaksiBarang11 {
    Scanner input = new Scanner(System.in);

    String pil = "";
    String kode;
    public TransaksiBarang11 (String kode){
        this.kode = kode;
    }
    public TransaksiBarang11 (){
    }

    Barang11 barang11 = new Barang11();
    public TransaksiBarang11[] inputTransaksi(TransaksiBarang11[] pembelian, Barang11[] data)
    {
        int counter = 1;

        System.out.println();
        System.out.print("Masukkan kode barang : ");
        kode = input.next();

        if(barang11.checkKode(kode, data)){
            pembelian[0] = new TransaksiBarang11(kode);
        }
        
        while(true){
            System.out.print("Apakah akan belanjan kembali (y/n) ? ");
            pil = input.next();
            if(pil.equalsIgnoreCase("y")){
                System.out.print("Masukkan kode barang :");
                kode = input.next();
                if(barang11.checkKode(kode, data)){
                    pembelian[counter] = new TransaksiBarang11(kode);
                    counter++;
                }
            }else{
                break;
            }
        }

        return pembelian;
    }
}