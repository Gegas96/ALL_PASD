import java.util.Scanner;

public class ScavMain {
    public static void menu() {
        System.out.println("---------------------");
        System.out.println("Pilih Menu");
        System.out.println("---------------------");
        System.out.println("1. Tampilkan pertanyaan");
        System.out.println("2. Menjawab pertanyaan");
        System.out.println("3. Keluar");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();
        int pilihan;

        do {
            menu();
            System.out.print("Pilih 1/2/3: ");
            pilihan = gs.nextInt();
            switch (pilihan) {
                case 1:
                    linkedList.addLast("Nasi yang digoreng?", "nasigoreng");
                    linkedList.addLast("Kucing berkaki? (jawab dengan kata)", "empat");
                    linkedList.addLast("Ketan yang hitam?", "ketanhitam");
                    linkedList.print();
                    break;
                case 2:
                    linkedList.start();
                    break;
                case 3:
                    return;
            
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        } while (pilihan == 1 || pilihan == 2 || pilihan == 3);
    }
}
